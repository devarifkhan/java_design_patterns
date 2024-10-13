import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Singleton class for DatabaseConnection
class DatabaseConnection {
    private static DatabaseConnection instance; // Single instance
    private Connection connection;

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        try {
            // Initialize the connection (replace with your DB credentials)
            String url = "jdbc:mysql://localhost:3306/your_database";
            String user = "username";
            String password = "password";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace(); // Handle connection error
        }
    }

    // Public method to provide access to the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Create instance if not created
        }
        return instance; // Return the single instance
    }

    public Connection getConnection() {
        return connection; // Return the connection
    }
}