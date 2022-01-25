package Jdbc;

import java.sql.*;

public class DBconnectInstert {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        //String sql = "INSERT INTO student (student_name, student_class) VALUES ('Damla', 4)";
        String prSql = "INSERT INTO student (student_name, student_class) VALUES (?,?)";
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            //Statement st = conn.createStatement();
            //st.executeUpdate(sql);

            PreparedStatement prSt = conn.prepareStatement(prSql);
            prSt.setString(1,"Ali");
            prSt.setInt(2,4);
            prSt.executeUpdate();
            prSt.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }
}
