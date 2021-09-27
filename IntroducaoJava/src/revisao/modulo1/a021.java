package modulo1;

import java.util.Scanner;

public class a021 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido;
        do{
            
            System.out.println("Digite um numbro:");
            int numero = Integer.parseInt(sc.nextLine());

            valido = validar_numero(numero);
            if(!valido){
                System.out.println("Invalido");
            }
            
        }while(!valido);
        
        sc.close();;
   } 

   static boolean validar_numero(int n){
        boolean valido;
        if(n < 0){
            valido = false;
        }
        else{
            valido = true;
        }
        return valido;
   }
}
