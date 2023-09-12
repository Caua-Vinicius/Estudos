public class Cliente {
    public int id_cliente;
    public String cpf;
    public String nomeCliente;
    public String endereco;
    public String dataNascimento;
    public float renda;
    public Conta conta;


    public void infoCliente(){

        System.out.println("Nome: " +getNomeCliente());
        System.out.println("Cpf: " +getCpf());
        System.out.println("Data de Nascimento: " +getDataNascimento());
        System.out.println("Endereco: " +getEndereco());
        System.out.println("IdCliente: " +getId_cliente());
        System.out.println("Renda: " +getRenda());
        this.conta.infoConta();
        
    }



    // Setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setRenda(float renda) {
        this.renda = renda;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    // Getters

    public String getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public float getRenda() {
        return renda;
    }
    public Conta getConta() {
        return conta;
    }
}
