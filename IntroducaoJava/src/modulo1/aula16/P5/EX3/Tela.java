package P5.EX3;
/*
    Crie uma classe Tela com um método main
    Crie um objeto da classe Calculadora
    chame cada método criado
    imprima seus resultados.
 */

public class Tela {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
        int r1 = c.soma(10, 10);
        double r2 = c.soma(10.1, 10.5);
        float r3 = c.soma(10.8f, 10.9f, 10.10f);
        long r4 = c.soma(10, 15, 20);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
