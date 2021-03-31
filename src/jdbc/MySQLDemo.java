package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/test.db";
        String username = "isaac";
        String password = "windrush";

        String dbQuery = "CREATE DATABASE IF NOT EXISTS test";
        String query = "CREATE TABLE test(id INT AUTO_INCREMENT NOT NULL UNIQUE)";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to database....");

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(dbQuery);

            System.out.println("Success: " + rs);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
//            System.out.println("Error:? " + e.getMessage());
            // do nothing
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
}
