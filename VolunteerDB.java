import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VolunteerDB {

    private static final String DB_URL = "jdbc:sqlite:volunteer_actions.db";

    public static void createDatabase() {

        try(Connection connection = DriverManager.getConnection(DB_URL)) {

            System.out.println("Connected to the database.");

        } catch (SQLException e) {

            System.err.println("Error creating the database: " + e.getMessage());
            e.printStackTrace();

        }

    }
    
    public static void createTable() {

        String createTableQuery = "CREATE TABLE IF NOT EXISTS " +
            "volunteer_actions (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "name TEXT NOT NULL,\n" +
            "location TEXT NOT NULL,\n" +
            "description TEXT NOT NULL,\n" +
            "date TEXT NOT NULL,\n" +
            "keywords TEXT NOT NULL)";

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

        String dropTableQuery = "DROP TABLE IF EXISTS volunteer_actions";

        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(dropTableQuery);
            System.out.println("Table dropped successfully.");

        } catch (SQLException e) {

            System.err.println("Error dropping the table: " + e.getMessage());
            e.printStackTrace();

        }
    }

    public static void insertVolunteerAction(String name, String location,
        String description, String date, String keywords) {

        try (Connection connection = DriverManager.getConnection(DB_URL);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO volunteer_actions (name, location, " +
                     "description, date, keywords) VALUES (?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, location);
            preparedStatement.setString(3, description);
            preparedStatement.setString(4, date);
            preparedStatement.setString(5, keywords);

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
                String keywords = resultSet.getString("keywords");

                VolunteerAction activity = new VolunteerAction(id, name, location, description, date, keywords);

                activities.add(activity);

            }

        } catch (SQLException e) {

            System.err.println("Error in SQL Database " + e.getMessage());
            e.printStackTrace();
            System.exit(1);

        }

        return activities;
        
    }

    public static void fillDB() {

        //create database and volunteer actions table
        createDatabase();
        dropTable();
        createTable();

        //insert volunteer actions to table
        insertVolunteerAction("Συγκέντρωση Χριστουγεννιάτικων Δώρων για παιδιά", "Αττική", "Το ΟΛΟΙ ΜΑΖΙ ΜΠΟΡΟΥΜΕ καλεί τους κατοίκους της Αττικής να προσφέρουν για τα παιδιά του Δήμου τους δώρα, παιχνίδια, παιδικά βιβλία και ό,τι άλλο μπορεί να ονειρευτεί κάθε παιδί!", "2023-12-16 09:30 - 13:30", "ανθρωπιστική δράση");
        insertVolunteerAction("Εθελοντική Αιμοδοσία Ελληνικού Ερυθρού Σταυρού", "Αγιος Στέφανος, Αττική", "Εθελοντική αιμοδοσία σε οργάνωση από τον Ελληνικό Ερυθρό Σταυρό", "2023-12-16 10:00 - 16:00", "1 ώρα, δια ζώσης, ατομικό, ανθρωπιστικό, αιμοδοσία");
        insertVolunteerAction("Δεντροφύτευση στην Πεντέλη", "Πεντέλη, Αττική", "Το ΟΛΟΙ ΜΑΖΙ ΜΠΟΡΟΥΜΕ μας καλεί, να αφήσουμε και εμείς το δικό μας περιβαλλοντικό αποτύπωμα. Τα δέντρα που θα φυτευτούν θα είναι ανεπτυγμένα, βραδύκαυστα & πλατύφυλλα", "2023-12-17 10:00", "περιβάλλον");
        insertVolunteerAction("Καθαρισμό του περιβάλλοντος χώρου του Δάσους Υμηττού","Βύρωνας, Αττική", "Κατά τη διάρκεια της δράσης, οι εθελοντές ενημερώθηκαν για τη ρύπανση, τη φροντίδα και αισθητική του δασικού τοπίου, ενώ επίσης συζήτησαν και για τους τρόπους με τους οποίες οι συνήθειες μας επηρεάζουν το φυσικό περιβάλλον", "Παρασκευή 20 Οκτωβρίου 2023", "Περιβαλλον");
        insertVolunteerAction("Αειθαλεία - Ολιστικό πρόγραμμα για τον εθελοντισμό ατόμων τρίτης ηλικίας", "Πειραιας, Αττικη", "Καθαρισμός ωκεανών και ειδικότερα για τη θαλάσσια ρύπανση και τον τρόπο με τον οποίο οι συνήθειες μας επηρεάζουν τους ωκεανούς μας", "Σάββατο 16 Σεπτεμβρίου", "περιβάλλον");
        insertVolunteerAction("Προγράμματα Εθελοντικής Εργασίας (WorkCamps),", "Ελλάδα και το εξωτερικό", "προστασία του φυσικού περιβάλλοντος, εργασίες σε προστατευόμενες περιοχές, χάραξη, οριοθέτηση και σηματοδότηση μονοπατιών, ξυλοκατασκευές, δενδροφυτέυσεις, καθαρισμός βλάστησης", "2024", "περιββάλον");
        insertVolunteerAction("Γιατροί χωρίς σύνορα", "Αφορούν αποστολές από τον Εύρο μέχρι την Μέση Ανατολή", "Ιατρικό και μη ιατρικό προσωπικό αναζητά σταθερά η γνωστή ΜΚΟ για τα προγράμματά της", "2024", "ανθρωπιστικη βοηθεια");
        insertVolunteerAction("Voluntea", "Βερανζέρου 15, Αθήνα στον 5ος όροφος", "Να σε βοηθήσει να επιλέξεις το καταλληλότερο πρόγραμμα εθελοντισμού στο εξωτερικό για το καλοκαίρι", "Κάθε Πέμπτη, σε δύο ομάδες, με την πρώτη να ξεκινά στις 16:00 και τη δεύτερη στις 17:00", "ενημέρωση για εθελοντικές δράσεις");
        insertVolunteerAction("A Kitchen for Good", "Μεταξουργείο, Αττικη", " Οικιακή Κοινωνική Κουζίνα εντός του Εθελοντικού Συντονιστικού Κέντρου (ΕΣΚ) της χώρας, καλύπτοντας σε εβδομαδιαία βάση φρέσκο φαγητό για τους άστεγους πολίτες της Αττικής", "Κάθε Σάββατο 10:00πμ", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("Πρόγραμμα Στήριξης των Πληγέντων της Θεσσαλίας για το 2024", "Σε πάνω από 12 χωριά της Θεσσαλίας", "Βοήθεια στους πληγέντες", "Ξεκίνησε το Νοέμβριο του 2023", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("#GIVINGTUESDAY", "Αττική", "Μπορείτε να προσφέρετε εσείς τα αγαθά ή καθαρό και ευπρεπή ρουχισμό στο Εθελοντικό Συντονιστικό Κέντρο, ώστε να συμπεριληφθούν στα πακέτα στήριξης", " 28 Νοεμβρίου 2023", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("Αυτά τα Χριστούγεννα μαζί με το OPEN «Aνοίγουμε την Aγκαλιά μας στην Tρίτη ηλικία»", " Εθελοντικό Συντονιστικό Κέντρο του Humanity Greece", "Προσφορά χριστουγεννιάτικης βοήθειας σε άπορους παππούδες και γιαγιάδες", "", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("«Βοήθεια στο Σπίτι»", " Εθελοντικό Συντονιστικό Κέντρο του Humanity Greece", "Προσφορά βοήθειας σε άπορους ανθρώπους στα σπίτια τους", "Καθημερινά", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("WWF Προστασία για τα δάση μας", "https://www.wwf.gr/ti_mporeis_na_kaneis/ekstrateies/prostasia_gia_ta_dasi/", "Υπογραφή ιντερνετική για τη δήλωση", "", "ηλεκτρονικόσ εθελοντισμός");
        insertVolunteerAction("Blue Panda", "Σούνιο, τη Γυάρο και τη Σύρο", "Το ιστιοπλοϊκό σκάφος του WWF, διασχίζουμε και φέτος τη Μεσόγειο και θα μοιραστούμε με εσάς ιστορίες και εικόνες από τον πλούτο των θαλασσών μας. Μαζί θα ανακαλύψουμε τη «θάλασσα που θέλουμε»!", "Από τις 3 έως και τις 13 Σεπτεμβρίου", "ενημέρωση, περιβάλλον");
        insertVolunteerAction("WWF:ΥΙΟΘΕΤΗΣΕ ΕΝΑ ΑΠΕΙΛΟΥΜΕΝΟ ΕΙΔΟΣ", "https://donate.wwf.gr/yiothetise", "Με μια συμβολική υιοθεσία μπορείς να κάνεις τη διαφορά μεταξύ εξαφάνισης και επιβίωσης για ένα πολύτιμο κομμάτι της άγριας ζωής.", "", "ηλεκτρονικός εθελοντισμός");
        insertVolunteerAction("ActionAID:Γίνε Ανάδοχος", "https://actionaid.gr/gine-anadohos", "", "", "ηλεκτρονικός εθελοντισμός");
        insertVolunteerAction("Εθελοντισμός στο Κέντρο της ActionAid στην Αθήνα", "Αθήνα, Αττική", "Υπηρεσία Συμβουλευτικής Εύρεσης Εργασίας, Ενισχυτική διδασκαλία, Μαθήματα Ελληνικών & Αγγλικών, Μαθήματα Υπολογιστών, Απογευματινά Δημιουργικά Προγράμματα, Θεατρικό Παιχνίδι, Summer Camp", "Καθημερινές", "διδασκαλία, ανθρωπιστική δράση");
        insertVolunteerAction("Εθελοντισμός στα Κεντρικά Γραφεία της ActionAID", "Καντρικά γραφεία ActionAID", "Αλληλογραφία, Αρχειοθέτηση, Διοικητικές εργασίες, Τμήμα επικοινωνίας", "Καθημερινές", "ανθρωπιστική δράση");
        insertVolunteerAction("Εθελοντισμός σε Εκδηλώσεις της ActionAID", "", "Φεστιβάλ, Εκθέσεις Φωτογραφίας/ Ζωγραφικής, Αθλητικά Event, Γιορτές", "Κυρίως Σάββατο και Κυριακή", "ενημέρωση, ανθρωπιστική δράση");
        insertVolunteerAction("HELMEPA:¨Παγκόσμιος Εθελοντικός Καθαρισμός Ακτών", "Αττική", "ΒΙΩΜΑΤΙΚΗ ΔΡΑΣΗ ΚΑΘΑΡΙΣΜΟΥ", "Από 16 Σεπτεμβρίου μέχρι 16 Νοεμβρίου 2023", "περιβάλλον");
        
        


        //print all volunteer actions in database
        System.out.println(VolunteerDB.getAllVolunteerActions());

    }

}
