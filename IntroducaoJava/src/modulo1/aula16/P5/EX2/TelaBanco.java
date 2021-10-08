package P5.EX2;
/*
    Crie uma classe Tela Banco que contenha um método main.
    Crie um objeto da classe Conta Corrente, 
    insira as informações no construtor, 
    realize um saque, 
    um depósito 
    imprima saldo, taxa saque e codigo de cliente usando toString;
 */

public class TelaBanco {
    public static void main(String[] args) {
       ContaCorrente cc = new ContaCorrente(1000, "15315Ab"); 

       cc.saque(10);
       cc.deposito(600);

       System.out.println(cc);
    }
}
