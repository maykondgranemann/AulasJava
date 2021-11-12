package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View1Insert {
    public static void main(String[] args) {
        try {
            // SQL Injection
            String nome = "Eletro');delete from categoria; INSERT INTO categoria(nome)values('otario";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.18:5432/postgres", "postgres", "123456");
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria(nome)values(?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);

            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
