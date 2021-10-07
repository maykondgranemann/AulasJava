package P4;

public class Tela1 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double r1 = c.soma(10, 20);
        double r2 = c.soma(10, 20, 30);
        double r3 = c.soma(10.0, 20.9);
        String r4 = c.soma("10", "20", "30");
        
        System.out.println(r4);
    }
}
