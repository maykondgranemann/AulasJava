package P5;

public class Funcionario extends Pessoa {
    private double salario;
    private double departamento;  


    public void setSalario(double salario) {
        
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setDepartamento(double departamento) {
        this.departamento = departamento;
    }
    public double getDepartamento() {
        return departamento;
    }
    
}
