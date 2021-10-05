
public class PessoaJuridica extends Pessoa{
    private String nome_fantasia;    
    private String ie;
    private String cnpj;

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }
    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    public String getIe() {
        return ie;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
}
