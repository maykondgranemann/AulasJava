package modulo1.aula4;

import java.util.Scanner;

public class a4_1_EstruturaDecisaoIfElse {

    public static void main(String[] args) {
        boolean verdade = true; //1 - com sinal eletrico -  pulso eletrico
        boolean falso = false; //0 -  sem sinal eletrico -

        int n1 = 5;
        int n2 = 5;

        if(n1 > n2){
            System.out.println("Maior");
        }else if(n1 < n2){
            System.out.println("Menor");
        }else{
            System.out.println("Igual");
        }
    }
}
