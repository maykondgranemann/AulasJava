package P5;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 =  new Pessoa();
        p1.setNome("Michael");
        p1.setSobrenome("Douglas");

        Funcionario f1 = new Funcionario();
        f1.setNome("Dyego");
        f1.setSobrenome("Granemann");

        
        System.out.println(p1);
        System.out.println(f1);
    }
}
