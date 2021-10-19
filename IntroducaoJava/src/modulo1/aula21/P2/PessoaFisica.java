package P2;

public class PessoaFisica extends Pessoa{
    public String cpf;

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Pessoa Física");
    }

    public void Ler(){
        System.out.println("Lendo....");
    }
}
