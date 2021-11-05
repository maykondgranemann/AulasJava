package P5.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ViewV1 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "Zuplae";
        empresa.cnpj = "15.463.356/0001-38";
        empresa.ramo = "Educação"; 

        //Escrita
        try {
            FileWriter fileWriter = new FileWriter("P5/ex1/empresas.csv", true);
             //DAO - Object-> String
            String empresaString = String.format("%s;%s;%s\n", empresa.nome, empresa.cnpj, empresa.ramo);
            fileWriter.write(empresaString);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("O arquivo não pode ser aberto");
        }


        //Leitura
        try {
            Scanner sc = new Scanner(new File("P5/ex1/empresas.csv"));
            while(sc.hasNextLine()){
                // Lendo uma linha do arquivo
                String linha = sc.nextLine();
           
                // Quebrando a linha em partes, de acordo com o separador de dados
                String[] dadosEmpresa = linha.split(";");
                        
                //DAO - String -> Objeto
                Empresa e = new Empresa();
                e.nome = dadosEmpresa[0];
                e.cnpj = dadosEmpresa[1];
                e.ramo = dadosEmpresa[2];
                // Imprimindo o objeto formatado
                System.out.printf("%s %s %s\n",e.nome, e.cnpj, e.ramo);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não pode ser aberto");
        }       
    }
}
