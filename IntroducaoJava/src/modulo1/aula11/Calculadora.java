public class Calculadora {
    
    public int somar(int n1, int n2){   
        return n1 + n2;
    }
    
    public int subtrair(int n1, int n2){
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public int dividir(int n1, int n2){
        return n1 / n2;
    }

    private boolean valida(int n){
        if (n<0){
            return false;
        }
        return true;
    }
}
