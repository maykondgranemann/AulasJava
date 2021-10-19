package P2;

public class Main {
    public static void main(String[] args) {
        Object objeto = new Object();


        Pessoa pessoa = new Pessoa();
        PessoaFisica  pessoaFisica = new PessoaFisica();
        
        pessoa.imprimir();
        // pessoaFisica.imprimir();

        Pessoa pessoa2 = pessoaFisica;
        pessoa2.imprimir();

        Object objeto1 = pessoa;
        Object objeto2 = pessoaFisica;
    }
}
