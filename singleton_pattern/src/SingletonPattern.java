import java.sql.Connection;

// Singleton pattern demo
public class SingletonPattern {
    public static void main(String[] args) {
        // Get the single instance of DatabaseConnection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();

        // Use the connection
        Connection connection = dbConnection.getConnection();
        if (connection != null) {
            System.out.println("Database connected successfully!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}