package P3.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("P3/dados/molho.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
