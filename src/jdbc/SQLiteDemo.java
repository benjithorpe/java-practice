package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDemo {

    public static void main(String[] args) {
        final String DB_URL = "jdbc:sqlite:test.db";
        final String DB_QUERY = "CREATE TABLE IF NOT EXISTS student("
                + "ID INT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,"
                + "name TEXT NOT NULL,"
                + "course TEXT"
                + ")";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {

            System.out.println("Connection Successful...");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: (" + e.getClass() + ")" + e.getMessage());
        }
    }
}
