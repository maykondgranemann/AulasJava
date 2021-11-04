package P4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements IController {

    public String salvar(String dado) {
        FileWriter fw;
        try {
            fw = new FileWriter("P4/Dados.txt", true);
            fw.write(dado + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }        
        return "Dado: "+ dado + " salvo com sucesso!";
    }

    public ArrayList<String> ler() {  
        ArrayList<String> dados = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File("P4/Dados.txt"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                dados.add(linha);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }      
        return dados;
    }
    
}
