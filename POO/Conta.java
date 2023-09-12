public class Conta {
    long numero;
    double saldo;
    double limite;

    public Conta(long numero, double saldo, double limite){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void infoConta(){
        System.out.println("Numero da conta: "+ getNumero());
        System.out.println("Saldo da conta: "+ getSaldo());
        System.out.println("Limite da conta: "+getLimite());
    }

    // GETTERS
    public double getLimite() {
        return limite;
    }
    public long getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    // SETTERS
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
