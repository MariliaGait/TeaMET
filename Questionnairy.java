import java.util.Scanner;

public class Questionnairy {

    Scanner scanner = new Scanner();

    System.out.println("Ποιά κατηγορία προτιμάτε;");
    System.out.println("1. Δράσεις δια ζώσης    2  . Διαδικτυακός εθελοντισμός");
    int categ = scanner.nextInt();

    //Το μεγάλο μας IF
    if (categ = 2) {
        boolean c = true;
        while (c) {
            System.out.println("Τέλεια!Ο Διαδικτυακός-Εικονικός εθελοντισμός δημιουργεί ευκαιρίες εθελοντισμού από οπουδήποτε, οποιαδήποτε στιγμή και με οποινδήποτε τρόπο επιθυμείτε.");
            //Λιγα URL,ιστοσελίδες για το "Γιατί είναι σημαντικός ο διαδικτυακός-Εικονικός Εθελοντισμός"

            System.out.println("Έχεις κάποια κλήση στην πληροφορική,τη γραφιστική και τα βίντεο και θέλεις να την αναπτύξεις;");
            System.out.println("1.Ναι,θα ήθελα!     2.Όχι,δεν ενδιφέρομαι.");
            int programming2 = scanner.nextInt();

                if (programming2 == 1) {
                    System.out.println("Προτιμάς την ανάπτυξη εφαρμογών(Web Developer)και το Data Analysis ή την ενασχόληση με Marketing,Social media και Video Editing")
                    System.out.println("1.Web-Software-Data    2.Marketing-Media-Video-Youtube");
                    int prog-or-media = scanner.nextnt();

                    if ( prog-or-media == 1) {
                        System.err.println("Τέλεια, υπάρχουν πολλές υπηρεσίες που αποζητούν βοήθεια σε θέματα πληροφορικής");
                        //Σύνδεση με chat με keyword=programming2 όπου το νουμερο 2 αναφέρεται στον διαδικτυακό εθελοντισμό
                        //Συνδέουμε δράσεις για πληροφορικούς Web Developpers,Software Developers, Data Analyst και αλλα τετοια (Let’s Do it Greece,KINOTRO)
                    } else {
                        System.out.println("You are a creative mind!Πολλοί οργανισμοί χρειάζονται την βοήθειά σου.");
                        //Συνδεση με chat με keyword=media2, για δράσεις που αναζητουν Social media,design,Video,Youtube και αλλα τετοια (Let’s Do it Greece,KINITRO,Toy&Joy,Μέριμνα) 
                    }

                    System.out.println("Έχεις βρεί κάποια δράση που σου ταιριάζει;Θέλεις να αναζητήσεις περισσότερες με βάση τα ενδιφέροντά σου;");
                        System.out.println("1.Θέλω να συνεχίσω.     2.Δεν θα συνεχίσω");
                        int continue2 = scanner.nextInt();
                        if (continue2 == 2) {
                            break;
                        }

                } else {
                    //Αυτό το else σημαινει οτι δεν τον ενδιαφέρει η πληροφορική και έτσι τον ρωτάω για τον άνθρωπο-ψυχολογία
                    System.out.println("Σε ενδιφέρει ο άνθρωπος και η ψυχολογία;")
                    System.out.println("1.Ναι,είμαι επαγγελματίας ψυχολόγος\σπουδάζω σε αυτόν τον τομέα.     2.Με ενδιφέρει πολύ αλλα δεν είμαι επαγγελματίας 3.Δεν θα ήθελα να ασχοληθώ")
                    int psycho2 = scanner.nextInt();
                    if (psycho2 == 1) {
                        System.out.println("Μπράβο, είναι πολύ σημαντικό να παρέχουμε τις γνώσεις μας για στηρίξουμε ανθρώπους που το έχουν ανάγκη!Υπάρχουν αρκετές εθελοντικές δράσεις ενδυνάμωσης σε διάφορα κέντρα και πλατφόρμες.");
                        //Σύνδεση με chat με keyword=professionalpsycho2 για σύνδεση με κεντρα για ψυχική υγεία,τηλεφωνική στήριξη,αρθρογράφους για site ψυχικής υγείας
                    }else (psycho2 == 2){
                        System.out.println("You are a sensitive soul!Ο κόσμος μας έχει ανάγκη από ανθρώπους σαν και εσένα.Κάποιες δράσεις που μπορείς να κάνεις είναι οι εξής:");
                        //Συνδεση με chat με keyword=simplepsycho2 για συνδεση με τηλεφωνικη στηριξη,letters against isolation και αλλους τετοιους οργανισμούς 
                    }
                    if (psycho2 !=3) {
                        System.out.println("Έχεις βρεί κάποια δράση που σου ταιριάζει;Θέλεις να συνεχίσεις στις ερωτήσεις ώστε να επεκτείνεις τις εικονικές δράσεις σου;");
                        System.out.println("1.Θέλω να συνεχίσω.     2.Δεν θα συνεχίσω");
                        int continue2 = scanner.nextInt();
                        if (continue2 == 2) {
                            break;
                        }
                    }
                    if (psycho2 == 3) {
                        System.out.println("Μήπως έχεις κλήση σε κάποια ή περισσότερες ξένες γλώσσες;");
                        System.out.println("1.Ναι,πως μπορώ να βοηθήσω;     2.Όχι");
                        int lang2 = scanner.nextInt();
                        if (lang2 == 1) {
                            System.out.println("Nice!   Hübsch!   Très bien!   Очень хороший! Είναι η στιγμή να κάνεις practice και να βοηθήσεις σε πλατφόρμες μεταφράσεων.");
                            //Συνδεση με chat με keyword=lang2 για διδικτυακές μεταφράσεις λέξεων,κειμένων και τετοια (translators without boarders, TEDx volunteer translators,Distributed Proofreaders)

                            System.out.println("Έχεις βρεί κάποια δράση που σου ταιριάζει;Θέλεις να συνεχίσεις στις ερωτήσεις ώστε να επεκτείνεις τις εικονικές δράσεις σου;");
                            System.out.println("1.Θέλω να συνεχίσω.     2.Δεν θα συνεχίσω");
                            int continue2 = scanner.nextInt();
                            if (continue2 == 2) {
                                break;
                            }
                        }else { 
                            System.out.println("Σου αρέσει η διδασκαλία;Θα σε ενδιέφερε να παραδίδεις μαθήματα σε παιδιά ή φοιτητές; Αν είσαι ο ίδιος δάσκαλος ή φοιτητής τότε είσαι ο κατάλληλος!");
                            System.out.println("1.Με ενδιαφέρει πολύ!   2.Όχι,δεν το προτιμώ.");
                            int teach2 = scanner.nextInt();
                            if (teach2 == 1) {
                                System.out.println("Ωραία,η ανάγκη για δωρεάν διαδικτυακή διδασκαλία αυξάνεται συνεχώς, όπως και η δια ζώσης διδασκαλία.Ορίστε κάποιες πλατφόρμες για εθελοντική διδασκαλία διαδικτυακά")
                                //Συνδεση με chat με keyword=teach2 για διαδικτυακη εθελοντική διδασκαλια
                                //CareerVillage.org
                                System.out.println("Μήπως θα σε ενδιέφερε και η δια ζώσης διδασκαλία;");
                                System.out.println("1.Γιατί όχι;  2.Δεν ενδιαφέρομαι");
                                int teach1 = scanner.nextInt();
                                if (teach1 == 1) {
                                    System.out.println("Υπέροχα νέα!Εδώ μπορείς να δείς που δύναται να συμβάλλεις δια ζώσης.")
                                    //Σύνδεση με chat με keyword=teach1 οπου 1 ο διαζώσης εθελοντισμός για 
                                    //Εδω βάζουμε δράσεις για εθελοντικά μαθηματα σε μαθητεσ ή φοιτητές απο κοντά
                                }
                            System.out.println("Έχεις βρεί κάποια δράση που σου ταιριάζει;Θέλεις να συνεχίσεις στις ερωτήσεις ώστε να επεκτείνεις τις εικονικές δράσεις σου;");
                            System.out.println("1.Θέλω να συνεχίσω.     2.Δεν θα συνεχίσω");
                            int continue2 = scanner.nextInt();
                            if (continue2 == 2) {
                                break;
                            }
                            
                            }else {
                                //δεν εχω κάποια αλλη ιδέα για εθελοντισμό διαδικτυακά
                            }
                        
                        } //κλείνει το while loop
            } else {
                //Είμαστε στην κατηγορια εθελοντισμός δια ζώσης
                System.out.println("Συγχαρητήρια!Επέλεξες τον καθιερωμένο και πιο άμεσο τρόπο να βοηθήσεις εθελοντικά!Οι δράσεις στις οποίες μπορείς να συμμετάσχεις είναι πολλές.Θα σου τεθούν διάφορες ερωτήσεις για να επιλέξεις τη δράση που σου ταιριάζει!")
                System.out.println("Πόσες ώρες την εβδομάδα μπορείτε να αφιερώνετε;");
                System.out.println("1. 1-3 ώρες     2. 3-5 ώρες     3. 5+"ώρες);
                int hours = scanner.nextInt();
                System.out.println("Προτιμάτε να εργάζεστε μόνος/-η ή σε ομάδα;");
                System.out.println("1.Ατομική δράση     2.Ομαδικό Πρόγραμμα");
                int aloneornot = scanner.nextInt();
                System.out.println("Θεωρείται μεγαλύτερη ανάγκη τη βοήθειά σας έχει:");
                System.out.println("1.Το περιβάλλον     2.Ο άνθρωπος    3.Τα ζώα ");
                int cat123 = scanner.nextInt();
                if (cat123 == 1) {
                    System.out.println("Τέλεια!Το περιβάλλον είναι ένα κληροδότημα απο τις προηγούμενες γενιές στις επόμενες.Η προστασία του οφείλουμε να είναι προτεραιότητά μας.Ας επεκταθούμε σε πιο συγκεκριμένες δράσεις που θα σε ενδιέφεραν.");
                    System.out.println("");
                }else if (cat123 == 2) {
                    System.out.println("...άλλωστε Ποίηση στην καθημερινή μας ζωή είναι η αλληλεγγύη και η ανθρωπιά.Ας συγκεκριμενοποιήσουμε πως θα βάλεις την /"ποίηση/" στη ζωή σου.");
                    System.out.println("Σου αρέσει να βοηθάς χειρωνακτικά ή προτιμάς την ψυχολογική υποστήριξη; ");
                    System.out.println("1.Κυρίως χειρωνακτικά"      2.Προτιμώ μια πιο "εσωτερική υποστήριξη");
                    int psycho1 = scanner.nextInt();
                    if (psycho1 == 1) {
                        System.out.println("Θα σε ενδιέφερε η προετοιμασία φαγητού για άστεγους και η συλλογή-αποστολή ενδυμάτων σε οικογένειες που το έχουν ανάγκη;");
                        System.out.println("1.Ναι βέβαια!      2.Όχι τόσο.");
                        int fo
                        System.out.println("Είσαι διατεθειμένος να παράσχεις βοήθεια σε πληγέντες απο καταστροφές όπως πλημμύρες,φωτιές κ.α. ;");
                        System.out.println("1.Ναι μπορώ να συμμετέχω σε τέτοιες αποστολές       2.Δεν το προτιμώ");
                        int mission1 = scanner,nextInt();
                        System.out.println("Θα ήθελες να εργάζεσαι περιστασιακά στις δομές-υπηρεσίες εθελοντικών φορέων και ιδρυμάτων;");
                        System.out.println("1.Ναι,θα ήθελα      2.Όχι,δεν έχω τον χρόνο");
                        int job = scanner.nextInt();
                        System.err.println("Οι οργανισμοί συχνά αναζητούν εθελοντές για καμπάνιες ευαισθητοποίησης και δράσεις για την ενημέρωση των πολιτών.Θα ήταν κάτι που θα σε ενδιέφερε;");
                        System.out.println("1.Γιατί,όχι;    2.Καλύτερα όχι.");
                        int info1 = scanner.nextInt();
                        System.out.println("Συνέδρ");
                        System.out.println("Είστε εξοικειωμένος με τα τεχνολογικά εργαλεία; Εάν ναι, θα βρίσκατε ενδιαφέρουσα τη διαχείριση των social media/websites κάποιας εθελοντικής οργάνωσης;Πολλοί φορείς αποζητούν ακόμη και Data Analists και Software/Hardware Developer.");
                        System.out.println("1.Ναι είμαι εξοικειωμένος και είναι αυτό που με ενδιφέρει       2.Όχι");
                        int programming1 = scanner.nextInt();


                    }
                }
        
            
            
            
            
            
            }


    }
            System.out.println("")


    }
 
    
}