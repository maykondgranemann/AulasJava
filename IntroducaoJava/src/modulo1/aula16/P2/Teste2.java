package P2;

public class Teste2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("m1", "s1");
        System.out.println(p1.getNome());
        p1 = new Pessoa("m2", "s2");
        System.out.println(p1.getNome());
    }
}
