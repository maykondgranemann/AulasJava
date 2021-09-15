package modulo1.aula5;


import java.util.Scanner;

public class a5_1_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        do{
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            if( nome.length() < 5 ){
                System.out.println("O nome deve ter mais que 5 caracteres");
                System.out.println("Digite novamente o nome");
            }
            else{
                invalido = false;
            }
        }while(invalido);


    }
}
