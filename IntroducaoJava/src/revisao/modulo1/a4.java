package modulo1;

import java.math.BigDecimal;

public class a4 {
    public static void main(String[] args) {
        //float - Single Precision = 32bits = 1 sinal - 8 expoent 23 precisao
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        // System.out.println(minF);
        // System.out.println(maxF);

        //double - Double Precision = 1 sinal - 11 expoent 52 precisao
        double minD = Double.MIN_VALUE;
        double maxD = Double.MAX_VALUE;
        // System.out.println(minD);
        // System.out.println(maxD);
        
        float salario = 1998.89f;
        // double sal1 = 1998.89;        

        // Conversao implicita
        double valor = 8888.88f;        
        double valor2 = salario;

        System.out.println(salario);
        System.out.println(valor2);
    
    }
}
