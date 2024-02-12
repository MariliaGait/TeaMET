package com.ethelontismos;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Grafika{
 public static void main(String[] args) {
 
 JFrame frame = new JFrame("eTHELOntismos");
 frame.setSize(1500, 850);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 JPanel panel = new JPanel();
 panel.setBackground(Color.PINK);
 JLabel flabel = new JLabel("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα εθελοντικό ταξίδι;");
 flabel.setBounds(10, 20, 80, 25);
 panel.add(flabel);

 
 JButton continueButton = new JButton(" Let's start ");
 continueButton.setForeground(Color.black);
 continueButton.setContentAreaFilled(false); // Make the button transparent
 continueButton.setBorderPainted(true); // Remove button border
 panel.add(continueButton);
 JButton signinButton = new JButton("Sign up");
 signinButton.setContentAreaFilled(false); // Make the button transparent
 signinButton.setBorderPainted(true); // Remove button border
 panel.add(signinButton);
 JButton loginButton = new JButton("Login");
 loginButton.setContentAreaFilled(false); // Make the button transparent
 loginButton.setBorderPainted(true); // Remove button border
 panel.add(loginButton);
 JButton findyourpathButton = new JButton("Find your path!");
 findyourpathButton.setContentAreaFilled(false); // Make the button transparent
 findyourpathButton.setBorderPainted(true); // Remove button border
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
 continueButton4.setContentAreaFilled(false); // Make the button transparent
 continueButton4.setBorderPainted(true); // Remove button border
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
 findyourpathButton2.setContentAreaFilled(false); // Make the button transparent
 findyourpathButton2.setBorderPainted(true); // Remove button border
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

 String sexInput = JOptionPane.showInputDialog(frame, "Φύλο: 1.Γυναίκα 2.Άνδρας 3.Άλλο");
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
 


 String diadiktiaka;
 String diazosis; 


 if (preferredCategory == 0) {
 diazosis = "Δια ζώσης";
 String[] options1 = {"Ναι", "Όχι"};
 int preferredCategory1 = JOptionPane.showOptionDialog(frame,
 "Έχετε ιατρικές γνώσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options1,
 options1[0]);

 String med="όχι ιατρικές γνώσεις";
 if (preferredCategory1==0) {
 med="ιατρικές γνώσεις";
 }
 
 String[] options2 = {"Ναι", "Όχι"};
 int preferredCategory2 = JOptionPane.showOptionDialog(frame,
 "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν το περιβάλλον;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options2,
 options2[0]);
 

 String env= "όχι περιβάλλον";
 
 if (preferredCategory2==0){
 String[] options3 = {"Καμπάνιες ευαισθητοποίησης ", "Καθαρισμός δημόσιων χώρων", "Δενδροφύτευση/Δασοφύτευση", "Ανακύκλωση"};
 int qenvironment= JOptionPane.showOptionDialog(frame,
 "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Καθαρισμός δημόσιων χώρων \n3. Δενδροφύτευση/Δασοφύτευση \n4.Ανακύκλωση ", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options3,
 options3[0]);


if (qenvironment==1) {
 env= "Καμπάνιες ευαισθητοποίησης για το περιβάλλον";
 } else if (qenvironment==2) {
 env= "Καθαρισμός δημόσιων χώρων";
 } else if (qenvironment==3) {
 env= "Δενδροφύτευση/Δασοφύτευση";
 } else if (qenvironment==4) {
 env= "Ανακύκλωση";
 }

 }
 

 String[] options4 = {"Ναι", "Όχι"};
 int preferredCategory3 = JOptionPane.showOptionDialog(frame,
 "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options4,
 options4[0]);

 String an= "όχι ζώα";

  //μεταβλητες που συλλέγουν τα διάφορα ενδιαφέροντα, τις οποίες θα χρησιμοποιούσαμε για να τις στείλουμε στο AI (προκειμένου να βρεθεί η κλίση του εκάστοτε χρήστη)

 
 if (preferredCategory3==0) {
 String[] options5 = {"Καμπάνιες ευαισθητοποίησης ", "Κτηνιατριακή περίθαλψη", "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια", "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη", "Προστασία άγριας ζωής"};
 int qanimal= JOptionPane.showOptionDialog(frame,
 "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Κτηνιατριακή περίθαλψη \n3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια\n4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη \n5. Προστασία άγριας ζωής", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options5,
 options5[0]);
 if (qanimal==1) {
 an="Καμπάνιες ευαισθητοποίησης για τα ζώα ";
 } else if (qanimal==2){
 an="Κτηνιατριακή περίθαλψη";
 } else if (qanimal==3){
 an="Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
 } else if (qanimal==4){
 an="Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
 } else if (qanimal==5){
 an="Προστασία άγριας ζωής";
 }
 }
 
 String[] options6 = {"Ναι", "Όχι"};
 int preferredCategory4 = JOptionPane.showOptionDialog(frame,
 "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options6,
 options6[0]);

 String hum= "όχι ανθρωπιστικές δράσεις";
 
 if (preferredCategory4==0) {
 String[] options7 = {"Αιμοδοσία", "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια ", "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)", "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) ", "Καμπάνιες ευαισθητοποίησης"};
 int qhuman= JOptionPane.showOptionDialog(frame,
 "Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε;:\n1.Αιμοδοσία \n2. Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια \n3. Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)\n4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) \n5. Καμπάνιες ευαισθητοποίησης", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options7,
 options7[0]);

 if (qhuman==1) {
 hum="Αιμοδοσία";
 } else if (qhuman==2) {
 hum= "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια ";
 } else if (qhuman==3) {
 hum= "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
 } else if (qhuman==4) {
 hum= "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) ";
 } else if (qhuman==5) {
 hum="Καμπάνιες ευαισθητοποίησης";
 }
}
 
 

 
 

 


 } else if(preferredCategory == 1) {
 
 diadiktiaka= "Διαδικτυακά";
 String[] options8 = {"Ναι", "Όχι"};
 int preferredCategory5 = JOptionPane.showOptionDialog(frame,
 "Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options8,
 options8[0]);
 
 
 

 String money="όχι δωρεά";

 if (preferredCategory5==1) {
 money = "Δωρεά";
 } 
 
 String[] options9 = {"Ναι", "Όχι"};
 int preferredCategory6 = JOptionPane.showOptionDialog(frame,
 "Γνωρίζετε αγγλικά;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options9,
 options9[0]);
 

 String engl="όχι αγγλικά";
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

 if (qtranslate==1) {
 engl = "μετάφραση αγγλικών κειμένων στα ελληνικά είτε το αντίστροφο";
 }
 }
 
 String[] options11 = {"Ναι", "Όχι"};
 int preferredCategory7 = JOptionPane.showOptionDialog(frame,
 "Γνωρίζετε κάποια γλώσσα προγραμματισμού;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options11,
 options11[0]);

 String prog = "όχι προγραμματισμός";
 
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

if (qprogram==1) {
 prog= "σχεδιασμός και υλοποίηση ιστοσελίδων οργανισμών" ;
}
 }
 
 String[] options13 = {"Ναι", "Όχι"};
 int preferredCategory8 = JOptionPane.showOptionDialog(frame,
 "Θα σας ενδιέφερε ο τομέας του marketing;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options13,
 options13[0]);
 String mark= "όχι μάρκετινγκ" ;
 
 
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
 if (qmarketing==1){
 mark= "υλοποίηση καμπάνιας ευαισθητοποίησης μέσω μάρκετινγκ";
 }
 }


 String adv = "όχι διαδικτυακή υποστήριξη μέσω συμβουλών";
 
 String[] options15 = {"Ναι", "Όχι"};
 int preferredCategory9 = JOptionPane.showOptionDialog(frame,
 "θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options15,
 options15[0]);
 

 if (preferredCategory9==1) {
 adv= "διαδικτυακή υποστήριξη μέσω συμβουλών" ;
 } 
 String result2 = diadiktiaka+ ", " + money + ", "+ prog + ", " + engl + ", " + mark + ", " + adv;
 
 
 
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
 continueButton2.setContentAreaFilled(false); // Make the button transparent
 continueButton2.setBorderPainted(true); // Remove button border
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
 loginButton2.setContentAreaFilled(false); // Make the button transparent
 loginButton2.setBorderPainted(true); // Remove button border
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
 userLabel2.setBounds(10, 20, 120, 25);
 panel.add(userLabel2);
 
 JTextField userText2 = new JTextField(20);
 userText2.setBounds(130, 20, 165, 25);
 panel.add(userText2);
 
 JLabel userPassword2 = new JLabel("Κωδικός Πρόσβασης");
 userPassword2.setBounds(10, 50, 120, 25);
 panel.add(userPassword2);
 
 JPasswordField passwordText2 = new JPasswordField(20);
 passwordText2.setBounds(130, 50, 165, 25);
 panel.add(passwordText2);
 
 
 
 


 JButton continueButton3 = new JButton("Continue");
 continueButton3.setContentAreaFilled(false); // Make the button transparent
 continueButton3.setBorderPainted(true); // Remove button border
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
 findyourpathButton.setContentAreaFilled(false); // Make the button transparent
 continueButton.setBorderPainted(true); // Remove button border
 panel.add(findyourpathButton);
 
 findyourpathButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {


 

 String name = JOptionPane.showInputDialog(frame, "Ονοματεπώνυμο: ");
 
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

 String sexInput = JOptionPane.showInputDialog(frame, "Φύλο: 1.Γυναίκα 2.Άνδρας 3.Άλλο");
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


 String diadiktiaka;
 String diazosis;

 
 if (preferredCategory == 0) {
 diazosis = "Δια ζώσης";
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

 String env= "όχι περιβάλλον";
 
 if (preferredCategory2==0){
 String[] options3 = {"Καμπάνιες ευαισθητοποίησης ", "Καθαρισμός δημόσιων χώρων", "Δενδροφύτευση/Δασοφύτευση", "Ανακύκλωση"};
 int qenvironment= JOptionPane.showOptionDialog(frame,
 "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν το περιβάλλον θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Καθαρισμός δημόσιων χώρων \n3. Δενδροφύτευση/Δασοφύτευση \n4.Ανακύκλωση ", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options3,
 options3[0]);


if (qenvironment==1) {
 env= "Καμπάνιες ευαισθητοποίησης για το περιβάλλον";
 } else if (qenvironment==2) {
 env= "Καθαρισμός δημόσιων χώρων";
 } else if (qenvironment==3) {
 env= "Δενδροφύτευση/Δασοφύτευση";
 } else if (qenvironment==4) {
 env= "Ανακύκλωση";
 }
 }
 
 String[] options4 = {"Ναι", "Όχι"};
 int preferredCategory3 = JOptionPane.showOptionDialog(frame,
 "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν τα ζώα;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options4,
 options4[0]);
 
 String an= "όχι ζώα";
 if (preferredCategory3==0) {
 String[] options5 = {"Καμπάνιες ευαισθητοποίησης ", "Κτηνιατριακή περίθαλψη", "Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια", "Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη", "Προστασία άγριας ζωής"};
 int qanimal= JOptionPane.showOptionDialog(frame,
 "Με ποια από τις παρακάτω εθελοντικές δράσεις που αφορούν τα ζώα θα σας ενδιέφερε να ασχοληθείτε;:\n1.Καμπάνιες ευαισθητοποίησης \n2. Κτηνιατριακή περίθαλψη \n3. Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια\n4.Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη \n5. Προστασία άγριας ζωής", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options5,
 options5[0]);


 if (qanimal==1) {
 an="Καμπάνιες ευαισθητοποίησης για τα ζώα ";
 } else if (qanimal==2){
 an="Κτηνιατριακή περίθαλψη";
 } else if (qanimal==3){
 an="Φροντίδα/Παρέα σε άπορα ζώα σε καταφύγια";
 } else if (qanimal==4){
 an="Μεταφορά ζώων που είναι σε κρίσιμη ανάγκη";
 } else if (qanimal==5){
 an="Προστασία άγριας ζωής";
 }

 }
 
 String[] options6 = {"Ναι", "Όχι"};
 int preferredCategory4 = JOptionPane.showOptionDialog(frame,
 "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options6,
 options6[0]);
 
 String hum= "όχι ανθρωπιστικές δράσεις";
 
 if (preferredCategory4==0) {
 String[] options7 = {"Αιμοδοσία", "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια ", "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)", "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) ", "Καμπάνιες ευαισθητοποίησης"};
 int qhuman= JOptionPane.showOptionDialog(frame,
 "Με ποια από τις παρακάτω εθελοντικές ανθρωπιστικές δράσεις θα σας ενδιέφερε να ασχοληθείτε;:\n1.Αιμοδοσία \n2. Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια \n3. Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)\n4.Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) \n5. Καμπάνιες ευαισθητοποίησης", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options7,
 options7[0]);

 if (qhuman==1) {
 hum="Αιμοδοσία";
 } else if (qhuman==2) {
 hum= "Εκπαίδευση και υποστήριξη παιδιών σε κοινωνικά φροντιστήρια ";
 } else if (qhuman==3) {
 hum= "Προσφορά βοήθειας σε καταστροφές (πχ σεισμούς, πυρκαγιές)";
 } else if (qhuman==4) {
 hum= "Ιατρική περίθαλψη(πχ Γιατροί χωρίς σύνορα) ";
 } else if (qhuman==5) {
 hum="Καμπάνιες ευαισθητοποίησης";
 }
 }
 String[] options21 = {"Ναι", "Όχι"};
 int preferredCategory21 = JOptionPane.showOptionDialog(frame,
 "Θα θέλατε να λάβετε μέρος σε εθελοντικές δράσεις που αφορούν ανθρωπιστικές δράσεις;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options6,
 options6[0]);
 

 String result1 = diazosis + ", " + env + ", " + an + ", " + hum ;
 } else if(preferredCategory == 1) {
 
 diadiktiaka= "Διαδικτυακά";

 
 String[] options8 = {"Ναι", "Όχι"};
 int preferredCategory5 = JOptionPane.showOptionDialog(frame,
 "Θα σας ενδιέφερε να κάνετε χρηματική δωρεά σε κάποια ΜΚΟ;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options8,
 options8[0]);


 String money="όχι δωρεά";

 if (preferredCategory5==1) {
 money = "Δωρεά";
 } 
 
 
 
 String[] options9 = {"Ναι", "Όχι"};
 int preferredCategory6 = JOptionPane.showOptionDialog(frame,
 "Γνωρίζετε αγγλικά;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options9,
 options9[0]);


 String engl="όχι αγγλικά";
 
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

 if (qtranslate==1) {
 engl = "μετάφραση αγγλικών κειμένων στα ελληνικά είτε το αντίστροφο";
 }
 }
 
 String[] options11 = {"Ναι", "Όχι"};
 int preferredCategory7 = JOptionPane.showOptionDialog(frame,
 "Γνωρίζετε κάποια γλώσσα προγραμματισμού;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options11,
 options11[0]);


 String prog = "όχι προγραμματισμός";
 
 
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


if (qprogram==1) {
 prog= "σχεδιασμός και υλοποίηση ιστοσελίδων οργανισμών" ;
}
 }
 
 String[] options13 = {"Ναι", "Όχι"};
 int preferredCategory8 = JOptionPane.showOptionDialog(frame,
 "Θα σας ενδιέφερε ο τομέας του marketing;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options13,
 options13[0]);
 
 

 String mark= "όχι μάρκετινγκ" ;
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

 if (qmarketing==1){
 mark= "υλοποίηση καμπάνιας ευαισθητοποίησης μέσω μάρκετινγκ";
 }
 }
 

 String adv = "όχι διαδικτυακή υποστήριξη μέσω συμβουλών";

 String[] options15 = {"Ναι", "Όχι"};
 int preferredCategory9 = JOptionPane.showOptionDialog(frame,
 "θα σας ενδιέφερε ο τομέας της διαδικτυακής υποστήριξης και βοήθειας μέσω συμβουλών;:\n1. Ναι \n2. Όχι", "Προτιμώμενη Κατηγορία Εθελοντισμού",
 JOptionPane.DEFAULT_OPTION,
 JOptionPane.QUESTION_MESSAGE,
 null,
 options15,
 options15[0]);


 if (preferredCategory9==1) {
 adv= "διαδικτυακή υποστήριξη μέσω συμβουλών" ;
 }

 String result2 = diadiktiaka+ ", " + prog + ", " + mark + ", " + adv;
  // τα ενδιαφέροντα του χρήστη θα συγκεντρώνονταν στα result1 και result2 (θα συλλέγονταν και τα αντίστοιχα δεδομένα από το αρχικό login button), τα οποία θα στέλονταν στο AI για τη συνέχεια της διαδικασίας, και τη πρόταση των κατάλληλων εθελοντικών δράσεων στον χρήστη

 

 
 
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
