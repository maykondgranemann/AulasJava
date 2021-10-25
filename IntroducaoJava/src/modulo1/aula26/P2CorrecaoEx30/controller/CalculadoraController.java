package P2CorrecaoEx30.controller;

import P2CorrecaoEx30.model.Calculadora;

public class CalculadoraController {
    
    public int soma(Calculadora calc){
        int result = calc.numero1 + calc.numero2;
        return result;
    }
    public int subtracao(Calculadora calc){
        int result = calc.numero1 - calc.numero2;
        return result;        
    }
    public int multiplicacao(Calculadora calc){
        int result = calc.numero1 * calc.numero2;
        return result;        
    }
    public double divisao(Calculadora calc){
        double result = (double)calc.numero1 / (double)calc.numero2;
        return result;        
    }
}
