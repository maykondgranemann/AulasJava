package src.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import src.model.Categoria;

public class CategoriaDao {
    private Connection conn;

    public CategoriaDao(Connection conn) {
        this.conn = conn;
    }
    
    public void create(Categoria model) throws SQLException{   
        String sql = "INSERT INTO categoria(nome)values(?)";
        PreparedStatement prepStatement = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        prepStatement.setString(1, model.getNome());
        prepStatement.execute();            
        ResultSet ids = prepStatement.getGeneratedKeys();

        while(ids.next()){
            int id = ids.getInt("id");
            System.out.println(id);
        }        
    }
    public ArrayList<Categoria> list() throws SQLException{
        ArrayList<Categoria> list = new  ArrayList<Categoria>();
         
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();
        while(result.next()){
            Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"));
            list.add(cat);
        }
        return list;
    }
    public int update(Categoria model) throws SQLException{           
        String sql = "UPDATE categoria SET nome=? WHERE id = ?";            
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.setString(1, model.getNome());
        prepStatement.setInt(2, model.getId());
        prepStatement.execute();  
                    
        return prepStatement.getUpdateCount();
    }
    public int delete(int id){     
        int linhasAfetadas = 0;

        String sql = "DELETE FROM categoria WHERE id = ?";
        try ( PreparedStatement prepStatement = conn.prepareStatement(sql)) {
            prepStatement.setInt(1, id);
            prepStatement.execute();   
            linhasAfetadas = prepStatement.getUpdateCount(); 
        } catch (Exception e) {
            e.printStackTrace();
        }   
        return linhasAfetadas; 
    }
}
