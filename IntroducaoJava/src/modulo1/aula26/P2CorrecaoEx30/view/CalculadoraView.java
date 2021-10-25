package P2CorrecaoEx30.view;

import java.util.Scanner;

import P2CorrecaoEx30.controller.CalculadoraController;
import P2CorrecaoEx30.model.Calculadora;

public class CalculadoraView {
    public static void main(String[] args) { 
        boolean continua = true;
        do{
            imprimeMenu();
            int opcao = lerNumero();
            opcoesMenu(opcao);
            
            continua =  continuarMenu();

        }while(continua);
    }

    private static boolean continuarMenu(){
        boolean continua =true;
        boolean valido;
        Scanner sc = new Scanner(System.in);

        do{
            
            System.out.println("\nDeseja continuar?(S/N)");
            try{
                char resposta = sc.nextLine().toUpperCase().charAt(0);
                if(resposta == 'S' || resposta == 'N'){
                    if(resposta == 'S'){
                        continua = true;
                    }
                    else{                        
                        continua = false;
                    }
                }
                else{
                    throw new IllegalArgumentException("O valor deve ser apenas S ou N");
                }
                valido = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                valido = false;
            }
        }while(!valido);

        return continua;
    }

    private static void imprimeMenu(){
        System.out.println("===== Calculadora =====");
        System.out.println("Menu:");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.print("Digite uma opção do menu:");
    }

    private static int lerNumero(){
        Scanner sc = new Scanner(System.in);
        int numero=0;
        boolean valido;
        do{
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.O valor deve ser um número inteiro");
                System.out.print("Digite novamente:");
                valido = false;
            }
        }while(!valido);   
        return numero;
    }

    private static void opcoesMenu(int opcao){
        double resultado = 0;
        Calculadora calc = new Calculadora();
        CalculadoraController calcController = new CalculadoraController();
         
        System.out.print("Digite o numero 1:");  
        calc.numero1 = lerNumero();

        boolean valido = true;
        do{
            System.out.print("Digite o numero 2:");  
            calc.numero2 = lerNumero();

            if(opcao == 4)/// divisao
            {    
                try {
                    validaZeroDivisao(calc.numero2);
                    valido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage()+ " Digite novamente");
                    valido = false;
                } 
            }
        }while(!valido);

        switch(opcao){
            case 1:
                resultado = calcController.soma(calc);
            break;
            case 2:
                resultado = calcController.subtracao(calc);
            break;
            case 3:
                resultado = calcController.multiplicacao(calc);
            break;
            case 4:
                resultado = calcController.divisao(calc);
            break;
        }
        if(opcao == 4){
            System.out.printf("O resultado da operação é %f", resultado);
        }
        else{
            System.out.printf("O resultado da operação é %.0f", resultado);
        }
    }

    private static void validaZeroDivisao(int numero){
        if(numero == 0){
            throw new IllegalArgumentException("O divisor não pode ser zero!");
        }
    }
}
