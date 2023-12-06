import java.util.Scanner;

public class UsersInterests {
    public static String return_result(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
        String location = scanner.next();
        System.out.println("Ποια κατηγορία προτιμάτε; 1.Δράσεις δια ζώσης   2.Διαδικτυακό εθελοντισμό ");
        int category = scanner.nextInt();
        commentcategory(category);
        if (category == 1){
            int environment, animal, human;
            System.out.println("Έχετε ιατρικές γνώσεις; 1.Ναι 2.Όχι");
            int medical = scanner.nextInt();
            System.out.println("Σας ενδιαφέρει το περιβάλλον και θα θέλατε να ασχοληθείτε με αυτό; 1.Ναι 2.Όχι");
            int qenvironment = scanner.nextInt();
            if (qenvironment == 1) {
                System.out.println("Ποιά από τις παρακάτω περιβαλλοντικές δράσεις προτιμάτε; 1.Καμπάνιες ευαισθητοποίησης 2.Καθαρισμός δημόσιων χώρων 3.Δενδροφύτευση/Δασοφύτευση 4.Ανακύκλωση");
                environment = scanner.nextInt();
            } else {
                environment = 0;
            }
            if (medical == 1){
                System.out.println("Αγαπάτε τα ζώα και θέλετε να τα βοηθήσετε; 1.Ναι 2.Όχι");
                int qanimal = scanner.nextInt();
                if (qanimal == 1) {
                    System.out.println("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Κτηνιατριακή περίθαλψη 3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 5.Προστασία άγριας ζωής");
                    animal = scanner.nextInt();
                } else {
                    animal = 0;
                }
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις; 1.Ναι 2.Όχι");
                int qhuman = scanner.nextInt();
                if (qhuman == 1) {
                    System.out.println("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) 5.Καμπάνιες ευαισθητοποίησης");
                    human = scanner.nextInt();
                } else {
                    human = 0;
                }
                return collectUserInterest1(location, category, medical, environment, animal, human);
            } else {
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα; 1.Ναι 2.Όχι");
                int qanimal = scanner.nextInt();
                if (qanimal == 1) {
                    System.out.println("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 3.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 4.Προστασία άγριας ζωής");
                    animal = scanner.nextInt();
                } else {
                    animal = 0;
                }
                System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις; 1.Ναι 2.Όχι");
                int qhuman = scanner.nextInt();
                if (qhuman == 1) {
                    System.out.println("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Καμπάνιες ευαισθητοποίησης");
                    human = scanner.nextInt();
                } else {
                    human = 0;
                }
                return collectUserInterest1(location, category, medical, environment, animal, human);
            }
        } else {
            int marketing, translate, programm;
            marketing=0;
            translate=0;
            programm=0;
            System.out.println("Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ; 1.Ναι 2. Όχι");
            int money = scanner.nextInt();
            System.out.println("Γνωρίζετε κάποια ξένη γλώσσα και θέλετε να βοηθήσετε μέσα από τις γνώσεις σας; 1.Ναι 2. Όχι");
            int qtranslate = scanner.nextInt();
            if (qtranslate == 1) {
                System.out.println("Θα σας ενδιέφερε να κάνετε μετάφραση ξένων κειμένων στα ελληνικά είτε το αντίστροφο; 1.Ναι 2. Όχι");
                translate = scanner.nextInt();
            }
            System.out.println("Γνωρίζετε κάποια γλώσσα προγραμματισμού ή είστε ειδικός στην πληροφορική; 1.Ναι 2. Όχι");
            int qprogramm = scanner.nextInt();
            if (qprogramm == 1) {
                System.out.println("Θα σας ενδιέφερε να σχεδιάζετε και να υλοποιείτε ιστοσελίδες οργανισμών που το έχουν ανάγκη; 1.Ναι 2. Όχι");
                programm = scanner.nextInt();
            }
            System.out.println("Θα σας ενδιέφερε ο τομέας του marketing; 1.Ναι 2. Όχι");
            int qmarketing = scanner.nextInt();
            if (qmarketing == 1) {
                System.out.println("Θα σας ενδιέφερε να βοηθήσετε στην υλοποίηση για καμπάνιες ευαισθητοποίησης; 1.Ναι 2. Όχι");
                marketing = scanner.nextInt();
            }
            System.out.println("Είστε ψυχολόγος ή κοινωνικός λειτουργός; Σχετίζονται μήπως οι σπουδές σας με την παροχή ψυχολογικής υποστήριξης;Θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών; 1.Ναι 2. Όχι");
            int consulting = scanner.nextInt();
            scanner.close(); 
            return collectUserInterest2(location, money, marketing, translate, programm, consulting);
        } 
         
            
    }   
   
