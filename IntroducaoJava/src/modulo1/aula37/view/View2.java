package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View2 {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {

            String nome = "UpdatePrepStatement";
            int id = 25;            
            
            String sql = "UPDATE categoria SET nome=? WHERE id = ?";            
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

            prepStatement.execute();  
                      
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
