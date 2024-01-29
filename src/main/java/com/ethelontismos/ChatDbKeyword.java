package com.ethelontismos;
import java.lang.StringBuilder;
import java.util.List;

/**
 * Σύντομη περιγραφή κλάσης:
 * Η κλάση περιέχει μία μόνο μέθοδο για την δημιουργία ενός Prompt.
 *
 * Αναλυτική περιγραφή:
 * Μέσω ενός String Builder δημιουργώ το prompt-μήνυμα για την τροφοδότηση του ChatGTP 3.5,
 * ώστε αυτό να προτείνει στο χρήστη τις κατάλληλες δράσεις βάση των ενδιαφερόντων του.
 */

public class ChatDbKeyword {
    /**
     * Εκτενής επεξήγηση της μεθόδου:
     * Δημιουργία ενός μηνύματος για το ChatGPT μέσω ενός String Builder(sb) το οποίο περιέχει:
     * τα περιεχόμενα της DB με τις εθελοντικές δράσεις σαν λίστα από Strings,
     * το targetKeyword που είναι το String με τα ενδιαφέροντα του εκάστοτε χρήστη
     * και το όνομα του χρήστη.
     * Επιπλέον, τo sb περιέχει και μηνύματα προτροπής στο Chat όπως:
     * κάνε match τα δεδομένα της λίστας με το keyword,
     * γράψε κείμενο που προτείνει στον χρήστη με όνομα +name τις σωστά - αντιστοιχισμένες δράσεις.
     */
        
    public static String promptBuilder(String targetkeyword,List<VolunteerAction> allActions,String name) {

        StringBuilder sb = new StringBuilder();   
        String x = ("");

        try {
            sb.append("Θα σου δώσω μία λίστα με δεδομένα,τα οποία θέλω να αντιστοιχίσεις με αυτό το keyword και να κρατήσεις μόνο όσα δεδομένα ταιριάζουν");
            sb.append(targetkeyword);
            sb.append("\n" + "Αυτά είναι τα δεδομένα: ");
            for (VolunteerAction var : allActions) {
                sb.append(var).append("\n");
            }
            sb.append("\n Γράψε ένα κείμενο που θα προτείνει στον χρήστη με όνομα: " +name +"τις εθελοντικές δράσεις που θα βρείς απο την αντιστοίχιση που θα κάνεις πιό πάνω");
            return sb.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return x;
        }
    }
}
