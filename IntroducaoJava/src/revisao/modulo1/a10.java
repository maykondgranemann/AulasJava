package modulo1;

import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        byte idade = Byte.parseByte(sc.nextLine());

        while(idade < 0){
            System.out.println("Idade nao pode ser negativa!\nDigite novamente: ");
            idade = Byte.parseByte(sc.nextLine());
        }

        System.out.println("========== Obrigado ===========");
    }
}
