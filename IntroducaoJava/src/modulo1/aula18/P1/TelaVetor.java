package P1;

public class TelaVetor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNomeCompleto("Inês Brasil");

        Pessoa p2 = new Pessoa();
        p2.setNomeCompleto("Joelma Calypso");

        Pessoa p3 = new Pessoa();
        p3.setNomeCompleto("Michael Douglas");

        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;

        for (int i = 0; i< pessoas.length; i++) {
            System.out.printf("\nImprindo pessoa %d: %s", i, pessoas[i].getNomeCompleto());
        }

    }
}
