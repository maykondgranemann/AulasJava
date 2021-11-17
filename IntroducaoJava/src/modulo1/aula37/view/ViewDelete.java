package view;

import java.util.Scanner;

import dao.CategoriaDao;
import model.Categoria;

public class ViewDelete{
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("\nDigite o id para deletar");
            int id = Integer.parseInt(sc.nextLine());
            model.setId(id); 
            
        } catch (Exception e) {
            System.out.println("Não foi possivel ler");
        }        

        int lAfetadas = dao.delete(model);
        System.out.println(lAfetadas);  
    }

    
}