import java.util.List;

public class Main {

    public static void main(String[] args) {

        VolunteerDB.fillDB();
        List<VolunteerAction> allActions = VolunteerDB.getAllVolunteerActions();
        String v = "Δια ζώσης, Βοήθεια, Όχι περιβάλλον";
        String targetKeyword = RemoveNegativeInterests.removeNegativeInterests(v);
        System.out.println(targetKeyword.toString());
        List<VolunteerAction> filteredActions = VolunteerActionHandler.
        filterByKeywords(allActions, targetKeyword);
        
        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Δράσεις με το keyword '" + targetKeyword + "':");

        for (VolunteerAction action : filteredActions) {

            System.out.println(action);

        }

    }

}
