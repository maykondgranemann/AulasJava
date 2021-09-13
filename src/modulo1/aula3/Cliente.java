package modulo1.aula3;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================ Cadastro de clientes ===================\n");
        System.out.println("\tBem-Vindo, Digite as informacoes do cliente.");
        System.out.print("\tDigite o nome do cliente: ");
        String nome = sc.next();
        System.out.print("\tDigite a idade do cliente: ");
        short idade = sc.nextShort();
        System.out.printf("\tO cliente %s de idade %d foi cadastrado com sucesso!\n",nome, idade);
    }
}
