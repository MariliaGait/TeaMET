public class FillVolunteerDB {

    public static void main(String[] args) {

        //create database and volunteer actions table
        VolunteerDB.createDatabase();
        VolunteerDB.dropTable();
        VolunteerDB.createTable();

        //insert volunteer actions to table
        VolunteerDB.insertVolunteerAction("Συγκέντρωση Χριστουγεννιάτικων Δώρων για παιδιά", "Αττική", "1 ώρα, δια ζώσης, παιδιά, ατομικό, ανθρωπιστικό", "2023-12-16 09:30 - 13:30");
        VolunteerDB.insertVolunteerAction("Εθελοντική Αιμοδοσία Ελληνικού Ερυθρού Σταυρού", "Αγιος Στέφανος, Αττική", "1 ώρα, δια ζώσης, ατομικό, ανθρωπιστικό, αιμοδοσία", "2023-12-16 10:00 - 16:00");
        VolunteerDB.insertVolunteerAction("Δεντροφύτευση στην Πεντέλη", "Πεντέλη, Αττική", "δια ζώσης, 3-4 ώρες, ομαδικό, περιβάλλον, χειρονακτικό", "2023-12-17 10:00");
        VolunteerDB.insertVolunteerAction("Εθελοντική Αιμοδοσία Ελληνικού Ερυθρού Σταυρού", "Νέα Σμύρνη, Αττική", "1 ώρα, δια ζώσης, ατομικό, ανθρωπιστικό, αιμοδοσία", "2023-12-16 16:00 - 21:00");

        //print all volunteer actions in database
        System.out.println(VolunteerDB.getAllVolunteerActions());

    }

}
