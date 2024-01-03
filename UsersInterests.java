import java.util.Arrays;
import java.util.Scanner;

public class UsersInterests {
    public static String return_result(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
        String location = scanner.next();
        // Question 2: Category selection
        int category;
        do {
            System.out.print("Ποια κατηγορία προτιμάτε: 1. Δράσεις δια ζώσης   2. Διαδικτυακό εθελοντισμό ");
            category = scanner.nextInt();
            if (category != 1 && category != 2) {
                System.out.println("Επιλέξατε μη έγκυρη κατηγορία. Παρακαλώ επιλέξτε 1 ή 2.");
            }
        } while (category != 1 && category != 2);
        // ΔΙΑ ΖΩΣΗΣ
        if (category==1){
            int environment, animal, human, medical,qenvironment,qhuman,qanimal;
            // ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ
            do {
                System.out.print("Έχετε ιατρικές γνώσεις; 1. Ναι 2. Όχι");
                medical = scanner.nextInt();
            
                if (medical < 1 || medical > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (medical < 1 || medical > 2);
            // ΠΕΡΙΒΑΛΛΟΝ ΝΑΙ/ΟΧΙ
            do {
                System.out.print("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν το περιβάλλον; 1. Ναι 2. Όχι");
                qenvironment = scanner.nextInt();
            
                if (qenvironment < 1 || qenvironment > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (qenvironment < 1 || qenvironment > 2);
            //ΠΕΡΙΒΑΛΛΟΝ ΔΡΑΣΕΙΣ ΑΝ ΝΑΙ
            if (qenvironment == 1) {
                do {
                    System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε; 1. Καμπάνιες ευαισθητοποίησης 2. Καθαρισμός δημόσιων χώρων 3. Δενδροφύτευση/Δασοφύτευση 4. Ανακύκλωση");
                    environment = scanner.nextInt();
            
                    if (environment < 1 || environment > 4) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε από 1 έως 4.");
                    }
                } while (environment < 1 || environment > 4);
            } else {
                environment = 0;
            }
            // ΖΩΑ ΝΑΙ/ΟΧΙ ΑΝ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ=ΝΑΙ
            if (medical == 1) {
            
                do {
                    System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα; 1.Ναι 2.Όχι");
                    qanimal = scanner.nextInt();
            
                    if (qanimal < 1 || qanimal > 2) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                    }
                } while (qanimal < 1 || qanimal > 2);
                //ΖΩΑ ΔΡΑΣΕΙΣ
                if (qanimal == 1) {
                    do {
                        System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Κτηνιατριακή περίθαλψη 3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 5.Προστασία άγριας ζωής");
                        animal = scanner.nextInt();
            
                        if (animal < 1 || animal > 5) {
                            System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε από 1 έως 5.");
                        }
                    } while (animal < 1 || animal > 5);
                } else {
                    animal = 0;
                }
                //ΑΝΘΡΩΠΙΣΤΙΚΕΣ ΝΑΙ/ΟΧΙ ΑΝ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ=ΝΑΙ
                do {
                    System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις; 1.Ναι 2.Όχι");
                    qhuman = scanner.nextInt();
                
                    if (qhuman < 1 || qhuman > 2) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                    }
                } while (qhuman < 1 || qhuman > 2);
                //ΑΝΘΡΩΠΙΣΤΙΚΕΣ ΔΡΑΣΕΙΣ
                if (qhuman == 1) {
                    do {
                        System.out.print("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) 5.Καμπάνιες ευαισθητοποίησης");
                        human = scanner.nextInt();
                
                        if (human < 1 || human > 5) {
                            System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε από 1 έως 5.");
                        }
                    } while (human < 1 || human > 5);
                } else {
                    human = 0;
                }
                
                return collectUserInterest1(location, location, category, medical, environment, animal, human);
                //ΖΩΑ ΝΑΙ/ΟΧΙ ΑΝ ΙΑΤΡΙΚΕΣ=ΟΧΙ
            } else {
                do {
                    System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα; 1.Ναι 2.Όχι");
                    qanimal = scanner.nextInt();
                
                    if (qanimal < 1 || qanimal > 2) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                    }
                } while (qanimal < 1 || qanimal > 2);
                //ΖΩΑ ΔΡΑΣΕΙΣ
                if (qanimal == 1) {
                    do {
                        System.out.print("Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε; 1.Καμπάνιες ευαισθητοποίησης 2.Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια 3.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη 4.Προστασία άγριας ζωής");
                        animal = scanner.nextInt();
                
                        if (animal < 1 || animal > 4) {
                            System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε από 1 έως 4.");
                        }
                    } while (animal < 1 || animal > 4);
                } else {
                    animal = 0;
                }
                //ΑΝΘΡΩΠΙΣΤΙΚΕΣ ΝΑΙ/ΟΧΙ ΑΝ ΙΑΤΡΙΚΕΣ ΓΝΩΣΕΙΣ=ΟΧΙ
                do {
                    System.out.println("Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις; 1.Ναι 2.Όχι");
                    qhuman = scanner.nextInt();
                
                    if (qhuman < 1 || qhuman > 2) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                    }
                } while (qhuman < 1 || qhuman > 2);
                //ΑΝΘΡΩΠΙΣΤΙΚΕΣ ΔΡΑΣΕΙΣ
                if (qhuman == 1) {
                    do {
                        System.out.print("Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε; 1.Αιμοδοσία 2.Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια 3.Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές) 4.Καμπάνιες ευαισθητοποίησης");
                        human = scanner.nextInt();
                
                        if (human < 1 || human > 4) {
                            System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε από 1 έως 4.");
                        }
                    } while (human < 1 || human > 4);
                } else {
                    human = 0;
                }
                return removeNegativeInterests(collectUserInterest1(location, location, category, medical, environment, animal, human));
            }
        //ΔΙΑΔΙΚΤΥΑΚΟΣ
        }else {
            int marketing, translate, programm, money, qtranslate, qprogramm, qmarketing,consulting;
            marketing=0;
            translate=0;
            programm=0;
            //ΧΡΗΜΑΤΙΚΗ ΔΩΡΕΑ
            do {
                System.out.println("Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ; 1.Ναι 2.Όχι");
                money = scanner.nextInt();
            
                if (money < 1 || money > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (money < 1 || money > 2);
            //ΑΓΓΛΙΚΑ ΝΑΙ/ΟΧΙ
            do {
                System.out.println("Γνωρίζετε αγγλικά; 1.Ναι 2.Όχι");
                qtranslate = scanner.nextInt();
            
                if (qtranslate < 1 || qtranslate > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (qtranslate < 1 || qtranslate > 2);
            //ΑΓΓΛΙΚΑ ΔΡΑΣΕΙΣ ΑΝ ΑΓΓΛΙΚΑ=ΝΑΙ
            if (qtranslate == 1) {
                do {
                    System.out.println("Θα σας ενδιέφερε να κάνετε μετάφραση αγγλικών κειμένων στα ελληνικά είτε το αντίστροφο; 1.Ναι 2.Όχι");
                    translate = scanner.nextInt();
            
                    if (translate < 1 || translate > 2) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                    }
                } while (translate < 1 || translate > 2);
            }
            //ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ ΝΑΙ/ΟΧΙ
            do {
                System.out.println("Γνωρίζετε κάποια γλώσσα προγραμματισμού; 1.Ναι 2.Όχι");
                qprogramm = scanner.nextInt();
            
                if (qprogramm < 1 || qprogramm > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (qprogramm < 1 || qprogramm > 2);
            //ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ ΔΡΑΣΕΙΣ ΑΝ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ=ΝΑΙ
            if (qprogramm == 1) {
                do {
                    System.out.println("Θα σας ενδιέφερε να σχεδιάζετε και να υλοποιείτε ιστοσελίδες οργανισμών; 1.Ναι 2.Όχι");
                    programm = scanner.nextInt();
            
                    if (programm < 1 || programm > 2) {
                        System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                    }
                } while (programm < 1 || programm > 2);
            }
            //ΜΑΡΚΕΤΙΝΚ ΝΑΙ/ΟΧΙ
            do {
                System.out.println("Θα σας ενδιέφερε ο τομέας του marketing; 1.Ναι 2.Όχι");
                qmarketing = scanner.nextInt();
            
                if (qmarketing < 1 || qmarketing > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (qmarketing < 1 || qmarketing > 2);
            //ΜΑΡΚΕΤΙΝΚ ΔΡΑΣΕΙΣ ΑΝ ΜΑΡΚΕΤΙΝΚ=ΝΑΙ
            do {
                System.out.println("Θα σας ενδιέφερε να βοηθήσετε στην υλοποίηση για καμπάνιες ευαισθητοποίησης; 1.Ναι 2.Όχι");
                marketing = scanner.nextInt();
            
                if (marketing < 1 || marketing > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (marketing < 1 || marketing > 2);
            //ΔΙΑΔΙΚΤΥΑΚΗ ΥΠΟΣΤΗΡΙΞΗ
            do {
                System.out.println("Θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών; 1.Ναι 2.Όχι");
                consulting = scanner.nextInt();
            
                if (consulting < 1 || consulting > 2) {
                    System.out.println("Επιλέξατε μη έγκυρη επιλογή. Παρακαλώ επιλέξτε 1 για 'Ναι' ή 2 για 'Όχι'.");
                }
            } while (consulting < 1 || consulting > 2);
            
            scanner.close();
            return removeNegativeInterests(collectUserInterest2(location, money, marketing, translate, programm, consulting));
        }
    }

    public static String collectUserInterest1(String l,String ca, int m, int e, int a, int h, int s){
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
                    fhuman = "Προσφορά ανθρωπιστικής βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
                } else {
                    fhuman = "Καμπάνιες ευαισθητοποίησης";
                }
            }
        }
        String result1 = l + ca + fenvironment + fanimal + fhuman;
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
        String result2 = ca + l + fmoney + fcampaign + ftranslate + fhttp + fhelp ;
        return result2;
    }




    private static String removeNegativeInterests(String interests) {
        // Διαχωρίζει τις προτάσεις με βάση το κόμμα
        String[] interestArray = interests.split(", ");

        // Φιλτράρει τις προτάσεις που δεν αρχίζουν με "Όχι"
        String[] filteredInterests = Arrays.stream(interestArray)
                .filter(interest -> !interest.startsWith("Όχι"))
                .toArray(String[]::new);

        // Συνενώνει τα εναπομείναντα ενδιαφέροντα με κόμμα
        return String.join(", ", filteredInterests);
    }
}