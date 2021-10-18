package P2;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pessoa1";

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.nome = "Pessoa Fisica 1";
        pessoaFisica1.cpf = "1563156315";
  
        Pessoa pessoa2 = pessoaFisica1;
        Object obj2 = pessoaFisica1;

        imprimir(obj1);

        imprimir(pessoa1);
        imprimir(pessoa2);

        int soma = 10 + 10;
        String nome = "Maykon" + "Granemann";
        
        //imprimir(pessoaFisica1);

        
    }
    public static void imprimir(Object obj){        
        System.out.println(obj.toString());
    }
}
