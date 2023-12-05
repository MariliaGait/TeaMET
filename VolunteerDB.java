import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VolunteerDB {

    private static final String DB_URL = "jdbc:sqlite:volunteer_actions.db";

    public static void createTable() {

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {

            String createTableQuery = "CREATE TABLE IF NOT EXISTS " +
                                     "volunteer_actions (" +
                                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                     "name TEXT," +
                                     "location TEXT," +
                                     "description TEXT," +
                                     "date TEXT)";

            statement.executeUpdate(createTableQuery);

            System.out.println("Table created successfully.");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public static void insertVolunteerAction(String name, String location,
        String description, String date) {

        try (Connection connection = DriverManager.getConnection(DB_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO volunteer_actions (name, location, " +
                     "description, date) VALUES (?, ?, ?, ?)")) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, location);
            preparedStatement.setString(3, description);
            preparedStatement.setString(4, date);

            preparedStatement.executeUpdate();

            System.out.println("Volunteer action inserted successfully.");

        } catch (SQLException e) {

            e.printStackTrace();

        }
    
    }

    public static List<VolunteerAction> getAllVolunteerActions() {

        List<VolunteerAction> activities = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM volunteer_actions")) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String location = resultSet.getString("location");
                String description = resultSet.getString("description");
                String date = resultSet.getString("date");

                VolunteerAction activity = new VolunteerAction(id, name, location, description, date);

                activities.add(activity);

            }

        } catch (SQLException e) {

            System.err.println("Error in SQL Database " + e.getMessage());
            e.printStackTrace();
            System.exit(1);

        }

        return activities;
        
    }
    
    public static void main(String[] args) {

        createTable();
        insertVolunteerAction("Tree Planting Event", "Marathon, Attica", "Marathon, Attica", "2023-12-16");
        getAllVolunteerActions();

    }

}