package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Categoria;
import utils.ConnectionFactory;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            Categoria model = new Categoria();
            model.setId(29);
            model.setNome("Test Aula 37 - Update");         
            
            String sql = "UPDATE categoria SET nome=? WHERE id = ?";            
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, model.getNome());
            prepStatement.setInt(2, model.getId());

            prepStatement.execute();  
                      
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
