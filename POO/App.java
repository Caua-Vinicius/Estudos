public class App {
    public static void main(String[] args) {
        // Pessoa caua =  new Pessoa();
        // caua.setNome("Caua Vinicius");
        // caua.setCPF("111.111.111-11");
        // caua.setCor("Branco transparente");
        // caua.info();


        // Gato gato = new Gato();

        // gato.Idade = 1;
        // System.out.println(gato.Idade);

        Cliente joao = new Cliente();
        
        joao.setId_cliente(123);
        joao.setNomeCliente("Joao gay da o toba");
        joao.setEndereco("Rua Balaco baco");
        joao.setRenda(1000);
        joao.setCpf("111.111.111-11");

        joao.info();

        
    }
}
