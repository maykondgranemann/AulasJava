package P2.models;

public class Pessoa{
    public int id;
    public String nome;
    public String sobrenome;
    public byte idade;

    @Override
    public boolean equals(Object obj) {  
              
        if(obj instanceof Pessoa){
            Pessoa outra = (Pessoa)obj;
            if( this.id == outra.id){
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