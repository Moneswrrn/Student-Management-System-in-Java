// Edited by Moneswarran (Assignment 2) 
import java.sql.*;

/**
 * dbConnect class handles database connection to MySQL database.
 */

public class dbConnect {
    private static Connection mycon=null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String database = "student_data"; // Database name
        String user = "root"; // Database username
        String password = ""; // Database password (empty in this case)

        // JDBC URL for connecting to MySQL database.
        String url = "jdbc:mysql://localhost:3306/" + database;

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to the database
        Connection conn = DriverManager.getConnection(url,user,password);

        // Return the established connection
        return conn;
    }
}

