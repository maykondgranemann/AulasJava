public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        
        System.out.println(cc1.saldo());
        cc1.depositar(1000);
        
        System.out.println(cc1.saldo());
        cc1.sacar(50);

        System.out.println(cc1.saldo());
    }
}
