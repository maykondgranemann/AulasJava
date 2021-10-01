public class AtividadeBanco {
    public static void main(String[] args) {
        CalculadoraTaxas calcTaxas = new CalculadoraTaxas();

        double taxaT1 = calcTaxas.calculaTaxaTransferencia(1000);
        double taxaT2 = calcTaxas.calculaTaxaTransferencia(500);

        double taxaS1 = calcTaxas.calculaTaxaSaque(50);
        double taxaS2 = calcTaxas.calculaTaxaSaque(150);
        double taxaS3 = calcTaxas.calculaTaxaSaque(500);
        double taxaS4 = calcTaxas.calculaTaxaSaque(900);
        double taxaS5 = calcTaxas.calculaTaxaSaque(600);
        double taxaS6 = calcTaxas.calculaTaxaSaque(1550);

        System.out.printf("Os valores de taxa de transferencia foram  %.4f e %.4f\n", taxaT1, taxaT2);

        System.out.printf("Os valores de taxa de saque foram  %.2f, %.2f, %.2f, %.2f, %.2f e %.2f\n", 
            taxaS1, taxaS2, taxaS3, taxaS4, taxaS5, taxaS6);

    }
}
