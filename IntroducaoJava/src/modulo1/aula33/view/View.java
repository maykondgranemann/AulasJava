package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View{
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "192.168.0.18";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String pwd = "123456";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

            Connection conn =  DriverManager.getConnection(connectionString, user, pwd);

            conn.close();

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar");
        }
    }
}