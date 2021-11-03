package P2.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Escrita {
    public static void main(String[] args) {
        try {
            InputStream fis = new FileInputStream("P2/dados/molhos.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("P2/dados/molhos2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            while(br.ready()){
                bw.write(br.readLine());
                bw.newLine();
            }
            br.close();
            bw.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } catch (IOException e) {
            System.out.println("Nao foi possivel escrever no arquivo");
        }
    }
}
