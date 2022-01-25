package Jdbc;

import java.sql.*;

public class DBconnect2 {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        String sql = "SELECT * FROM student";

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement st = conn.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                System.out.println("ID:" + data.getInt("student_id"));
                System.out.println("Name:" + data.getString("student_name"));
                System.out.println("Class_Id:" + data.getInt("student_class"));
                System.out.println("***********");
            }
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
