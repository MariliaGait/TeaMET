# Οδηγίες Μεταγλώττισης του Προγράμματος
mvn clean install

# Οδηγίες Εκτέλεσης του Προγράμματος
java -jar target/TeaMET-1.0.1.jar

1) Στην κλάση ChatConn εισάγετε το δικό σας apikey στη θέση YOUR_API_KEY
   
2) Αν δεν τρέξει η κλάση ChatConn μέσω της κλάσης Ethelo_1 και δεν πραγματοποιηθεί η σύνδεση με το ΑΙ,
να γίνει χρήση της κλάσης Ethelo_2 που υλοποιεί σύνδεση με τη βάση δεδομένων και έτσι εμφανίζει τις 
κατάλληλες δράσεις στον χρήστη

# Οδηγίες χρήσης του προγράμματος

-> (ΧΡΗΣΗ ΧΩΡΙΣ ΓΡΑΦΙΚΑ) Ο χρήστης του προγράμματος καλείται να εισάγει κάποια στοιχεία για τη δημιουργία του προφίλ του στην ιστοσελίδα και έπειτα να απαντήσει ερωτήσεις, ώστε να γίνει η συλλογή των ενδιαφερόντων του και να βρεθεί η κατάλληλη εθελοντική δράση για αυτόν. 

-> (ΧΡΗΣΗ ΜΕ ΓΡΑΦΙΚΑ, δεν καταφέραμε να εμφανίσουμε την απάντηση)  Ο χρήστης του προγράμματος καλείται να κάνει σύνδεση ή εγγραφή στην ιστοσελίδα και ύστερα η χρήση του προγράμματος είναι ίδια με τη χρήση χωρίς γραφικά. 

# Δομή των περιεχομένων του αποθετηρίου

-> Στον main φάκελο του αποθετηρίου έχουμε:

--> τα pom.xml, dependency-reduced-pom.xml που καθορίζουν τη σύσταση και μεταγλώττιση του maven project μας

--> το αρχείο README.md που περιλαμβάνει τις βασικές πληροφορίες για το project μας

--> το αρχείο .gitignore που περιλαμβάνει κάποια στοιχεία που δημιουργούνται κατά τη μεταγλώττιση και δεν θέλουμε να        ανέβουν στο αποθετήριο μας

--> τον φάκελο src που περιλαμβάνει την πηγή του project μας

---> Στον φάκελο src υπάρχει ο κύριος φάκελος main που περιλαμβάνει:

----> τον φάκελο resources που περιλαμβάνει τους πόρους που χρησιμοποιεί το project μας

-----> Στον φάκελο resources υπάρχει ο υποφάκελος db (συντομογραφία για το database) και αυτός περιλαμβάνει τα αρχεία για τις δύο βάσεις δεδομένων μας, μία για τα προφίλ χρηστών και μία για τις εθελοντικές δράσεις

----> τον φάκελο java που περιλαμβάνει όλα τα .java αρχεία που χρησιμποποιεί το project μας

-----> στον φάκελο java υπάρχει ο φάκελος com με υποφάκελο ethelontismos για την δήλωση του πακέτου που δημιουργεί το project μας  -- com.ethelontismos -- 

------> στον φάκελο com/ethelontismos/ περιλαμβάνονται όλα τα .java αρχεία που χρησιμοποιούνται για τη κωδικοποίηση του project μας
