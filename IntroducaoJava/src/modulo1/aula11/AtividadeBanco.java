import java.util.Scanner;

public class AtividadeBanco {
    static Scanner sc = new Scanner(System.in);
    static CalculadoraTaxas calcTaxas = new CalculadoraTaxas();
    static double taxasTransferencia = 0;
    static double taxasSaques = 0;

    public static void main(String[] args) {
        boolean continua;
        do{        
            int op = menu();
            opcoesMenu(op);
            continua = retornaMenu();
        }while(continua);
        System.out.printf("\nO valor de todas as taxas cobradas foi de %.4f, sendo %.4f de transferencias e %.4f de saques\n",
            taxasTransferencia + taxasSaques, taxasTransferencia, taxasSaques);
        System.out.println();

    }
    static boolean retornaMenu(){
        boolean resposta = false;
        char resposta_continua;

        do{
            System.out.println("Deseja voltar ao menu? (S/N)");
            resposta_continua = sc.nextLine().toUpperCase().charAt(0);
            
            if(resposta_continua == 'S'){
                resposta = true;
            }
            else if(resposta_continua == 'N'){
                System.out.println("Até mais !!!");
            }
            else{
                System.out.println("Opção invalida! Digite (S/N)!");
            }
        }while(resposta_continua != 'S' && resposta_continua != 'N');

        return resposta;
    }
    static void opcoesMenu(int opcao){
        switch(opcao){
            case 1:
                System.out.println("============= Transferencias ===============");
                double taxaT = transferencia();
                taxasTransferencia += taxaT;
                System.out.printf("O valor da taxa de transferencia foi %.4f\n\n", taxaT);
            break;
            case 2:
                System.out.println("============= Saques ============= ");
                double taxaS = saque();
                taxasSaques += taxaS;
                System.out.printf("\nO valor da taxa de saque foi  %.2f\n\n", taxaS);
            break;
        }
    }
    static int menu(){ 
        int opcao;
        do{
            System.out.println("\n=========== Calculadora de taxas ============\n");
            System.out.println("\t1 - Taxa Transferencia\n\t2 - Taxa Saque");
            System.out.println("===============================================");
            System.out.print("Escolha uma opcao do menu: ");
            opcao = Integer.parseInt(sc.nextLine()); 
            if(opcao <1 || opcao >2){
                System.out.println("Opcao invalida. Digite novamente.");
            }
        } while(opcao <1 || opcao >2);      

        return opcao;      
    }
    static double transferencia(){
        System.out.print("Digite o valor a ser transferido: ");
        double valor  = Double.parseDouble(sc.nextLine());
        double taxaT = calcTaxas.calculaTaxaTransferencia(valor);
        return taxaT;
    }

    static double saque(){
        System.out.print("Digite o valor a ser sacado: ");
        double valor  = Double.parseDouble(sc.nextLine());
        double taxaS = calcTaxas.calculaTaxaSaque(valor);
        return taxaS;
    }
}
