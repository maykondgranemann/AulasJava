package P5.EX2;

/*
_ Crie uma classe Conta Corrente com os atributos privados: saldo, taxa saque e codigo de cliente.
_ Crie um método Construtor na classe Conta Corrente que receba o valor do saldo e do código do cliente;
_ Crie um método saque que recebe um valor double e que debita do saldo o valor mais a taxa de saque.
_ Crie um método depósito que recebe um valor double e soma ao valor do saldo.
_ Adicione um valor fixo ao atributo taxa saque;
*/
public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 2.50;
    private String codigoCliente;

    public ContaCorrente(double saldo, String codigoCliente){
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }
    
    public void saque(double valorSaque){
        this.saldo -= (valorSaque + this.taxaSaque);
    }
    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "\n\tsaldo: " + this.saldo + 
                "\n\tcod. Cliente: "  + this.codigoCliente +
                "\n\ttaxa saque: "  + this.taxaSaque;
    }
}
