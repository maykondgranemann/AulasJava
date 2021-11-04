package P1.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import P1.model.BaseModel;


public abstract class BaseDao<T extends BaseModel> implements IDao<T> {
    protected String filename;

    public BaseDao(String filename) {
        this.filename = filename;
    }
    
    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    

    public void update(T model) {
        updateOrRemove(model, true);    
    }

    public void remove(T model) {        
        updateOrRemove(model, false); 
    }

    private void updateOrRemove(T model, boolean update) {
        try {
            ArrayList<String> listLinhas = new ArrayList<String>();
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
               String linha = sc.nextLine();
               int id = Integer.parseInt(linha.split(";")[0]);

                //alterar
                if(id == model.id){
                    if(update){
                        listLinhas.add(model.toString());
                    }
                }
                else{
                    listLinhas.add(linha);
                }
            }
            FileWriter fw = new FileWriter(filename);
            for (String l : listLinhas) {
                fw.write(l+"\n");
            }
            fw.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
