package P4_EX;

public class Coordenador extends Funcionario{
    private String cursoCoordenado;
    private double bonus;

    public void setCursoCoordenado(String cursoCoordenado) {
        this.cursoCoordenado = cursoCoordenado;
    }
    public String getCursoCoordenado() {
        return cursoCoordenado;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }    
}
