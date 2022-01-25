package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/university?user=root&password=1234";

        try {
            Connection connect = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
