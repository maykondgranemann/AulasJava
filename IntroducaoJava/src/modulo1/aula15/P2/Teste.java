package P2;

public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setSaldo(1000); 
        c.transferencia(15);
        System.out.printf("\nSaldo apos tranferencia %.2f",c.getSaldo());

        ContaCorrente cc = new  ContaCorrente();
        cc.setSaldo(500);
        cc.transferencia(60);
        System.out.printf("\nSaldo apos tranferencia CC %.2f",cc.getSaldo());
    }
}
