package modulo1;

import java.util.Scanner;

public class a017 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';
        
        do{
            System.out.println("\n\n============== Cadastro de QQ ==================");
            System.out.println("\t1-Cadastro de produto");
            System.out.println("\t2-Cadastro de categoria");
            System.out.println("\t3-Cadastro de fornecedores");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine()); 

            switch(opcao){
                case 1:
                    System.out.println("Produto");
                break;
                case 2:
                    System.out.println("Categoria");
                break;
                case 3:
                    System.out.println("Fornecedores");
                break;
                default:
                    System.out.println("O número digitado não esta entre as opções previstas");
                break; 
                        
            }

            if(opcao > 0 && opcao < 4 ){
                do{
                    System.out.print("Para voltar digite V e para sair digite S:");
                    continua = sc.nextLine().toUpperCase().charAt(0);    
                }while(continua!='V' && continua!='S');
            }

        }while(opcao < 1 || opcao > 3 || continua=='V');

        sc.close();
    }
}
