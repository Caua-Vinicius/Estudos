import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();

        System.out.println("Digite sua idade: ");
        int age = input.nextInt(); 


        Pessoa Joshua = new Pessoa(name, age, 1.98, 89.0,"masculino");

        Joshua.pessoaInfo();

        input.close();
    }
}
