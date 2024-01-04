import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserProfileManager {

    // Σύνδεση στη βάση δεδομένων SQLite
    public static final String DB_URL = "jdbc:sqlite:user_profiles.db";

    public static void createDatabase() {

        try(Connection connection = DriverManager.getConnection(DB_URL)) {

            System.out.println("Connected to the database.");

        } catch (SQLException e) {

            System.err.println("Error creating the database: " + e.getMessage());
            e.printStackTrace();

        }

    }

    // Δημιουργία πίνακα για τα προφίλ χρηστών
    private static void createTable() {
        
        String createTableQuery = "CREATE TABLE IF NOT EXISTS user_profiles ("
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL,\n"
            + " age INTEGER NOT NULL, \n"
            + " sex INTEGER NOT NULL, \n"
            + " email TEXT NOT NULL,\n"
            + " phone TEXT NOT NULL)";

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {
            
            statement.executeUpdate(createTableQuery);

            System.out.println("Table created successfully.");

        } catch (SQLException e) {

            System.err.println("Error creating the table: " + e.getMessage());
            e.printStackTrace();

        }

    }

    public static void dropTable() {

        String dropTableQuery = "DROP TABLE IF EXISTS user_profiles";

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(dropTableQuery);
            System.out.println("Table dropped successfully.");

        } catch (SQLException e) {

            System.err.println("Error dropping the table: " + e.getMessage());
            e.printStackTrace();

        }
    }

    // Εισαγωγή νέου προφίλ χρήστη
    public static void insertUserProfile(String username,int age, int sex, String email, String phone) {
        
        try (Connection connection = DriverManager.getConnection(DB_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO user_profiles(username, age, sex, email, " +
                    "phone) VALUES(?, ?, ?, ?, ?)")) {
            
            
            preparedStatement.setString(1, username);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, sex);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, phone);
            
            preparedStatement.executeUpdate();
            
            System.out.println("Το προφίλ χρήστη προστέθηκε επιτυχώς.");
            
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        createDatabase();
        dropTable();
        createTable();
        insertUserProfile("john_doe", 25, 0, "john.doe@example.com", "1234567890");

    }
}


