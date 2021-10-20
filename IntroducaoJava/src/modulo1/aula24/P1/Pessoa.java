package P1;

public class Pessoa{
    public String nome;
    public String sobrenome;
    public byte idade;

    @Override
    public boolean equals(Object obj) {  
              
        if(obj instanceof Pessoa){
            Pessoa outra = (Pessoa)obj;
            if( this.nome.equals(outra.nome) && this.sobrenome.equals(outra.sobrenome) && this.idade == outra.idade){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String retorno = this.nome +";"+ this.sobrenome +";"+ this.idade;
        return retorno;
    }
}