import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserProfileManager {

    // Σύνδεση στη βάση δεδομένων SQLite
    private static Connection connect() {
        String url = "jdbc:sqlite:user_profiles.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Δημιουργία πίνακα για τα προφίλ χρηστών
    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS user_profile (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " username TEXT NOT NULL,\n"
                + " email TEXT NOT NULL,\n"
                + " password TEXT NOT NULL\n"
                + ");";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Εισαγωγή νέου προφίλ χρήστη
    public static void insertUserProfile(String username, String email, String password) {
        String sql = "INSERT INTO user_profile(username, email, password) VALUES(?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            pstmt.executeUpdate();
            System.out.println("Το προφίλ χρήστη προστέθηκε επιτυχώς.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}


public class MainClass {

    public static void main(String[] args) {
      
        UserProfileManager userProfileManager = new UserProfileManager();
        
        userProfileManager.insertUserProfile("john_doe", 25, "Male", "john.doe@example.com", 1234567890);
    }
}
