
public class Pessoa{
    public String Nome;
    private String CPF;
    public String Cor;



    public void info(){
        System.out.printf("Nome: "+getNome()+"\nCpf: "+getCPF()+"\nCor:"+getCor());
        
    }
    // Pessoa (String name, String cpf, String cor){
    //     setCPF(cpf);
    //     setCor(cor);
    //     setNome(name);
    // }
    
    
    // Getters
    public String getNome() {
        return Nome;
    }
    public String getCPF() {
        return CPF;
    }
    public String getCor() {
        return Cor;
    }
    
    // Setters
    public void setCPF(String cPF) {
        this.CPF = cPF;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public void setCor(String cor) {
        this.Cor = cor;
    }
}
