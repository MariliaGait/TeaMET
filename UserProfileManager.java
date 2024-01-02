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


<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version> <!-- Χρησιμοποιήστε την τελευταία έκδοση -->
</dependency>
// gia maven//

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

String filePath ='' ;
        UserProfile user = new UserProfile();
// create default object apo klash userProfile wste na kalesw method//
       user = user.collrctUserInformation();

        // Κλήση μεθόδου για αποθήκευση σε JSON αρχείο
        saveUserProfileToJson(user, "userProfile.json");
    }

    private static void saveUserProfileToJson(UserProfile user, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(filePath)) {
            
            gson.toJson(user, writer);
            System.out.println("Το προφίλ χρήστη αποθηκεύτηκε επιτυχώς στο αρχείο " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//User user = new User(1, "Tom Smith", "American");//
//gson.toJson(user, new FileWriter(filePath));//
