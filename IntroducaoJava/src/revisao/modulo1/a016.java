package modulo1;

import java.util.Scanner;

public class a016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = Integer.parseInt(sc.nextLine());   

        switch (opcao) {
            case 1:
                System.out.println("Cadastrando");
                break;
            case 2:
                System.out.println("Alterando");
                break;  
            case 3:
                System.out.println("Listando");
                break;
            default:
                System.out.println("Opcao nao prevista");
        }

        sc.close();
    }
}
