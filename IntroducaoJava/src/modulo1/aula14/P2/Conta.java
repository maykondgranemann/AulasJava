package P2;

public class Conta {
    private String agencia;
    private String numero;
    private double saldo;

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getAgencia() {
        return agencia;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
