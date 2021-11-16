package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Categoria;
import utils.ConnectionFactory;

public class CategoriaDao {
    public void insert(Categoria model){
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            String sql = "INSERT INTO categoria(nome)values(?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());

            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
