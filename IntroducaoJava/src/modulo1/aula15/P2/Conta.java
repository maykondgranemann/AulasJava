package P2;

public class Conta {
    private double saldo;
    
    public void transferencia(double valorTransferencia){
        saldo -= valorTransferencia;
        System.out.printf("\nTransferindo %.2f", valorTransferencia);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
