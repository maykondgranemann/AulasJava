package P5.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PontoTuristicoArquivo implements IPontoTuristicoCrud {
    private String filename = "P5/ex2/pontosturisticos.csv";

    @Override
    public String save(PontoTuristico model) {
        String msgRetorno;
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.write(model.toString() + "\n");
            fileWriter.close();
            msgRetorno = String.format("Ponto turistico: %s salvo com sucesso!", model.nome );
        } catch (IOException e) {
            msgRetorno = "Erro ao salvar ponto turistico no arquivo";
        }
        return msgRetorno;
    }

    @Override
    public ArrayList<PontoTuristico> read() {
        ArrayList<PontoTuristico> pontoTuristicos = new ArrayList<PontoTuristico>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while(sc.hasNextLine()){
                String l = sc.nextLine();
                String[] dados = l.split(";");
                PontoTuristico pt = new PontoTuristico();
                pt.nome = dados[0];
                pt.descricao = dados[1];
                pt.localizacao = dados[2];
                pontoTuristicos.add(pt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return pontoTuristicos;
    }
    
}
