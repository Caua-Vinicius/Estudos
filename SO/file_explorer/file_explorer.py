import os

#return the current directory using the method getcwd
current_directory = os.getcwd()

while True:

    # Simulating the same sintax of linux 
    command = input(f"{current_directory} $ ")

    # listing current directory path
    # startwith - return true if the first thing in the command is 'pwd' 
    if command.startswith("pwd"):
        print(current_directory)

    #checking all the files and dirs that exist in current_directory using listdir and also printing them
    elif command.startswith("ls"):
        files_and_folders = os.listdir(current_directory)
        print("\n".join(files_and_folders))

    # spliting the command in two( the command itself and the directory name), also making current directory plus new_directory in one to check if this new full directory exists, if exists this will be the new directory or not
    elif command.startswith("cd"):
        _, new_directory = command.split(" ", 1)
        new_directory = os.path.join(current_directory, new_directory)

        if os.path.exists(new_directory) and os.path.isdir(new_directory):
            current_directory = new_directory
        else:
            print(f"O diretório '{new_directory}' não existe.")


    # again spliting the command and making a path to the new folder. Checking if the path alredy exists and returning the creation of the new folder or not
    elif command.startswith("mkdir"):
        _, folder_name = command.split(" ", 1)
        new_folder_path = os.path.join(current_directory, folder_name)

        if not os.path.exists(new_folder_path):
            os.mkdir(new_folder_path)
        else:
            print(f"A pasta '{folder_name}' já existe.")

    # spliting the command and making a path, checking if exists, if so the dir will be removed, or not

    elif command.startswith("rm"):
        _, folder_name = command.split(" ", 1)
        folder_path = os.path.join(current_directory, folder_name)

        if os.path.exists(folder_path) and os.path.isdir(folder_path):
            os.rmdir(folder_path)
        else:
            print(f"A pasta '{folder_name}' não existe.")

    elif command.startswith("exit"):
        break

    else:
        print("Comando não reconhecido. Tente novamente.")
