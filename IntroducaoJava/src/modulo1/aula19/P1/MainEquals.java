package P1;

public class MainEquals {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "Poderoso chefao";
        f1.anoLancamento = 1999;
        f1.genero = "Crime";

        Filme f2 = new Filme();
        f2.titulo = "Poderoso chefao";
        f2.anoLancamento = 1999;
        f2.genero = "Suspense";

        boolean igual = f1.equals(f2);
        System.out.println(igual);
    }
}
