package P5.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewV3 {
    private static String fileName = "P5/ex1/empresas.csv";
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "Zuplae";
        empresa.cnpj = "15.463.356/0001-38";
        empresa.ramo = "Educação"; 

        String empresaS = objectToString(empresa);
        String msgRetorno = save(empresaS);
        System.out.println(msgRetorno);
        
        ArrayList<String> empresasString = read();
        ArrayList<Empresa> empresas =  stringToObject(empresasString);

        for (Empresa e : empresas) {
            // Imprimindo o objeto formatado
            System.out.printf("%s %s %s\n",e.nome, e.cnpj, e.ramo);            
        }  
    }

    private static String objectToString(Empresa object){
        //DAO - Object-> String
        String empresaString = String.format("%s;%s;%s\n", object.nome, object.cnpj, object.ramo);
        return empresaString;
    }   

    private static String save(String dados){

        String retorno;
         //Escrita
         try {
            FileWriter fileWriter = new FileWriter(fileName, true);            
            fileWriter.write(dados);
            fileWriter.close();
            retorno = "Salvo com sucesso";
        } catch (IOException e) {
            retorno = "O arquivo não pode ser aberto";
        }
        return retorno;
    }

    private static ArrayList<String> read(){
        //Leitura
        ArrayList<String> linhas = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()){
                // Lendo uma linha do arquivo
                String linha = sc.nextLine();
                linhas.add(linha);               
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não pode ser aberto");
        }  

        return linhas;
    }

    private static ArrayList<Empresa> stringToObject(ArrayList<String> empresasStrings){
        //Dao e Impressao
        ArrayList<Empresa> empresas = new ArrayList<Empresa>();
        for (String l : empresasStrings) {
            // Quebrando a linha em partes, de acordo com o separador de dados
            String[] dadosEmpresa = l.split(";");
                        
            //DAO - String -> Objeto
            Empresa e = new Empresa();
            e.nome = dadosEmpresa[0];
            e.cnpj = dadosEmpresa[1];
            e.ramo = dadosEmpresa[2];
            empresas.add(e);
        }
        return empresas;
    }
}
