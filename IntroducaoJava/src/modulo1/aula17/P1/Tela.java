package P1;

public class Tela {
    public static void main(String[] args) {    

        ContaCorrente cc1 = new ContaCorrente(150.60, "cp9898-9");
        System.out.println(cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca("cpa15165"); 
        cp1.deposito(150.00);     
        System.out.println(cp1.getSaldo());


        System.out.println(cc1);
        System.out.println(cp1);
    }
}
