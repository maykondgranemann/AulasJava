import java.io.File;
import java.io.IOException;

public class ErrosTipoChecked {
    public static void main(String[] args) {
        File arquivo = new File("teste.txt");
        try {
            arquivo.createNewFile();            
        } catch (IOException e) {
            System.out.println("Deu ruim");
        }
    }
}
