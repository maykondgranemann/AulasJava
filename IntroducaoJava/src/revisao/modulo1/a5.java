package modulo1;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String linha = sc.nextLine(); /// le uma linha inteira
        System.out.println("Foi lido : " + linha);

        String linha2 = sc.next(); // le ate o proximo espaco
        System.out.println("Foi lido 2 : " + linha2);

        String linha3 = sc.nextLine();
        System.out.println("Foi lido 3 : " + linha3);

        int n1 = sc.nextInt(); // le um numero inteiro ate o espaco ou enter
        System.out.println("Foi lido 4 : " + n1);

        int n2 = Integer.parseInt(sc.nextLine()); //solucao para ler uma linha e pegar a parte numerica    
        System.out.println("Foi lido 5 : " + n2);

        double sal1 = Double.parseDouble(sc.nextLine());
        float sal2 = Float.parseFloat(sc.nextLine());
    }
}
