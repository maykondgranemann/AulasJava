package modulo1;

import java.util.Scanner;

public class a019 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imprimir_mensagem(); 
        int n1 = 20;
        int n2 = 50;
        
        somar(n1, n2); 
        somar(30, 81);   
        nome_idade("Bradesco", 115);  
        
        sc.close();  
    }

    static void imprimir_mensagem()
    {
        System.out.println("Olá");
    }

    static void somar(int n1, int n2){
        int soma = n1 + n2;
        System.out.println(soma);
    }

    static void nome_idade(String nome, int idade){
        System.out.printf("O nome é %s e a idade %d", nome, idade);
    }
}
