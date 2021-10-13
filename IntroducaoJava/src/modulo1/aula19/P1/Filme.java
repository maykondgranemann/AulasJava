package P1;

public class Filme {
    public String titulo;
    public int anoLancamento;
    public String genero;

    @Override
    public boolean equals(Object obj) {
        Filme outro = (Filme)obj;
        
        if(this.titulo == outro.titulo && this.anoLancamento == outro.anoLancamento && this.genero == outro.genero){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        
        return this.titulo + ";" 
                + this.anoLancamento + ";"
                + this.genero;
    }
}
