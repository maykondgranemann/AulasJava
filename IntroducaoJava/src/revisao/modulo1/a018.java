package modulo1;

import java.util.Scanner;

public class a018{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        byte opcao;
        
        
        do{
            System.out.println("\n\n============== Cadastro de QQ ==================");
            System.out.println("\t1-Cadastro de produto");
            System.out.println("\t2-Cadastro de categoria");
            System.out.println("\t3-Cadastro de fornecedores");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine()); 

            switch(opcao){
                case 1:
                    produto();
                break;
                case 2:
                    categoria();
                break;
                case 3:
                    fornecedor();
                break;
                default:
                    nao_prevista();
                break; 
                        
            }            

        }while(opcao < 1 || opcao > 3 || valida_continua(opcao));

        sc.close();
    }

    static void nao_prevista() {
        System.out.println("O número digitado não esta entre as opções previstas");
    }

    static void produto(){
        System.out.println("Produto");
    }

    static void categoria(){
        System.out.println("Categoria");
    }

    static void fornecedor(){
        System.out.println("Fornecedores");
    }

    static boolean valida_continua(int opcao){
        char continua = 'N';
        boolean volta;
        if(opcao > 0 && opcao < 4 ){
            do{
                System.out.print("Para voltar digite V e para sair digite S:");
                continua = sc.nextLine().toUpperCase().charAt(0);    
            }while(continua!='V' && continua!='S');
        }

        if(continua!='V'){
            volta = true;
        }else{
            volta = false;
        }
        return volta;
    }
}