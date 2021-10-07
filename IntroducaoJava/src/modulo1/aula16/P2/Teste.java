package P2;

public class Teste {
    public static void main(String[] args) {
        String nome = "Maykon";
        Pessoa p = new Pessoa(nome, "Granemann");
        p.setIdade(18);
        p.setNome("a");

        nome = p.getNome();
        String sobrenome = p.getSobrenome();
        int idade = p.getIdade();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
    }
}
