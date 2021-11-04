package P1.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import P1.model.Pessoa;

public class PessoaDao extends BaseDao<Pessoa> {
    public PessoaDao() {
        super("P1/dados/pessoa.csv");
    }

    public ArrayList<Object> list(){  
        ArrayList<Object> pessoas = new ArrayList<Object>();      
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine(); 
                Pessoa p = new Pessoa(linha);
                pessoas.add(p);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        return pessoas; 
    }

}
