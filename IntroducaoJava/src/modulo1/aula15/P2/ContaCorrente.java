package P2;

public class ContaCorrente extends Conta{
    private double taxaTransferencia = 10;

    @Override
    public void transferencia(double valorTransferencia) {        
        super.transferencia(valorTransferencia);
        double novoSaldo =  this.getSaldo() - taxaTransferencia;
        this.setSaldo(novoSaldo);
    }
}
