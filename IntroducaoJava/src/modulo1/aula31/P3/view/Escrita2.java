package P3.view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Escrita2 {
    public static void main(String[] args) {
        PrintWriter ps = null;
        try {
            ps = new PrintWriter("P3/dados/molho.txt");
            ps.println("Sugo");
            ps.println("Branco"); 
            ps.println("Bolonhesa");
            ps.println("Madeira"); 
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } finally{
            ps.close();
        }
    }
}
