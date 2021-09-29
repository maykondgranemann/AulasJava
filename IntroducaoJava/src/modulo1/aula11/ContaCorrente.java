public class ContaCorrente {
    private double saldo;

    public void depositar(double valor){
        saldo += valor; 
    }

    public double sacar(double valor){
        saldo -= valor;
        return valor;
    }

    public double saldo(){
        return saldo;
    }
}
