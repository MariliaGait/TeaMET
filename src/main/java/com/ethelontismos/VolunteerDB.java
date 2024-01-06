package com.ethelontismos;

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

        try {

            Class.forName("org.sqlite.JDBC");
    
            try (Connection connection = DriverManager.getConnection(DB_URL)) {

            } catch (SQLException e) {

                System.err.println("Error creating the database: " + e.getMessage());
                e.printStackTrace();

            }
    
        } catch (ClassNotFoundException e) {

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

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement statement = connection.createStatement()) {
            
                statement.executeUpdate(createTableQuery);

            } catch (SQLException e) {

                System.err.println("Error creating the table: " + e.getMessage());
                e.printStackTrace();

            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

    public static void dropTable() {

        String dropTableQuery = "DROP TABLE IF EXISTS volunteer_actions";

        try {

            Class.forName("org.sqlite.JDBC");

            try (Connection connection = DriverManager.getConnection(DB_URL);
            Statement statement = connection.createStatement()) {

                statement.executeUpdate(dropTableQuery);

            } catch (SQLException e) {

            System.err.println("Error dropping the table: " + e.getMessage());
            e.printStackTrace();

            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }


    }

    public static void insertVolunteerAction(String name, String location,
        String description, String date, String keywords) {

        try {

            Class.forName("org.sqlite.JDBC");

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

            } catch (SQLException e) {

            e.printStackTrace();

            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    
    }

    public static List<VolunteerAction> getAllVolunteerActions() {

        List<VolunteerAction> activities = new ArrayList<>();

        try {

            Class.forName("org.sqlite.JDBC");

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

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        return activities;
    }

    public static void fillDB() {

        //create database and volunteer actions table
        createDatabase();
        dropTable();
        createTable();

        //insert volunteer actions to table
        insertVolunteerAction("Συγκέντρωση Χριστουγεννιάτικων Δώρων για παιδιά", "Αττική", "Το ΟΛΟΙ ΜΑΖΙ ΜΠΟΡΟΥΜΕ καλεί τους κατοίκους της Αττικής να προσφέρουν για τα παιδιά του Δήμου τους δώρα, παιχνίδια, παιδικά βιβλία και ό,τι άλλο μπορεί να ονειρευτεί κάθε παιδί!", "2023-12-16 09:30 - 13:30", "Δια ζώσης, Βοήθεια");
        insertVolunteerAction("Εθελοντική Αιμοδοσία Ελληνικού Ερυθρού Σταυρού", "Αγιος Στέφανος, Αττική", "Εθελοντική αιμοδοσία σε οργάνωση από τον Ελληνικό Ερυθρό Σταυρό", "2023-12-16 10:00 - 16:00", "Δια ζώσης, αιμοδοσία");
        insertVolunteerAction("Δεντροφύτευση στην Πεντέλη", "Πεντέλη, Αττική", "Το ΟΛΟΙ ΜΑΖΙ ΜΠΟΡΟΥΜΕ μας καλεί, να αφήσουμε και εμείς το δικό μας περιβαλλοντικό αποτύπωμα. Τα δέντρα που θα φυτευτούν θα είναι ανεπτυγμένα, βραδύκαυστα & πλατύφυλλα", "2023-12-17 10:00", "Δια ζώσης, Δενδροφύτευση");
        insertVolunteerAction("Καθαρισμό του περιβάλλοντος χώρου του Δάσους Υμηττού","Βύρωνας, Αττική", "Κατά τη διάρκεια της δράσης, οι εθελοντές ενημερώνονται για τη ρύπανση, τη φροντίδα και αισθητική του δασικού τοπίου και συζητούν για τους τρόπους με τους οποίους οι συνήθειες μας επηρεάζουν το φυσικό περιβάλλον", "Κάθε Παρασκευή","Δια ζώσης, Καθαρισμός");
        insertVolunteerAction("Αειθαλεία", "Πειραιας, Αττικη", "Καθαρισμός ωκεανών και για την αντιμετώπιση της  θαλάσσιας ρύπανσης με συνείδηση του τρόπου με τον οποίο οι συνήθειες μας επηρεάζουν τους ωκεανούς μας- Ολιστικό πρόγραμμα που συμμετέχουν και άτομα τρίτης ηλικίας", "Σάββατο 16 Σεπτεμβρίου","Δια ζώσης, Καθαρισμός δημοσίων χώρων");            
        insertVolunteerAction("Προγράμματα Εθελοντικής Εργασίας (WorkCamps),", "Ελλάδα και το εξωτερικό", "Περιλαμβάνουν την προστασία του φυσικού περιβάλλοντος, εργασίες σε προστατευόμενες περιοχές, χάραξη, οριοθέτηση και σηματοδότηση μονοπατιών, ξυλοκατασκευές, δενδροφυτέυσεις, καθαρισμός βλάστησης", "2024", "Δια ζώσης, Δενδροφύτευση");
        insertVolunteerAction("Γιατροί χωρίς σύνορα", "Αφορούν αποστολές από τον Εύρο μέχρι την Μέση Ανατολή", "Ιατρικό και μη ιατρικό προσωπικό αναζητά σταθερά η γνωστή ΜΚΟ για τα προγράμματά της", "2024","Δια ζώσης, Ιατρική περίθαλψη");
        insertVolunteerAction("Voluntea", "Βερανζέρου 15, Αθήνα στον 5ος όροφος", "Θα σε βοηθήσει να επιλέξεις το καταλληλότερο πρόγραμμα εθελοντισμού για σένα στο εξωτερικό για το καλοκαίρι", "Κάθε Πέμπτη, σε δύο ομάδες, με την πρώτη να ξεκινά στις 16:00 και τη δεύτερη στις 17:00","Δια ζώσης");            
        insertVolunteerAction("A Kitchen for Good", "Μεταξουργείο, Αττικη", " Οικιακή Κοινωνική Κουζίνα εντός του Εθελοντικού Συντονιστικού Κέντρου (ΕΣΚ) της χώρας, καλύπτοντας σε εβδομαδιαία βάση φρέσκο φαγητό για τους άστεγους πολίτες της Αττικής", "Κάθε Σάββατο 10:00πμ", "Δια ζώσης, Βοήθεια");
        insertVolunteerAction("Πρόγραμμα Στήριξης των Πληγέντων της Θεσσαλίας για το 2024", "Σε πάνω από 12 χωριά της Θεσσαλίας", "Βοήθεια στους πληγέντες", "Ξεκίνησε το Νοέμβριο του 2023", "Δια ζώσης, Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)");
        insertVolunteerAction("#GIVINGTUESDAY", "Αττική", "Μπορείτε να προσφέρετε και εσείς αγαθά ή καθαρό και ευπρεπή ρουχισμό στο Εθελοντικό Συντονιστικό Κέντρο, ώστε να συμπεριληφθούν στα πακέτα στήριξης", " 28 Νοεμβρίου 2023","Δια ζώσης, Βοήθεια");
        insertVolunteerAction("Μαζί με το  κανάλι OPEN «Aνοίγουμε την Aγκαλιά μας στην Tρίτη ηλικία»", " Εθελοντικό Συντονιστικό Κέντρο του Humanity Greece", "Προσφορά βοήθειας σε άπορους παππούδες και γιαγιάδες κατα την περίοδο των γιορτών", "","Δια ζώσης, Βοήθεια");            
        insertVolunteerAction("«Βοήθεια στο Σπίτι»", " Εθελοντικό Συντονιστικό Κέντρο του Humanity Greece", "Προσφορά βοήθειας σε άπορους ανθρώπους, ετοιμασία φαγητού και πακέτων με είδη πρώτης ανάγκης", "Καθημερινά και κάθε Δευτέρα στη Κοινωνική κουζίνα","Δια ζώσης, Βοήθεια");
        insertVolunteerAction("WWF Προστασία για τα δάση μας", "https://www.wwf.gr/ti_mporeis_na_kaneis/ekstrateies/prostasia_gia_ta_dasi/", "Διαδικτυακή υπογραφή για την προστασία των δασών", "","Δια ζώσης, Καμπάνιες ευαισθητοποίησης");
        insertVolunteerAction("Blue Panda", "Σούνιο,Γυάρος και Σύρος", "Το ιστιοπλοϊκό σκάφος του WWF, διασχίζουμε και φέτος τη Μεσόγειο και θα μοιραστούμε με εσάς ιστορίες και εικόνες από τον πλούτο των θαλασσών μας. Μαζί θα ανακαλύψουμε τη «θάλασσα που θέλουμε»!", "Από τις 3 έως και τις 13 Σεπτεμβρίου κάθε χρόνο","Δια ζώσης, Καμπάνιες ευαισθητοποίησης");
        insertVolunteerAction("WWF:ΥΙΟΘΕΤΗΣΕ ΕΝΑ ΑΠΕΙΛΟΥΜΕΝΟ ΕΙΔΟΣ", "https://donate.wwf.gr/yiothetise", "Με μια συμβολική υιοθεσία μπορείς να κάνεις τη διαφορά μεταξύ εξαφάνισης και επιβίωσης για ένα πολύτιμο κομμάτι της άγριας ζωής.", "","Διαδικτυακά, Δωρεά");
        insertVolunteerAction("ActionAID:Γίνε Ανάδοχος", "https://actionaid.gr/gine-anadohos", "Γίνεσαι ανάδοχος παιδιού", "", "Διαδικτυακά, Δωρεά");
        insertVolunteerAction("Εθελοντισμός στο Κέντρο της ActionAid στην Αθήνα", "Αθήνα, Αττική", "Υπηρεσία Συμβουλευτικής Εύρεσης Εργασίας, Ενισχυτική διδασκαλία, Μαθήματα Ελληνικών & Αγγλικών, Μαθήματα Υπολογιστών, Απογευματινά Δημιουργικά Προγράμματα, Θεατρικό Παιχνίδι, Summer Camp", "Καθημερινές","Δια ζώσης, Παιδιά");
        insertVolunteerAction("Εθελοντισμός στα Κεντρικά Γραφεία της ActionAID", "Καντρικά γραφεία ActionAID", "Αλληλογραφία, Αρχειοθέτηση, Διοικητικές εργασίες, Τμήμα επικοινωνίας", "Καθημερινές","Δια ζώσης, Ιστοσελίδες");
        insertVolunteerAction("Εθελοντισμός σε Εκδηλώσεις της ActionAID", "", "Φεστιβάλ, Εκθέσεις Φωτογραφίας/ Ζωγραφικής, Αθλητικά Event, Γιορτές", "Κυρίως Σάββατο και Κυριακή", "Δια ζώσης, Καμπάνιες ευαισθητοποίησης");
        insertVolunteerAction("HELMEPA:¨Παγκόσμιος Εθελοντικός Καθαρισμός Ακτών", "Αττική", "ΒΙΩΜΑΤΙΚΗ ΔΡΑΣΗ ΚΑΘΑΡΙΣΜΟΥ", "Από 16 Σεπτεμβρίου μέχρι 16 Νοεμβρίου 2023","Δια ζώσης,Καθαρισμός");
        insertVolunteerAction("ΠΡΩΤΕΣ ΒΟΗΘΕΙΕΣ ΓΙΑ ΠΟΛΙΤΕΣ", "Αττική", "Σκοπός είναι οι πολίτες  να είναι σε θέση να προσφέρουν αποτελεσματική βοήθεια με ασφάλεια σε οποιοδήποτε έκτακτο περιστατικό χρειαστεί μέχρι να έρθουν οι αρμόδιες υπηρεσίες έκτακτης ανάγκης.", "Διάρκεια 12 ώρες (2 ημέρες)", "ανθρωπιστικό, εκπαίδευση");
        insertVolunteerAction("ΒΑΣΙΚΗ ΥΠΟΣΤΗΡΙΞΗ ΖΩΗΣ και ΧΡΗΣΗ ΑΥΤΟΜΑΤΟΥ ΕΞΩΤΕΡΙΚΟΥ ΑΠΙΝΙΔIΣΤΗ (BLS/AED)", "Αττική", "Το πρόγραμμα εκπαίδευσης δημιουργήθηκε το 2008 και αποσκοπεί στην αύξηση του αριθμού των  εκπαιδευμένων  πολιτών, κάθε ηλικίας, στη Βασική Καρδιοαναπνευστική Αναζωογόνηση “ΚΑΑ” και τη χρήση Αυτόματου Εξωτερικού Απινιδιστή “ΑΕΑ - AED”.", "Διάρκεια 6 ώρες (1 ημέρα)", "ανθρωπιστικό, εκπαίδευση");
        insertVolunteerAction("Ένα Χαμόγελο για Κάθε Παιδί - Κάνουμε την Ευχή Πράξη", "Κέντρα Στήριξης 'Το χαμόγελο του παιδιού' ", "Χριστουγεννιάτικη Πανελλαδική Εκστρατεία Συγκέντρωσης Τροφίμων και Ειδών Πρώτης Ανάγκης από «Το Χαμόγελο του Παιδιού» για παιδιά και οικογένειες που ζουν σε κατάσταση φτώχειας", "29 Νοεμβρίου 2023", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("Στηρίξτε την δράση μας - Χαμόγελο του παιδιού", "https://www.hamogelo.gr/gr/el/stirikste-mas/", "Για τις δωρεές σας με κατάθεση σε τραπεζικό λογαριασμό είναι απαραίτητη η ενημέρωση μας στο τηλέφωνο 210 33 06 140 ή με fax στο 210 38 43 038 ή με αποστολή e-mail στο info@hamogelo.gr. Η ενημέρωση θα πρέπει να γίνει μετά τη δωρεά σας προκειμένου να αποσταλεί η σχετική απόδειξη και ευχαριστήρια επιστολή.", "", "διαδικτυακός εθελοντισμός");
        insertVolunteerAction("Ένα Χαμόγελο για Κάθε Παιδί", "Αττική", "Έλα στα Xριστουγεννιάτικα bazaars για να κάνουμε την Ευχή Πράξη!", "30 Νοεμβρίου 2023", "ανθρωπιστική στήριξη");
        insertVolunteerAction("DOGGY DAY OUT", "https://form.jotform.com/232765971310154", "Υιοθεσία ενός σκύλου για μία μερα", "", "βοήθεια σε ζώα");
        insertVolunteerAction("Homeless Animals Need Your Help!", "https://athenshumanesociety.org/donate/", "Δωρεά χρημάτων στο σωματείο Athens Area Humane Society για τα άπορα ζωάκια", "", "διαδικτυακός εθελοντισμός, ζώα");
        insertVolunteerAction("WWF: υιοθέτησε τώρα μια πολική αρκούδα", "https://donate.wwf.gr/yiothetise/yiothetise-mia-poliki-arkouda?utm_source=newsletter&utm_medium=email&utm_campaign=xmas+2023_adoption_polar+bear_subscribers&cmid=2527be98-3666-4666-8628-48cc4cfaf0e5", "Οι πολικές αρκούδες εξαρτώνται από τον πάγο της Αρκτικής για να κυνηγήσουν και να μεγαλώσουν τα μικρά τους. Τα τελευταία χρόνια ωστόσο γίνονται όλο πιο αδύνατες και πεινασμένες, αντιμετωπίζοντας σοβαρές προκλήσεις για την επιβίωσή τους. Μέχρι το 2050, ο αριθμός των πολικών αρκούδων ενδέχεται να μειωθεί δραματικά, λόγω της ταχείας απώλειας του θαλάσσιου πάγου. Η κλιματική αλλαγή απειλεί την επιβίωσή τους!", "","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("WWF: Φύτεψε τώρα ένα δέντρο στο Σούνιο! ","Σούνιο, Αττικής", "Κάθε δέντρο που φυτεύουμε είναι μια ελπίδα για το μέλλον, μοιράζει αισιοδοξία και χαρά.", "", "Δενδροφύτευση, περιβάλλον");
        insertVolunteerAction("WWF: Φύτεψε τώρα ένα δέντρο στο Σούνιο!", "https://donate.wwf.gr/forest/fytepse-ena-dentro-xmas-2023?utm_source=newsletter&utm_medium=email&utm_campaign=xmas2023_plant+a+tree_vol3_subscribers&cmid=a9ad0b13-731e-4908-968c-ee3162283c26", "", "", "Διαδικτυακός εθελοντισμός, περιβάλλον");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΜΙΑ ΚΑΡΕΤΑ", "https://donate.wwf.gr/yiothetise/kareta", "","","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΕΝΑ ΔΕΛΦΙΝΙ", "https://donate.wwf.gr/yiothetise/delfini", "","","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΕΝΑ ΓΟΡΙΛΑ", "https://donate.wwf.gr/yiothetise/gorilas", "","", "διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΕΝΑΝ ΕΛΕΦΑΝΤΑ","https://donate.wwf.gr/yiothetise/elefantas","","","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΕΝΑΝ ΠΙΓΚΟΥΙΝΟ","https://donate.wwf.gr/yiothetise/penguin","","","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΜΙΑ ΤΙΓΡΗ","https://donate.wwf.gr/yiothetise/yiothetise-mia-tigri","","","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΕΝΑ ΠΑΝΤΑ","https://donate.wwf.gr/yiothetise/panta","","","διαδικτυακός εθελοντισμός, ζωα");
        insertVolunteerAction("ΥΙΟΘΕΤΗΣΕ ΜΙΑ ΠΑΡΑΛΙΑ","https://www.wwf.gr/poioi_eimaste/apologismos_2022/yiothetise_mia_paralia/","","","διαδικτυακός εθελοντισμός, περιβάλλον");
        insertVolunteerAction("ΓΙΝΕ ΑΝΑΔΟΧΟΣ ΓΟΝΙΟΣ","https://www.crete.gov.gr/gine-anadochos-gonios/","","","ανθρωπιστική βοήθεια");
        insertVolunteerAction("Volunteers at UNICEF","https://www.unicef.org/careers/volunteers-unicef","","","διαδικτυακός εθελοντισμός");
        insertVolunteerAction("Μαθήματα Μουσικής ή Χορού", "Αθήνα", "Μαθήματα Μουσικής ή Χορού σε παιδιά και νεαρούς πρόσφυγες:http://www.ethelon.org/job/15-5/", "", "ανθρωπιστική υποστήριξη");
        insertVolunteerAction("Μαθήματα Εικαστικών Τεχνών", "Αθήνα", "Μαθήματα Ζωγραφικής, Κεραμικής, Αγγειοπλαστικής, Φωτογραφίας σε παιδιά και νεαρούς πρόσφυγες:http://www.ethelon.org/job/10-40/", "", "ανθρωπιστική υποστήριξη");
        insertVolunteerAction("Μαθήματα Θεάτρου", "Αθήνα", "Μαθήματα Θεάτρου/Θεατρικό Παιχνίδι σε παιδιά και νεαρούς πρόσφυγες:http://www.ethelon.org/job/10-39/", "", "ανθρωπιστική υποστήριξη");
        insertVolunteerAction("Φωτογραφική Εκδήλωση Ευαισθητοποίησης", "Αθήνα, Μεταξουργείο", "http://www.ethelon.org/job/10-37/", "", "ανθρωπιστική βοήθεια, εκπαίδευση");
        insertVolunteerAction("Social Media Specialist", "Πυλαία, Θεσσαλονίκη", "http://www.ethelon.org/job/social-media-specialist-3/", "", "ανθρωπιστικο, δια ζωσης, διαδικτυακός");
        insertVolunteerAction("POSIDONIA Non-Profit Company", "http://www.ethelon.org/ngo/posidonia-non-profit-company/", "","", "ανθρωπιστική βοήθεια");
        insertVolunteerAction("Εθελοντική Αστερο-Υποστήριξη στο πρόγραμμα «Αστέρι της Ευχής»", "http://www.ethelon.org/job/10-36/", "", "", "ανθρωπιστικο");
        insertVolunteerAction("Volunteer Greek Teacher", "http://www.ethelon.org/job/volunteer-greek-teacher/", "", "", "εκπαίδευση, ανθρωπιστική βπήθεια");
                

                


    }

}
