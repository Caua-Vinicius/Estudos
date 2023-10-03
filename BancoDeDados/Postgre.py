import psycopg2
import numpy as np

conn = psycopg2.connect(host ='localhost', dbname = 'nova_roma',user = 'postgres', password = '1234', port = '3306')

cursor = conn.cursor()

# Functions 

def addProfessor(name, age):
    cursor.execute("""INSERT INTO professor (nome, idade) VALUES ('%s', %s);""", (name, age))
    


#SqlCommands


#Creating table profesor in the DataBase


cursor.execute("""CREATE TABLE IF NOT EXISTS professor (
    id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    nome VARCHAR(200),
    idade VARCHAR(3)
);
""")



# Selectin all rows in Database and printing then, also using NUMPY for transforming tuples in Array
cursor.execute("""SELECT * FROM professor
""")

array_np = np.array(cursor.fetchall())

for row in array_np: print(row)

#for row in cursor.fetchall(): print(row)


#closing the connection with the database postgre
conn.commit()

cursor.close()
conn.close()