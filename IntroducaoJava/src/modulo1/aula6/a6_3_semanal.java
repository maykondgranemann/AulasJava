package modulo1.aula6;

import java.util.Scanner;

public class a6_3_semanal {
    public static void main(String[] args) {
        String nome = "";
        Scanner sc = new Scanner(System.in);

        boolean dado_valido = true;
        do{
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            if(nome.length() < 3){
                System.out.println("Xoven, digitastes erado");
                dado_valido = false;
            }
        }while(!dado_valido);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        while(nome.length() <3){
            System.out.println("Xoven, digitastes erado. Digite novamente");
            nome = sc.nextLine();
        }

        do{
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            if(nome.length() < 3){
                System.out.println("Xoven, digitastes erado");
            }
        }while(nome.length() < 3);

    }
}
