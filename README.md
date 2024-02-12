# eTHELOntismos - TeaMET

## Οδηγίες Μεταγλώττισης του Προγράμματος
Στο terminal βρισκόμενοι στον φάκελο TeaMET τρέχουμε την εντολή: mvn clean install

### Υποσημειώσεις
1) Η εντολή αυτή παράγει το jar αρχείο με βάση την Ethelo_2 ως main κλάση, δηλαδή χωρίς την χρήση του AI

2) Για να χρησιμοποιήσουμε άλλη main κλάση κάνουμε μεταγλώττιση των αρχείων .java με την εξής εντολή στο terminal: javac src/main/java/com/ethelontismos/*

## Οδηγίες Εκτέλεσης του Προγράμματος
Στο terminal βρισκόμενοι στον φάκελο TeaMET τρέχουμε την εντολή: java -jar target/TeaMET-1.0.1.jar

### Υποσημειώσεις
1) Αν έχουμε μεταγλωττίσει τα αρχεία μας με την εντολή javac τότε μπορούμε να χρησιμοποιήσουμε τις κλάσεις Ethelo_1 και Grafika για να τρέξουμε την εφαρμογή μας

2) Για να χρησιμοποιήσουμε την Ethelo_1 η οποία κάνει χρήση του AI κάνουμε τα εξής:
      1) Στην κλάση ChatConn εισάγουμε το δικό μας apikey στη θέση YOUR_API_KEY
      2) Στο terminal βρισκόμενοι στον φάκελο TeaMET τρέχουμε την εντολή: java -cp src/main/java/ com.ethelontismos.Ethelo_1

3) Για να χρησιμοποιήσουμε την Grafika η οποία παρουσίαζει tο γραφικό περιβάλλον της εφαρμογής μας:
   1) Στο terminal βρισκόμενοι στον φάκελο TeaMET τρέχουμε την εντολή: java -cp src/main/java/ com.ethelontismos.Grafika

## Οδηγίες χρήσης του προγράμματος

-> (ΧΡΗΣΗ ΧΩΡΙΣ ΓΡΑΦΙΚΑ) Ο χρήστης του προγράμματος καλείται να εισάγει κάποια στοιχεία για τη δημιουργία του προφίλ του στην ιστοσελίδα και έπειτα να απαντήσει ερωτήσεις, ώστε να γίνει η συλλογή των ενδιαφερόντων του και να βρεθεί η κατάλληλη εθελοντική δράση για αυτόν. 

-> (ΧΡΗΣΗ ΜΕ ΓΡΑΦΙΚΑ, δεν καταφέραμε να εμφανίσουμε την απάντηση)  Ο χρήστης του προγράμματος καλείται να κάνει σύνδεση ή εγγραφή στην ιστοσελίδα και ύστερα η χρήση του προγράμματος είναι ίδια με τη χρήση χωρίς γραφικά. 

## Δομή των περιεχομένων του αποθετηρίου

--> τα pom.xml, dependency-reduced-pom.xml που καθορίζουν τη σύσταση και μεταγλώττιση του maven project μας

--> το αρχείο README.md που περιλαμβάνει τις βασικές πληροφορίες για το project μας

--> το αρχείο .gitignore που περιλαμβάνει κάποια στοιχεία που δημιουργούνται κατά τη μεταγλώττιση και δεν θέλουμε να        ανέβουν στο αποθετήριο μας

### 1.  'src/' που περιλαμβάνει την πηγή του project μας

---> Στον φάκελο src υπάρχει ο κύριος φάκελος main που περιλαμβάνει:

----> τον φάκελο resources που περιλαμβάνει τους πόρους που χρησιμοποιεί το project μας

-----> Στον φάκελο resources υπάρχει ο υποφάκελος db (συντομογραφία για το database) και αυτός περιλαμβάνει τα αρχεία για τις δύο βάσεις δεδομένων μας, μία για τα προφίλ χρηστών και μία για τις εθελοντικές δράσεις

----> τον φάκελο java που περιλαμβάνει όλα τα .java αρχεία που χρησιμποποιεί το project μας

-----> στον φάκελο java υπάρχει ο φάκελος com με υποφάκελο ethelontismos για την δήλωση του πακέτου που δημιουργεί το project μας  -- com.ethelontismos -- 

------> στον φάκελο com/ethelontismos/ περιλαμβάνονται όλα τα .java αρχεία που χρησιμοποιούνται για τη κωδικοποίηση του project μας

## Διάγραμμα UML σχετικά με τον σχεδιασμό του κώδικα
Το διάγραμμα αυτό έχει υλοποιηθεί με βάση την Ethelo2 ως main κλάση
![UML-diagram](https://github.com/MariliaGait/TeaMET/assets/147326236/94be3f0a-0480-45e5-abe9-ab59044399ef)
