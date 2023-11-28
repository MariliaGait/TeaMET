//η κλαση αυτη θα εχει ακριβως ιδια δομη με την κλαση usersprofile αλλα θελω πρωτα να ολοκληρωσουμε το κομματι των ερωτησεων για να δω πως θα το κανω και ποια στοιχεια θα κανω return
// αφου την ολοκληρωσουμε, με ιδιο τροπο θα την καλει η κλαση εθελοντισμος
import java.util.Scanner;

public class UsersInterests {
    public void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
        String location = scanner.next();
        scanner.close();
        System.out.print("Ποια κατηγορία προτιμάτε: 1.δράσεις δια ζώσης   2.διαδικτυακό εθελοντισμό ");
        int category = scanner.nextInt();
        scanner.close();
        System.out.print("Έχετε ιατρικές γνώσεις; 1.Ναι 2.Όχι");
        int medical = scanner.nextInt();
        System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Καθαρισμός δημόσιων χώρων 3.Δενδροφύτευση/Δασοφύτευση 4.Ανακύκλωση");
        int environment = scanner.nextInt();
        if (medical == 1){
            System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Κτηνιατριακή περίθαλψη 3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 5.Προστασία άγριας ζωής");
            int animal = scanner.nextInt();
            System.out.print("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) 5.Καμπάνιες ευαισθητοποίησης");
            int human = scanner.nextInt();
            String result = collectUserInterest(location, category, medical, environment, animal, human);
            System.out.print(result);
        } else {
            System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 3.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 4.Προστασία άγριας ζωής");
            int animal = scanner.nextInt();  
            System.out.print("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Καμπάνιες ευαισθητοποίησης");
            int human = scanner.nextInt();
            String result = collectUserInterest(location,category, medical, environment, animal, human);
            System.out.print(result);
            scanner.close();
        }
    }
     String collectUserInterest(String l, int c, int m, int e, int a, int h){
        if (c == 1){
           String ca = "Δράσεις δια ζώσης";
           if (e == 1){
            String t = "Καμπάνιες ευαισθητοποίησης";
           } else if (e == 2){
            String t = "Καθαρισμός δημόσιων χώρων";
           } else if (e == 3) {
            String t = "Δενδροφύτευση/Δασοφύτευση";
           } else{
            String t = "Ανακύκλωση"; 
           }
           if (m == 1){  // ΕΧΕΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
            String me = "Έχω ιατρικές γνώσεις";
            if (a == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΖΩΑ ΚΑΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                String n = "Καμπάνιες ευαισθητοποίησης"; 
            } else if (a == 2){
                String n = "Κτηνιατριακή περίθαλψη";
            } else if (a == 3){
                String n = "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
            } else if (a == 4){
                String n = "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
            } else {
                String n = "Προστασία άγριας ζωής";
            }
            if (h == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΑΝΘΡΩΠΟΥΣ ΚΑΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                String u = "Αιμοδοσία";
            } else if (h == 2){
                String u = "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια";
            } else if (h == 3){
                String u = "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
            } else if (h == 4){
                String u = "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα)";
            } else {
                String u = "Καμπάνιες ευαισθητοποίησης";
            }
           } else { //ΔΕΝ ΕΧΕΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
            if (a == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΖΩΑ ΧΩΡΙΣ ΙΑΤΡΙΚΑ//
                String n = "Καμπάνιες ευαισθητοποίησης"; 
            } else if (a == 2){
                String n = "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
            } else if (a == 3){
                String n = "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
            } else {
                String n = "Προστασία άγριας ζωής";
            }
            if (h == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΑΝΘΡΩΠΟΥΣ ΧΩΡΙΣ ΙΑΤΡΙΚΑ//
                String u = "Αιμοδοσία";
            } else if (h == 2){
                String u = "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια";
            } else if (h == 3){
                String u = "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
            } else {
                String u = "Καμπάνιες ευαισθητοποίησης";
            }
           }
        } else {
            String x = "Διαδικτυακός εθελοντιμσός";

        }
     //ΣΥΝΔΕΣΗ ΜΕ CHAT//
     //RETURN ΑΠΟΤΕΛΕΣΜΑ ΤΟΥ CHAT//
    }

    

    

}

