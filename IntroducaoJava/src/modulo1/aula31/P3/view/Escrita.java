package P3.view;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Escrita {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream("P3/dados/molho.txt");
            ps.println("Sugo");
            ps.println("Branco"); 
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } finally{
            ps.close();
        }
    }
}
