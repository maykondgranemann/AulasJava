package modulo1;
import java.util.Scanner;

// Ler um valor N. FEITA
// Calcular e escrever seu respectivo fatorial. 
//  Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1

/// Exemplos
    //fatorial de 3 = 3*2*1 = 6
    //fatorial de 5 = 5*4*3*2*1 = 120

public class a15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(sc.nextLine());

        int fatorial = 1;

        for(int i = numero; i > 0; i--){
            System.out.printf("%d* ", i);
            fatorial = fatorial * i;
        }
        
        System.out.printf("=%d",fatorial);
        sc.close();
    }
}
