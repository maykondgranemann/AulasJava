public class CalculadoraTaxas {
    private double taxaTransferencia = 0.00001;
    
    public double calculaTaxaTransferencia(double valor){
        double valorTaxa = valor * taxaTransferencia;
        return valorTaxa;
    }
}
