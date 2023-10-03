public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    String sexo;

    // SETTERS

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // GETTERS

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }public String getSexo() {
        return sexo;
    }

    // CONSTRUCTOR

    Pessoa(String nome, int idade, double altura, double peso, String sexo){
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setSexo(sexo);
    }

    // METHODS

    public double calcmc(){
        peso = getPeso();
        altura = getAltura();
        double resultado = peso/(altura*altura);
        return resultado;
    }

    public String resultadoImc(){
        double imc = this.calcmc();
        if (imc<= 18.5){return "Abaixo do peso normal";}
        if (25<imc & imc <=30){return "Acima do peso normal";}
        if (imc > 30){return "Obesa";}
        else{return "No Peso Normal";}
    }

    public void pessoaInfo(){
        System.out.println("O nome dessa pessoa e "+ getNome());
        System.out.println("A idade dessa pessoa e "+ getIdade());
        System.out.println("A altura dessa pessoa e "+ getAltura());
        System.out.println("O peso dessa pessoa e "+ getPeso());
        System.out.println("O sexo dessa pessoa e "+ getSexo());
        System.out.println("Essa pessoa esta " + resultadoImc());
    }
}
