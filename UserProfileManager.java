import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserProfileManager {

    // Σύνδεση στη βάση δεδομένων SQLite
    public static final String url = "jdbc:sqlite:user_profiles.db";


    public static void createDatabase() {

        try(Connection connection = DriverManager.getConnection(url)) {

            System.out.println("Connected to the database.");

        } catch (SQLException e) {
            System.err.println("Error creating the database: " + e.getMessage());
            e.printStackTrace();
        }

    }



public static void createTable() {

        String createTableQuery = "CREATE TABLE IF NOT EXISTS " +
                                        "volunteer_actions (" +
                                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                        "name TEXT," +
                                        "location TEXT," +
                                        "description TEXT," +
                                        "date TEXT," +
                                        "keywords TEXT)";

    

    // Δημιουργία πίνακα για τα προφίλ χρηστών
    private static void createTable() {
        
        String createTableQuery = "CREATE TABLE IF NOT EXISTS user_profile (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " username TEXT NOT NULL,\n"
                + " age INT NOT NULL, \n"
                + " sex INT NOT NULL, \n"
                + " email TEXT NOT NULL,\n"
                + " phonenumber INT NOT NULL\n"
                + ");";



 try (Connection connection = DriverManager.getConnection(url);
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

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(dropTableQuery);
            System.out.println("Table dropped successfully.");

        } catch (SQLException e) {

            System.err.println("Error dropping the table: " + e.getMessage());
            e.printStackTrace();

        }
    }





    // Εισαγωγή νέου προφίλ χρήστη
    public static void insertUserProfile(String username, String email, String password) {
        
        String sql = "INSERT INTO user_profile(username, email, password) VALUES(?,?,?)";

        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO user_profile(username, age, sex, email, phonenumber) VALUES(?,?,?,?,?)"{
            
            
            pstmt.setString(1, username);
            pstmt.setInt(2, age);
            pstmt.setInt(3, sex);
            pstmt.setString(4, email);
             pstmt.setInt(5, phonenumber);
            
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
