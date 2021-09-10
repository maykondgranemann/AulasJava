package modulo1.aula1;

import java.util.Scanner;

public class a1_1_console {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("O nome e sobrenome digitado foi: "+ nome +" "+ sobrenome);
    }
}
