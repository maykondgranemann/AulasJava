package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Categoria;
import utils.ConnectionFactory;

public class ViewRead {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                Categoria model = new Categoria();                
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));

                System.out.printf("%d - %s\n", model.getId(), model.getNome());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
