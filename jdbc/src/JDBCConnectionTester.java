import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTester {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/advjava"; // Replace with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "Amanavi12@@"; // Replace with your MySQL password

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Attempt to establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to MySQL database successfully!");
            } else {
                System.out.println("Connection failed!");
            }

            // Close the connection properly
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }

    }
}
