import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VolunteerDB {

    private static final String DB_URL = "jdbc:sqlite:volunteer_actions.db";

    public List<VolunteerAction> getAllVolunteerActions() {

        List<VolunteerAction> activities = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM volunteer_actions")) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String location = resultSet.getString("location");
                String description = resultSet.getString("location");
                String date = resultSet.getString("date");

                VolunteerAction activity = new VolunteerAction(id, name, locatio, description, date);

                activities.add(activity);

            }

        } catch (SQLException e) {

            System.err.println("Error in SQL Database ") + e.getMessage();
            e.printStackTrace();
            System.exit(1);


    }

}

