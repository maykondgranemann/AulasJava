package src.view;

import java.sql.Connection;
import java.sql.SQLException;

import src.dao.CategoriaDao;
import src.dao.ConnectionFactory;

public class ViewDelete{
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {            
            CategoriaDao dao = new CategoriaDao(conn);
            dao.delete(25);   
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}