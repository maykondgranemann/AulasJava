package modulo1.aula4;

import java.util.Scanner;

public class a4_3_SwitchCaseExemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cadastro de clientes");
        System.out.println("\t 1 -Cadastrar");
        System.out.println("\t 2 -Listar");
        System.out.println("\t 0 -Sair");
        System.out.print("\t\nEscolha um opção do menu:");

        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Castrar clientes");
                break;
            case 2:
                System.out.println("Listar clientes");
                break;
            case 0:
                System.out.println("Saindo ...");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

    }
}
