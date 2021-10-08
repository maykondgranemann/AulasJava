package P5.EX3;

/**
  Crie uma classe Calculadora.
    um método soma que recebe dois parâmetros inteiros e retorna um inteiro com o resultado.
    um método soma que recebe dois parâmetros double e retorna um double com o resultado.
    um método soma que recebe três parâmetros float e retorna um float com o resultado.
    um método soma que recebe três parâmetros long e retorna um long com o resultado.
 */

public class Calculadora {
    
    public int soma(int n1, int n2){        
        return n1 + n2;
    }
    public double soma(double n1, double n2){
        return n1 + n2;
    }
    public float soma(float n1 ,float n2, float n3){
        return n1 + n2 + n3;
    }
    public long soma(long n1 ,long n2, long n3){
        return n1 + n2 + n3;
    }
}
