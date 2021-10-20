package P1;

public class Dados {
    private Object[] dados;
    private int posicao;

    public Dados(){
        this.dados = new Object[5];
    }
    public int numeroItens(){
        return posicao;
    }

    public void add(Object obj){
        verificaTamanhoArray();
        this.dados[posicao] = obj;
        posicao++;  
    }
    public void remove(Object obj){
        int indice = busca(obj);
        if(indice >=0){
            reorganizaArray(indice);
        }
    }
    public boolean existe(Object obj){
        int indice = busca(obj);
        if(indice >=0){
            return true;
        }
        return false;
    }
    private int busca(Object obj){
        for (int i = 0; i < dados.length; i++) {
            if(obj.equals(dados[i])){
                return i;
            }
        }
        return -1;
    }

    private void reorganizaArray(int pos){
        for (int i = pos; i < posicao; i++) {
            dados[i] = dados[i+1];
        }
        posicao--;
    }

    private void verificaTamanhoArray(){
        if(posicao >= this.dados.length){
            int novoTamanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTamanho];
            for (int i = 0; i < dados.length; i++) {
                dados2[i] =  dados[i];
            }
            dados = dados2;
        }   
    }
}
