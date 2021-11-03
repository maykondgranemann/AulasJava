package P3.view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita3 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("P3/dados/molho.txt", true);
            fw.write("Sugo\n");
            fw.write("Branco\n"); 
            fw.write("Bolonhesa\n");
            fw.write("Madeira\n"); 
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } catch (IOException e) {
            System.out.println("Nao foi possivel escrever no arquivo");
        }          
    }
}
