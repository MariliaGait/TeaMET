import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VolunteerActionHandler {

    private static final String DB_URL = "jdbc:sqlite:volunteer_actions.db";

    public static void createDatabase() {

        try (Connection connection = DriverManager.getConnection(DB_URL)) {

            System.out.println("Connected to the database.");

        } catch (SQLException e) {

            System.err.println("Error creating the database: " +
             e.getMessage());
            e.printStackTrace();

        }
    }

    public static List<VolunteerAction> getAllVolunteerActions() {
        List<VolunteerAction> activities = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM volunteer_actions")) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String location = resultSet.getString("location");
                String description = resultSet.getString("description");
                String date = resultSet.getString("date");
                String keywords = resultSet.getString("keywords");

                VolunteerAction activity = new VolunteerAction(id, name,
                 location, description, date, keywords);
                activities.add(activity);

            }

        } catch (SQLException e) {

            System.err.println("Error in SQL Database " + e.getMessage());
            e.printStackTrace();
            System.exit(1);

        }

        return activities;

    }

    /*public static List<VolunteerAction> filterByKeywords(List<VolunteerAction>
     actions, String keyword) {

        List<VolunteerAction> filteredActions = new ArrayList<>();

        for (VolunteerAction action : actions) {

            if (action.getKeywords().equalsIgnoreCase(keyword)) {

                filteredActions.add(action);

            }

        }

        return filteredActions;

    } */

    public static List<VolunteerAction> filterByKeywords(List<VolunteerAction> actions,
     String keywords) {

        List<String> keywordList = Arrays.asList(keywords.split(",\\s*"));
        List<VolunteerAction> filteredActions = new ArrayList<>();

        for (VolunteerAction action : actions) {

            boolean containsAll = true;

            for (String keyword : keywordList) {

                if (!action.getKeywords().toLowerCase().contains(keyword.toLowerCase())) {
                    
                    containsAll = false;
                    break;  // Αν βρεθεί τουλάχιστον μία λέξη-κλειδί, προχωράμε στο επόμενο action

                }

            }

            if (containsAll) {

                filteredActions.add(action);
                
            }

        }

        return filteredActions;

    }

}
