public class CalculadoraTaxas {
    private double taxaTransferencia = 0.00001;
    private double taxaSaque = 1.3;
    private int numeroSaques;
    
    public double calculaTaxaTransferencia(double valor){
        double valorTaxa = valor * taxaTransferencia;
        return valorTaxa;
    }

    public double calculaTaxaSaque(double valor){
        numeroSaques++;
        double valorTaxa = 0;

        if(numeroSaques % 5 == 0 ){
            valorTaxa = taxaSaque;
        }  
        return valorTaxa;
    }
}
