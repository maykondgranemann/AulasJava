package src.view;

import java.sql.Connection;
import java.sql.SQLException;

import src.dao.CategoriaDao;
import src.dao.ConnectionFactory;
import src.model.Categoria;

public class ViewInsert {
    public static void main(String[] args) {       
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat1 = new Categoria("Test1Dao");
            Categoria cat2 = new Categoria("Test2Dao");

            dao.create(cat1);
            dao.create(cat2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
