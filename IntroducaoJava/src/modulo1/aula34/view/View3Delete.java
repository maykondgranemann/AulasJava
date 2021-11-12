package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View3Delete {
    public static void main(String[] args) {
        try {
            int idDeletado = 26;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.18:5432/postgres", "postgres", "123456");
            
            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);

            prepStatement.execute();   
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);    

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
