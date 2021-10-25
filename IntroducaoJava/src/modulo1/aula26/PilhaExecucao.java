import java.util.Scanner;

public class PilhaExecucao {
    public static void main(String[] args) {
        System.out.println("Entrando na main...");
        metodo1();               
        System.out.println("Saindo na main...");
    }

    public static void metodo1(){
        System.out.println("Entrando no metodo 1...");
        metodo2();        
        System.out.println("Saindo do metodo 1...");
    }

    public static void metodo2(){
        System.out.println("Entrando no metodo 2...");
        int idade=0;
        do{
            try{
                System.out.println("Digite sua idade");
                Scanner sc = new  Scanner(System.in);
                idade  = Integer.parseInt(sc.nextLine());

                if(idade < 0 || idade > 150){                    
                    throw new IllegalArgumentException("Idade invalida! Deve ser maior que zero e menor que 150!");
                }
            }
            catch(NumberFormatException ex){
                System.out.println("Dado invalido!Preencha novamente");
                idade =-1;
            }  
            catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage() + " Preencha novamente");
                idade =-1;
            }

        }while(idade == -1);
        System.out.println("Saindo do metodo 2...");
    }
}
