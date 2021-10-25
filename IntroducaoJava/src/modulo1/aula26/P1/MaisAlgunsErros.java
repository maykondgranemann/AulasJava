package P1;
import java.util.ArrayList;

public class MaisAlgunsErros {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        System.out.println(numeros[6]);

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Maykon");
        nomes.add("Jojo");
        nomes.add("Ines");
        System.out.println(nomes.get(5));
    }
}