import java.util.Scanner;

public class UsersInterests {
    public void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
        String location = scanner.next();
        scanner.close();
        System.out.print("Ποια κατηγορία προτιμάτε: 1.δράσεις δια ζώσης   2.διαδικτυακό εθελοντισμό ");
        int category = scanner.nextInt();
        scanner.close();
        int environment, animal, human;
        if (category == 1){
            System.out.print("Έχετε ιατρικές γνώσεις; 1.Ναι 2.Όχι");
            int medical = scanner.nextInt();
            System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν το περιβάλλον; 1.Ναι 2.Όχι");
            int qenvironment = scanner.nextInt();
            if (qenvironment = 1) {
                System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Καθαρισμός δημόσιων χώρων 3.Δενδροφύτευση/Δασοφύτευση 4.Ανακύκλωση");
                environment = scanner.nextInt();
            } else {
                environment = 0;
            }
            if (medical == 1){
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα; 1.Ναι 2.Όχι");
                int qanimal = scanner.nextInt();
                if (qanimal = 1) {
                    System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Κτηνιατριακή περίθαλψη 3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 5.Προστασία άγριας ζωής");
                    animal = scanner.nextInt();
                } else {
                animal = 0;
                }
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις; 1.Ναι 2.Όχι");
                int qhuman = scanner.nextInt();
                if (qhuman = 1) {
                    System.out.print("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) 5.Καμπάνιες ευαισθητοποίησης");
                    human = scanner.nextInt();
                } else {
                human = 0;
                }
                String result = collectUserInterest1(location, category, medical, environment, animal, human);
                System.out.print(result);
            } else {
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα; 1.Ναι 2.Όχι");
                int qanimal = scanner.nextInt();
                if (qanimal = 1) {
                    System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 3.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 4.Προστασία άγριας ζωής");
                    animal = scanner.nextInt();
                } else {
                animal = 0;
                }
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις; 1.Ναι 2.Όχι");
                int qhuman = scanner.nextInt();
                if (qhuman = 1) {
                    System.out.print("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Καμπάνιες ευαισθητοποίησης");
                    human = scanner.nextInt();
                } else {
                human = 0;
                }
            }
            String result1 = collectUserInterest(location, medical, environment, animal, human);
            System.out.print(result1);
            scanner.close();
        } else {
            int marketing, translate, programm;
            System.out.println("Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ; 1.Ναι 2. Όχι");
            int money = scanner.nextInt();
            System.out.println("Γνωρίζετε αγγλικά; 1.Ναι 2. Όχι");
            int qtranslate = scanner.nextInt();
            if (qtranslate == 1) {
                System.out.println("Θα σας ενδιέφερε να κάνετε μετάφραση αγγλικών κειμένων στα ελληνικά είτε το αντίστροφο; 1.Ναι 2. Όχι");
                translate = scanner.nextInt();
            }
            System.out.println("Γνωρίζετε κάποια γλώσσα προγραμματισμού; 1.Ναι 2. Όχι");
            int qprogramm = scanner.nextInt();
            if (qprogramm == 1) {
                System.out.println("Θα σας ενδιέφερε να σχεδιάζετε και να υλοποιείτε ιστοσελίδες οργανισμών; 1.Ναι 2. Όχι");
                programm = scanner.nextInt();
            }
            System.out.println("Θα σας ενδιέφερε ο τομέας του marketing; 1.Ναι 2. Όχι");
            int qmarketing = scanner.nextInt();
            if (qmarketing == 1) {
                System.out.println("Θα σας ενδιέφερε να βοηθήσετε στην υλοποίηση για καμπάνιες ευαισθητοποίησης; 1.Ναι 2. Όχι");
                marketing = scanner.nextInt();
            }
            System.out.println("θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών 1.Ναι 2. Όχι");
            int consulting = scanner.nextInt();
            String result2 = collectUserInterest2(location, money, marketing, translate, programm, consulting);
        }

    }
    public static String collectUserInterest1(String l, int m, int e, int a, int h, int s){
            String ca = "Δράσεις δια ζώσης";
            if (e == 0){
                String t = "οχι περιβαλλον";
            } else {
                if (e == 1){
                    String t = "Καμπάνιες ευαισθητοποίησης";
                } else if (e == 2){
                    String t = "Καθαρισμός δημόσιων χώρων";
                } else if (e == 3) {
                    String t = "Δενδροφύτευση/Δασοφύτευση";
                } else {
                    String t = "Ανακύκλωση"; 
                }
            }
            if (m == 1){  // ΕΧΕΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                String me = "Έχω ιατρικές γνώσεις";
                if (a == 0){
                    String n = "Όχι ζώα";
                } else {
                    if (a == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΖΩΑ ΚΑΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                        String n = "Καμπάνιες ευαισθητοποίησης"; 
                    } else if (a == 2){
                        String n = "Κτηνιατριακή περίθαλψη";
                    } else if (a == 3){
                        String n = "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
                    } else if (a == 4){
                        String n = "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
                    } else {
                        String n = "Προστασία άγριας ζωής";
                    }
                }
                if (h == 0){
                    String u = "Όχι ανθρωπους";
                } else {
                    if (h == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΑΝΘΡΩΠΟΥΣ ΚΑΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                        String u = "Αιμοδοσία";
                    } else if (h == 2){
                        String u = "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια";
                    } else if (h == 3){
                        String u = "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
                    } else if (h == 4){
                        String u = "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα)";
                    } else {
                        String u = "Καμπάνιες ευαισθητοποίησης";
                    }
                }

            } else { //ΔΕΝ ΕΧΕΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                if (a == 0){
                    String n = "Όχι ζώα";
                } else {
                    if (a == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΖΩΑ ΧΩΡΙΣ ΙΑΤΡΙΚΑ//
                        String n = "Καμπάνιες ευαισθητοποίησης"; 
                    } else if (a == 2){
                        String n = "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
                    } else if (a == 3){
                        String n = "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
                    } else {
                        String n = "Προστασία άγριας ζωής";
                    }
                }
                if (h == 0){
                    String u = "Όχι ανθρωπους";
                } else {
                    if (h == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΑΝΘΡΩΠΟΥΣ ΧΩΡΙΣ ΙΑΤΡΙΚΑ//
                        String u = "Αιμοδοσία";
                    } else if (h == 2){
                        String u = "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια";
                    } else if (h == 3){
                        String u = "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
                    } else {
                        String u = "Καμπάνιες ευαισθητοποίησης";
                    }
                }
            }
            String result1 = ca + l + t + n + u;
            return result1;
    }
    public static String collectUserInterest2(String l, int mo, int ma, int tr, int pr, int co){
        String ca = "Δράσεις διαδικτύου";
        String m, mm, t, p , c;
        if (mo == 2) {
            m = ("Όχι χρηματική δωρεά");
        } else {
            m = ("Χρηματική δωρεά");
        }
        if (ma == 2) {
            mm = ("Όχι καμπάνιες ευαισθητοποίησης");
        } else {
            mm = ("καμπάνιες ευαισθητοποίησης");
        }
        if (tr == 2) {
            t = ("Όχι μετάφραση κειμένων στα αγγλικά");
        } else {
            t = ("Μετάφραση κειμένων στα αγγλικά");
        }
        if (pr == 2) {
            p = ("Όχι σχεδιασμό και υλοποίηση ιστοσελίδων για οργανισμούς");
        } else {
            p = ("Σχεδιασμός και υλοποίηση ιστοσελίδων για οργαισμούς");
        }
        if (co == 2) {
            c = ("Όχι διαδικτιακή υποσήριξη και βοήθεια με την παροχή συμβουλών");
        } else {
            c = ("Διαδικτιακή υποσήριξη και βοήθεια με την παροχή συμβουλών");
        }
        String result2 = l + ca + m + mm + t + p + c ;
        return result2; 
    }
}
