package P1;

public class MainEqualsObject {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "Poderoso chefao";
        f1.anoLancamento = 1999;
        f1.genero = "Crime";

        Filme f2 = f1;        
        f1.titulo = "Titanic";

        System.out.println(f1.titulo);
        System.out.println(f2.titulo);

        boolean igual = f1.equals(f2);
        System.out.println(igual);
    }
}
