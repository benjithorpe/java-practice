package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDemo {

    public static void main(String[] args) {
        final String DB_URL = "jdbc:derby:";
        final String DB_QUERY = "SELECT * FROM student";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            System.out.println("Connection Successful...");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: (" + e.getClass() + ")" + e.getMessage());
        }
    }
}
