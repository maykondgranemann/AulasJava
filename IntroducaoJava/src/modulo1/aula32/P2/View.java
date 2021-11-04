package P2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "VW";
        c1.modelo = "Fusca";

        try {
            FileWriter fw = new FileWriter("P2/Carros.csv", true);
            //DAO (Data Access Object) - Dados do objeto carro para uma string
            String carroString = c1.marca + ";" + c1.modelo+ "\n";
            fw.write(carroString);
            fw.close();
        } 
        catch (IOException e) {
            System.out.println("Não foi possivel abrir o arquivo");
        }

        try {
            Scanner sc = new Scanner(new File("P2/Carros.csv"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                // DAO (Data Access Object) - Uma string e criando um objeto de Carro
                String[] carroString = linha.split(";");
                Carro c = new Carro();
                c.marca = carroString[0];
                c.modelo = carroString[1];

                System.out.printf("%s - %s\n", c.marca, c.modelo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel abrir o arquivo");
        }
      
    }
}
