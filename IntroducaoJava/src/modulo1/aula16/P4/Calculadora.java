package P4;

public class Calculadora {
    
    public double soma(double v1, double v2){
        System.out.println("Soma com 2 doubles");
        return v1 + v2;
    }
    public double soma(double v1, double v2, double v3){
        System.out.println("Soma com 3");
        return v1 + v2 + v3;
    }

    public double soma(int v1, int v2){
        System.out.println("Soma com 2 ints");
        return v1 + v2;
    }

    public double soma(String v1, String v2){
        System.out.println("Soma com 2 Strings");
        return Double.parseDouble(v1) + Double.parseDouble(v2);
    }

    public String soma(String v1, String v2, String v3){
        System.out.println("Soma com 2 Strings com return String");
        return v1 + v2 + v3;
    }
}
