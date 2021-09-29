package modulo1;

import java.util.Scanner;

public class a023 {

    public static void main(String[] args) {
        int n;
        do{
            n = ler("Digite um numero: ");
        }while(!valida_positivos(n));

        do{
            n = ler("Digite uma opção do menu: ");
        }while(!validad_menu(n));
    }
    static int ler(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int dado = Integer.parseInt(sc.nextLine());    
        return dado;
    }
    static boolean valida_positivos(int numero){
        if(numero < 0){
            System.out.println("O numero nao pode ser negativo! Digite novamente.");
            return false;
        }
       return true;
    }
    static boolean validad_menu(int numero){
        if(numero < 0 || numero > 5){
            System.out.println("A opção é inválida! Digite novamente.");
            return false;
        }
       return true;
    }
}