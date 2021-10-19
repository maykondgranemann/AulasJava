public class Carro {
    public String marca;
    public String modelo;

    @Override
    public boolean equals(Object obj) {
        Carro outroCarro = (Carro)obj;
        if( this.marca.equals(outroCarro.marca) && this.modelo.equals(outroCarro.modelo) ){
            return true;
        }
        return false;
    }
}
