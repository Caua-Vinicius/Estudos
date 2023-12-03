public class Alunos{

    private String nome;
    private int matricula;

    // SETTERS E GETTERS

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    // CONSTRUTOR
    Alunos(String nome, int matricula){
        setMatricula(matricula);
        setNome(nome);
    }
}