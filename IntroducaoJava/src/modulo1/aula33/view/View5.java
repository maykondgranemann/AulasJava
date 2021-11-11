package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View5 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.18:5432/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM pessoa WHERE id > 10";
            statement.execute(sql);   
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);         
            

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