    public static String collectUserInterest1(String l, int m, int e, int a, int h, int s){
        String ca = "Δράσεις δια ζώσης";
        String fenvironment, fhuman, fanimal;
        if (e == 0){
            fenvironment = "οχι περιβαλλον";
        } else {
            if (e == 1){
                fenvironment = "Καμπάνιες ευαισθητοποίησης";
            } else if (e == 2){
                fenvironment = "Καθαρισμός δημόσιων χώρων";
            } else if (e == 3) {
                fenvironment = "Δενδροφύτευση/Δασοφύτευση";
            } else {
                fenvironment = "Ανακύκλωση";
            }
        }
        if (m == 1){  // ΕΧΕΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
            String me = "Έχω ιατρικές γνώσεις";
            if (a == 0){
                fanimal = "Όχι ζώα";
            } else {
                 if (a == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΖΩΑ ΚΑΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                    fanimal = "Καμπάνιες ευαισθητοποίησης";
                } else if (a == 2){
                    fanimal = "Κτηνιατριακή περίθαλψη";
                } else if (a == 3){
                    fanimal = "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
                } else if (a == 4){
                    fanimal = "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
                } else {
                    fanimal = "Προστασία άγριας ζωής";
                }
            }
            if (h == 0){
                fhuman = "Όχι ανθρωπους";
            } else {
                if (h == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΑΝΘΡΩΠΟΥΣ ΚΑΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
                    fhuman = "Αιμοδοσία";
                } else if (h == 2){
                    fhuman = "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια";
                } else if (h == 3){
                    fhuman = "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
                } else if (h == 4){
                    fhuman = "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα)";
                } else {
                    fhuman = "Καμπάνιες ευαισθητοποίησης";
                }
            }

        } else { //ΔΕΝ ΕΧΕΙ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ//
            if (a == 0){
                fanimal = "Όχι ζώα";
            } else {
                if (a == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΖΩΑ ΧΩΡΙΣ ΙΑΤΡΙΚΑ//
                    fanimal = "Καμπάνιες ευαισθητοποίησης";
                    } else if (a == 2){
                    fanimal = "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
                } else if (a == 3){
                    fanimal = "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
                } else {
                    fanimal = "Προστασία άγριας ζωής";
                }
            }
            if (h == 0){
                fhuman = "Όχι ανθρωπους";
            } else {
                if (h == 1){ //ΑΣΧΟΛΙΑ ΜΕ ΑΝΘΡΩΠΟΥΣ ΧΩΡΙΣ ΙΑΤΡΙΚΑ//
                    fhuman = "Αιμοδοσία";
                } else if (h == 2){
                    fhuman = "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια";
                } else if (h == 3){
                    fhuman = "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
                } else {
                    fhuman = "Καμπάνιες ευαισθητοποίησης";
                }
            }
        }
        String result1 = ca + l + fenvironment + fanimal + fhuman;
        return result1;
    }
    public static String collectUserInterest2(String l, int mo, int ma, int tr, int pr, int co){
        String ca = "Δράσεις διαδικτύου";
        String fmoney, fcampaign, ftranslate, fhttp , fhelp;
        if (mo == 2) {
            fmoney = ("Όχι χρηματική δωρεά");
        } else {
            fmoney = ("Χρηματική δωρεά");
        }
        if (ma == 2) {
            fcampaign = ("Όχι καμπάνιες ευαισθητοποίησης");
        } else {
            fcampaign = ("καμπάνιες ευαισθητοποίησης");
        }
        if (tr == 2) {
            ftranslate = ("Όχι μετάφραση κειμένων στα αγγλικά");
        } else {
            ftranslate = ("Μετάφραση κειμένων στα αγγλικά");
        }
        if (pr == 2) {
            fhttp = ("Όχι σχεδιασμό και υλοποίηση ιστοσελίδων για οργανισμούς");
        } else {
            fhttp = ("Σχεδιασμός και υλοποίηση ιστοσελίδων για οργαισμούς");
        }
        if (co == 2) {
            fhelp = ("Όχι διαδικτυακή υποστήριξη και βοήθεια με την παροχή συμβουλών");
        } else {
            fhelp = ("Διαδικτυακή υποστήριξη και βοήθεια με την παροχή συμβουλών");
        }
        String result2 = l + ca + fmoney + fcampaign + ftranslate + fhttp + fhelp ;
        return result2;
    }

    public static void commentcategory(int x){
            if (x == 1) {
                System.out.println("classic");
            } else {
                System.out.println("alternative");
            }
        }
}