package modulo1.aula10;

import java.util.Scanner;

public class a10_1_metodos {
    public static void main(String[] args) {
        double num1, num2;

        num1 = ler_numero();
        num2 = ler_numero();

        double r_soma = somar(num1, num2);
        double r_subt = subtrair(num1, num2);
        double r_mult = multiplicar(num1, num2);
        double r_divi = dividir(num1, num2);

        // === Apresentação dos resultados
        imprimir_resultado("soma", r_soma);
        imprimir_resultado("subtração", r_subt);
        imprimir_resultado("divisão", r_divi);
        imprimir_resultado("multiplicação", r_mult);
    }
    static void imprimir_resultado(String nome_operacao, double resultado){
        System.out.printf("\nO resultado da %s é %.2f",nome_operacao, resultado);
    }
    static double ler_numero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = Double.parseDouble(sc.nextLine());
        return num;
    }

    static double somar(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }
    static double subtrair(double n1, double n2){
        double resultado = n1 - n2;
        return resultado;
    }
    static double multiplicar(double n1, double n2){
        double resultado = n1 * n2;
        return resultado;
    }
    static double dividir(double n1, double n2){
        double resultado = n1 / n2;
        return resultado;
    }
}
