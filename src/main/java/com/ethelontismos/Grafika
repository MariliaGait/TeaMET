import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Grafika{
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("eTHELOntismos");
        frame.setSize(1500, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel flabel = new JLabel("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα εθελοντικό ταξίδι;");
        flabel.setBounds(10, 20, 80, 25);
        panel.add(flabel);

        JButton continueButton = new JButton("Let's start");
        panel.add(continueButton);
        JButton signinButton = new JButton("Sign in");
        panel.add(signinButton);
        JButton loginButton = new JButton("Login");
        panel.add(loginButton);
        JButton findyourpathButton = new JButton("Find your path!");
        panel.add(findyourpathButton);

        // Initially hide login, register, and second continue buttons
        signinButton.setVisible(false);
        loginButton.setVisible(false);
        findyourpathButton.setVisible(false);

        continueButton.addActionListener(new ActionListener() {
            boolean continueClicked = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!continueClicked) {
                    // Remove the Continue button
                    panel.remove(continueButton);
                    panel.remove(flabel);
                    continueClicked = true;
                    signinButton.setVisible(true);
                    loginButton.setVisible(true);
                    panel.revalidate();
                    panel.repaint();

                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
                                    boolean login2Clicked1 = false;
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (!login2Clicked1) {
                                            // Remove loginButton2
                                            panel.remove(loginButton);

                                             panel.remove(signinButton);
                                            login2Clicked1 = true;
                                            panel.revalidate();
                                            panel.repaint();
        
                                            JLabel userLabel21 = new JLabel("Όνομα Χρήστη");
                                            userLabel21.setBounds(10, 20, 80, 25);
                                            panel.add(userLabel21);
                                            JTextField userText21 = new JTextField(20);
                                            userText21.setBounds(100, 20, 165, 25);
                                            panel.add(userText21);
        
                                            JLabel userPassword21 = new JLabel("Κωδικός Πρόσβασης");
                                            userPassword21.setBounds(10, 50, 80, 25);
                                            panel.add(userPassword21);
                                            JPasswordField passwordText21 = new JPasswordField(20);
                                            passwordText21.setBounds(100, 50, 165, 25);
                                            panel.add(passwordText21);
        
                            
                                            JButton continueButton4 = new JButton("Continue");
                                            panel.add(continueButton4);
                                
                                            continueButton4.addActionListener(new ActionListener() {
                                                boolean continue4Clicked = false;
                                
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    if (!continue4Clicked) {
                                                        // Remove fields and continueButton3
                                                        panel.remove(userLabel21);
                                                        panel.remove(userText21);
                                                        panel.remove(userPassword21);
                                                        panel.remove(passwordText21);
                                                        panel.remove(continueButton4);
                                                        continue4Clicked = true;
                                                        panel.revalidate();
                                                        panel.repaint();
                                
                                                        JButton findyourpathButton2 = new JButton("Find your path!");
                                                        panel.add(findyourpathButton2);
                                
                                                        findyourpathButton2.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                              
                                                                String name1 = JOptionPane.showInputDialog(frame, "Ονοματεπώνυμο: ");
                     
                                                                String age1;
                                                                do {
                                                                    age1 = JOptionPane.showInputDialog(frame, "Ηλικία: ");
                                                                    try {
                                                                        int age = Integer.parseInt(age1);
                                                                        if (age <= 0) {
                                                                            throw new NumberFormatException();
                                                                        }
                                                                    } catch (NumberFormatException j) {
                                                                        JOptionPane.showMessageDialog(frame, "Παρακαλώ εισάγετε έναν θετικό αριθμό για την ηλικία.");
                                                            
                                                                        age1 = null; 
                                                                    }

                                                                }

                                                                while (age1 == null);
                                                    
                                                                String[] options99 = {"Γυναίκα", "Άνδρας", "Άλλο"};

                                                                int sexOption;

                                                                do {

                                                                    String sexInput = JOptionPane.showInputDialog(frame, "Φύλο: 1.Γυναίκα  2.Άνδρας  3.Άλλο");
                                                                    try {
                                                                        sexOption = Integer.parseInt(sexInput);
                                                                        if (sexOption < 1 || sexOption > 3) {
                                                                            throw new NumberFormatException();
                                                                        }
                                                                    } catch (NumberFormatException o) {
                                                                        JOptionPane.showMessageDialog(frame, "Παρακαλώ εισάγετε έγκυρο αριθμό (1, 2 ή 3).");
                                                                        sexOption = 0; // Ορίζουμε σε μη έγκυρη τιμή για να επαναλάβει το loop
                                                                    }

                                                                } while (sexOption < 1 || sexOption > 3);

                                                                String sex = options99[sexOption - 1];
                                                
                                                                String area1 = JOptionPane.showInputDialog(frame, "Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
                                                               
                                                                String[] options = {"δράσεις δια ζώσης", "διαδικτυακό εθελοντισμό"};
                                                                int preferredCategory = JOptionPane.showOptionDialog(frame,
                                                                "Ποια κατηγορία προτιμάτε:\n1. δράσεις δια ζώσης\n2. διαδικτυακό εθελοντισμό", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                JOptionPane.DEFAULT_OPTION,
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null,
                                                                options,
                                                                options[0]);
                                                
                                                                if (preferredCategory == 0) {
                                                                    String[] options1 = {"Ναι", "Όχι"};
                                                                    int preferredCategory1 = JOptionPane.showOptionDialog(frame,
                                                                    "Έχετε ιατρικές γνώσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options1,
                                                                    options1[0]);
                                                
                                                                    String[] options2 = {"Ναι", "Όχι"};
                                                                    int preferredCategory2 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν το περιβάλλον;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options2,
                                                                    options2[0]);
                                                
                                                                    if (preferredCategory2==0){
                                                                        String[] options3 = {"Καμπάνιες ευαισθητοποίησης ", "Καθαρισμός δημόσιων χώρων", "Δενδροφύτευση/Δασοφύτευση", "Ανακύκλωση"};
                                                                        int qenvironment= JOptionPane.showOptionDialog(frame,
                                                                        "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Καθαρισμός δημόσιων χώρων \n3. Δενδροφύτευση/Δασοφύτευση \n4.Ανακύκλωση ", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                        JOptionPane.DEFAULT_OPTION,
                                                                        JOptionPane.QUESTION_MESSAGE,
                                                                        null,
                                                                        options3,
                                                                        options3[0]);
                                                                    }
                                                 
                                                                    String[] options4 = {"Ναι", "Όχι"};
                                                                    int preferredCategory3 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options4,
                                                                    options4[0]);
                                                
                                                                    if (preferredCategory3==0) {
                                                                         String[] options5 = {"Καμπάνιες ευαισθητοποίησης ", "Κτηνιατριακή περίθαλψη", "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια", "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη", "Προστασία άγριας ζωής"};
                                                                        int qanimal= JOptionPane.showOptionDialog(frame,
                                                                        "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Κτηνιατριακή περίθαλψη \n3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια\n4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη \n5. Προστασία άγριας ζωής", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                        JOptionPane.DEFAULT_OPTION,
                                                                        JOptionPane.QUESTION_MESSAGE,
                                                                        null,
                                                                        options5,
                                                                        options5[0]);
                                                                    }
                                                
                                                                    String[] options6 = {"Ναι", "Όχι"};
                                                                    int preferredCategory4 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options6,
                                                                    options6[0]);
                                                                
                                                                     if (preferredCategory4==0) {
                                                                         String[] options7 = {"Αιμοδοσία", "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια ", "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)", "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) ", "Καμπάνιες ευαισθητοποίησης"};
                                                                        int qhuman= JOptionPane.showOptionDialog(frame,
                                                                        "Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε;:\n1.Αιμοδοσία \n2. Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια \n3. Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)\n4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) \n5. Καμπάνιες ευαισθητοποίησης", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                        JOptionPane.DEFAULT_OPTION,
                                                                        JOptionPane.QUESTION_MESSAGE,
                                                                        null,
                                                                        options7,
                                                                        options7[0]);
                                                                    }
                                                                     String[] options21 = {"Ναι", "Όχι"};
                                                                    int preferredCategory21 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options6,
                                                                    options6[0]);
                                                
                                                                 } else if(preferredCategory == 1) {
                                                
                                                                    String[] options8 = {"Ναι", "Όχι"};
                                                                    int preferredCategory5 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options8,
                                                                    options8[0]);
                                                
                                                 
                                                
                                                                 String[] options9 = {"Ναι", "Όχι"};
                                                                    int preferredCategory6 = JOptionPane.showOptionDialog(frame,
                                                                    "Γνωρίζετε αγγλικά;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options9,
                                                                    options9[0]);
                                                
                                                                    if (preferredCategory6 == 0) {
                                                                        String[] options10 = {"Ναι", "Όχι"};
                                                                        int qtranslate = JOptionPane.showOptionDialog(
                                                                            frame,
                                                                            "Θα σας ενδιέφερε να κάνετε μετάφραση αγγλικών κειμένων στα ελληνικά είτε το αντίστροφο;:\n1. Ναι\n2. Όχι",
                                                                            "Ερώτηση",
                                                                            JOptionPane.YES_NO_OPTION,
                                                                            JOptionPane.QUESTION_MESSAGE,
                                                                            null,
                                                                            options10,
                                                                            options10[0]
                                                                        );
                                                                    }
                                                
                                                                    String[] options11 = {"Ναι", "Όχι"};
                                                                    int preferredCategory7 = JOptionPane.showOptionDialog(frame,
                                                                    "Γνωρίζετε κάποια γλώσσα προγραμματισμού;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options11,
                                                                    options11[0]);
                                                
                                                                    if (preferredCategory7 == 0) {
                                                                        String[] options12 = {"Ναι", "Όχι"};
                                                                        int qprogram = JOptionPane.showOptionDialog(
                                                                            frame,
                                                                            "Θα σας ενδιέφερε να σχεδιάζετε και να υλοποιείτε ιστοσελίδες οργανισμών;:\n1. Ναι\n2. Όχι",
                                                                            "Ερώτηση",
                                                                            JOptionPane.YES_NO_OPTION,
                                                                            JOptionPane.QUESTION_MESSAGE,
                                                                            null,
                                                                            options12,
                                                                            options12[0]
                                                                        );
                                                                    }
                                                
                                                                    String[] options13 = {"Ναι", "Όχι"};
                                                                    int preferredCategory8 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα σας ενδιέφερε ο τομέας του marketing;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options13,
                                                                    options13[0]);
                                                
                                                
                                                                    if (preferredCategory8 == 0) {
                                                                        String[] options14 = {"Ναι", "Όχι"};
                                                                        int qmarketing = JOptionPane.showOptionDialog(
                                                                            frame,
                                                                            "Θα σας ενδιέφερε να βοηθήσετε στην υλοποίηση για καμπάνιες ευαισθητοποίησης;:\n1. Ναι\n2. Όχι",
                                                                            "Ερώτηση",
                                                                            JOptionPane.YES_NO_OPTION,
                                                                            JOptionPane.QUESTION_MESSAGE,
                                                                            null,
                                                                            options14,
                                                                            options14[0]
                                                                        );
                                                                    }
                                                
                                                                    String[] options15 = {"Ναι", "Όχι"};
                                                                    int preferredCategory9 = JOptionPane.showOptionDialog(frame,
                                                                    "θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options15,
                                                                    options15[0]);                                          
                                                           }
                                                       }
                                                       });
                                                    }
  }
});
                                                    }
                                                }
                        
                                        });
                                    
        signinButton.addActionListener(new ActionListener() {
            boolean signinClicked = false;
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!signinClicked) {
                    // Remove the Continue button
                    panel.remove(signinButton);
                    panel.remove(loginButton);
                    signinClicked = true;
                    panel.revalidate();
                    panel.repaint();
        
                    JLabel userLabel = new JLabel("Όνομα Χρήστη");
                    userLabel.setBounds(10, 20, 80, 25);
                    panel.add(userLabel);      
                    JTextField userText = new JTextField(20);
                    userText.setBounds(100, 20, 165, 25);
                    panel.add(userText);

                    JLabel userPassword = new JLabel("Κωδικός Πρόσβασης");
                    userPassword.setBounds(10, 50, 80, 25);
                    panel.add(userPassword);
                    JPasswordField passwordText = new JPasswordField(20);
                    passwordText.setBounds(100, 50, 165, 25);
                    panel.add(passwordText);
        
                    JLabel userEmail = new JLabel("Email");
                    userEmail.setBounds(10, 80, 80, 25);
                    panel.add(userEmail);
                    JTextField emailText = new JTextField(20);
                    emailText.setBounds(100, 80, 165, 25);
                    panel.add(emailText);
        
                    JLabel userPhone = new JLabel("Τηλέφωνο");
                    userPhone.setBounds(10, 110, 80, 25);
                    panel.add(userPhone);
                    JTextField phoneText = new JTextField(20);
                    phoneText.setBounds(100, 110, 165, 25);
                    panel.add(phoneText);
        
                    JButton continueButton2 = new JButton("Continue ");
                    panel.add(continueButton2);

                    continueButton2.addActionListener(new ActionListener() {
                        boolean continue2Clicked = false;
        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (!continue2Clicked) {
                                // Remove fields and continueButton2
                                panel.remove(userLabel);
                                panel.remove(userText);
                                panel.remove(userPassword);
                                panel.remove(passwordText);
                                panel.remove(userEmail);
                                panel.remove(emailText);
                                panel.remove(userPhone);
                                panel.remove(phoneText);
                                panel.remove(continueButton2);
                                continue2Clicked = true;
                                panel.revalidate();
                                panel.repaint();
        
                                JButton loginButton2 = new JButton("Login");
                                panel.add(loginButton2);
        
                                loginButton2.addActionListener(new ActionListener() {
                                    boolean login2Clicked = false;
        
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        if (!login2Clicked) {
                                            // Remove loginButton2
                                            panel.remove(loginButton2);
                                            login2Clicked = true;
                                            panel.revalidate();
                                            panel.repaint();
        
                                            JLabel userLabel2 = new JLabel("Όνομα Χρήστη");
                                            userLabel2.setBounds(10, 20, 80, 25);
                                            panel.add(userLabel2);
        
                                            JTextField userText2 = new JTextField(20);
                                            userText2.setBounds(100, 20, 165, 25);
                                            panel.add(userText2);
        
                                            JLabel userPassword2 = new JLabel("Κωδικός Πρόσβασης");
                                            userPassword2.setBounds(10, 50, 80, 25);
                                            panel.add(userPassword2);
        
                                            JPasswordField passwordText2 = new JPasswordField(20);
                                            passwordText2.setBounds(100, 50, 165, 25);
                                            panel.add(passwordText2);

                                            JButton continueButton3 = new JButton("Continue");
                                            panel.add(continueButton3);
                                
                                            continueButton3.addActionListener(new ActionListener() {
                                                boolean continue3Clicked = false;
                                
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    if (!continue3Clicked) {
                                                        // Remove fields and continueButton3
                                                        panel.remove(userLabel2);
                                                        panel.remove(userText2);
                                                        panel.remove(userPassword2);
                                                        panel.remove(passwordText2);
                                                        panel.remove(continueButton3);
                                                        continue3Clicked = true;
                                                        panel.revalidate();
                                                        panel.repaint();
                                
                                                        JButton findyourpathButton = new JButton("Find your path!");
                                                        panel.add(findyourpathButton);
                                
                                                        findyourpathButton.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {

                                                               String name1 = JOptionPane.showInputDialog(frame, "Ονοματεπώνυμο: ");
                                                                

                                                                String age1;
 
                                                                do {
                                                                    age1 = JOptionPane.showInputDialog(frame, "Ηλικία: ");
                                                                    try {
                                                                        int age = Integer.parseInt(age1);
                                                                        if (age <= 0 ) {
                                                                            throw new NumberFormatException();
                                                                        }
                                                                    } catch (NumberFormatException j) {
                                                                        JOptionPane.showMessageDialog(frame, "Παρακαλώ εισάγετε έναν θετικό αριθμό για την ηλικία.");
                                                                        age1 = null; // Ορίζουμε σε null για να ξαναζητηθεί η είσοδος από τον χρήστη
                                                                    }
                                                                }
                                                                while (age1 == null);

                                                                String[] options99 = {"Γυναίκα", "Άνδρας", "Άλλο"};

                                                                int sexOption;

                                                                do {

                                                                    String sexInput = JOptionPane.showInputDialog(frame, "Φύλο: 1.Γυναίκα  2.Άνδρας  3.Άλλο");
                                                                    try {
                                                                        sexOption = Integer.parseInt(sexInput);
                                                                        if (sexOption < 1 || sexOption > 3) {

                                                                            throw new NumberFormatException();

                                                                        }

                                                                    } catch (NumberFormatException o) {

                                                                        JOptionPane.showMessageDialog(frame, "Παρακαλώ εισάγετε έγκυρο αριθμό (1, 2 ή 3).");

                                                                        sexOption = 0; // Ορίζουμε σε μη έγκυρη τιμή για να επαναλάβει το loop

                                                                    }

                                                                } while (sexOption < 1 || sexOption > 3);


                                                                String sex = options99[sexOption - 1];
                                                
                                                                String area = JOptionPane.showInputDialog(frame, "Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
                                                               
                                                                String[] options = {"δράσεις δια ζώσης", "διαδικτυακό εθελοντισμό"};
                                                                int preferredCategory = JOptionPane.showOptionDialog(frame,
                                                                "Ποια κατηγορία προτιμάτε:\n1. δράσεις δια ζώσης\n2. διαδικτυακό εθελοντισμό", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                JOptionPane.DEFAULT_OPTION,
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null,
                                                                options,
                                                                options[0]);
                                                
                                                                if (preferredCategory == 0) {
                                                                    String[] options1 = {"Ναι", "Όχι"};
                                                                    int preferredCategory1 = JOptionPane.showOptionDialog(frame,
                                                                    "Έχετε ιατρικές γνώσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options1,
                                                                    options1[0]);
                                                
                                                                    String[] options2 = {"Ναι", "Όχι"};
                                                                    int preferredCategory2 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν το περιβάλλον;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options2,
                                                                    options2[0]);
                                                
                                                                    if (preferredCategory2==0){
                                                                        String[] options3 = {"Καμπάνιες ευαισθητοποίησης ", "Καθαρισμός δημόσιων χώρων", "Δενδροφύτευση/Δασοφύτευση", "Ανακύκλωση"};
                                                                        int qenvironment= JOptionPane.showOptionDialog(frame,
                                                                        "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Καθαρισμός δημόσιων χώρων \n3. Δενδροφύτευση/Δασοφύτευση \n4.Ανακύκλωση ", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                        JOptionPane.DEFAULT_OPTION,
                                                                        JOptionPane.QUESTION_MESSAGE,
                                                                        null,
                                                                        options3,
                                                                        options3[0]);
                                                                    }
                                                 
                                                                    String[] options4 = {"Ναι", "Όχι"};
                                                                    int preferredCategory3 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options4,
                                                                    options4[0]);
                                                
                                                                    if (preferredCategory3==0) {
                                                                         String[] options5 = {"Καμπάνιες ευαισθητοποίησης ", "Κτηνιατριακή περίθαλψη", "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια", "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη", "Προστασία άγριας ζωής"};
                                                                        int qanimal= JOptionPane.showOptionDialog(frame,
                                                                        "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Κτηνιατριακή περίθαλψη \n3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια\n4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη \n5. Προστασία άγριας ζωής", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                        JOptionPane.DEFAULT_OPTION,
                                                                        JOptionPane.QUESTION_MESSAGE,
                                                                        null,
                                                                        options5,
                                                                        options5[0]);
                                                                    }
                                                
                                                                    String[] options6 = {"Ναι", "Όχι"};
                                                                    int preferredCategory4 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options6,
                                                                    options6[0]);
                                                                
                                                                     if (preferredCategory4==0) {
                                                                         String[] options7 = {"Αιμοδοσία", "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια ", "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)", "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) ", "Καμπάνιες ευαισθητοποίησης"};
                                                                        int qhuman= JOptionPane.showOptionDialog(frame,
                                                                        "Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε;:\n1.Αιμοδοσία \n2. Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια \n3. Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)\n4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) \n5. Καμπάνιες ευαισθητοποίησης", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                        JOptionPane.DEFAULT_OPTION,
                                                                        JOptionPane.QUESTION_MESSAGE,
                                                                        null,
                                                                        options7,
                                                                        options7[0]);
                                                                    }
                                                                     String[] options21 = {"Ναι", "Όχι"};
                                                                    int preferredCategory21 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options6,
                                                                    options6[0]);
                                                
                                                                 } else if(preferredCategory == 1) {
                                                
                                                                    String[] options8 = {"Ναι", "Όχι"};
                                                                    int preferredCategory5 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options8,
                                                                    options8[0]);
                                                
                                                 
                                                
                                                                 String[] options9 = {"Ναι", "Όχι"};
                                                                    int preferredCategory6 = JOptionPane.showOptionDialog(frame,
                                                                    "Γνωρίζετε αγγλικά;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options9,
                                                                    options9[0]);
                                                
                                                                    if (preferredCategory6 == 0) {
                                                                        String[] options10 = {"Ναι", "Όχι"};
                                                                        int qtranslate = JOptionPane.showOptionDialog(
                                                                            frame,
                                                                            "Θα σας ενδιέφερε να κάνετε μετάφραση αγγλικών κειμένων στα ελληνικά είτε το αντίστροφο;:\n1. Ναι\n2. Όχι",
                                                                            "Ερώτηση",
                                                                            JOptionPane.YES_NO_OPTION,
                                                                            JOptionPane.QUESTION_MESSAGE,
                                                                            null,
                                                                            options10,
                                                                            options10[0]
                                                                        );
                                                                    }
                                                
                                                                    String[] options11 = {"Ναι", "Όχι"};
                                                                    int preferredCategory7 = JOptionPane.showOptionDialog(frame,
                                                                    "Γνωρίζετε κάποια γλώσσα προγραμματισμού;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options11,
                                                                    options11[0]);
                                                
                                                                    if (preferredCategory7 == 0) {
                                                                        String[] options12 = {"Ναι", "Όχι"};
                                                                        int qprogram = JOptionPane.showOptionDialog(
                                                                            frame,
                                                                            "Θα σας ενδιέφερε να σχεδιάζετε και να υλοποιείτε ιστοσελίδες οργανισμών;:\n1. Ναι\n2. Όχι",
                                                                            "Ερώτηση",
                                                                            JOptionPane.YES_NO_OPTION,
                                                                            JOptionPane.QUESTION_MESSAGE,
                                                                            null,
                                                                            options12,
                                                                            options12[0]
                                                                        );
                                                                    }
                                                
                                                                    String[] options13 = {"Ναι", "Όχι"};
                                                                    int preferredCategory8 = JOptionPane.showOptionDialog(frame,
                                                                    "Θα σας ενδιέφερε ο τομέας του marketing;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options13,
                                                                    options13[0]);
                                                
                                                
                                                                    if (preferredCategory8 == 0) {
                                                                        String[] options14 = {"Ναι", "Όχι"};
                                                                        int qmarketing = JOptionPane.showOptionDialog(
                                                                            frame,
                                                                            "Θα σας ενδιέφερε να βοηθήσετε στην υλοποίηση για καμπάνιες ευαισθητοποίησης;:\n1. Ναι\n2. Όχι",
                                                                            "Ερώτηση",
                                                                            JOptionPane.YES_NO_OPTION,
                                                                            JOptionPane.QUESTION_MESSAGE,
                                                                            null,
                                                                            options14,
                                                                            options14[0]
                                                                        );
                                                                    }
                                                
                                                                    String[] options15 = {"Ναι", "Όχι"};
                                                                    int preferredCategory9 = JOptionPane.showOptionDialog(frame,
                                                                    "θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
                                                                    JOptionPane.DEFAULT_OPTION,
                                                                    JOptionPane.QUESTION_MESSAGE,
                                                                    null,
                                                                    options15,
                                                                    options15[0]);
                                                
                                                                  
                                                
                                                           }
                                                       
                                                       }
                                                       });
                                    
                                                    }
                                                            }


                                                        });
                                                    }
                                                }
                        
                                        });
                                    }
                                }
                                });
                            }
                        }
                    });
    
   
       frame.add(panel);
       frame.setVisible(true);
    }
}
