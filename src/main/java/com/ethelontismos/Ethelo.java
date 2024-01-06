package com.ethelontismos;

import java.util.List;

public class Ethelo {

    public static void main(String[] args) {

        System.out.println("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα νέο εθελοντικό ταξίδι;");
        UsersProfile userProfile = UsersProfile.collectUserInformation();
        //αποθηκευω το προφιλ του χρηστη στη βαση
        UserProfileManager.newUser(userProfile);
        //καλω την κλαση που περιλαμβανει το προφιλ του χρηστη και παιρνω το ονομα του 
        String userName = userProfile.getUsername();
        System.out.println("Ας ανακαλύψουμε τι σας ταιριάζει!");
        //καλω την κλαση userinterest ωστε να λαβω τα ενδιαφεροντα του χρηστη 
        String result =  UsersInterests.return_result();
                
        //ChatConn.chatGPT("Hi, I am going to give you some information about a user and I want you to give me the most suitable volunteering work for him");
        //System.out.println(ChatConn.chatGPT("Ο χρήστης με το όνομα" + userName + "ενδιαφέρεται να λάβει μέρος σε μια εθελοτνική δράση. Ενδιαφέρεται για :" + result + " .Πρότεινέ του την κατάλληλη εθελοντική εργασία"));
    
        VolunteerDB.fillDB();
        List<VolunteerAction> allActions = VolunteerDB.getAllVolunteerActions();
    
        String targetKeyword = RemoveNegativeInterests.removeNegativeInterests(result);
        
        List<VolunteerAction> filteredActions = VolunteerActionHandler.
        filterByKeywords(allActions, targetKeyword);
        
        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Οι δράσεισ που σου προτείνουμε είναι οι εξής:");

        for (VolunteerAction action : filteredActions) {

            System.out.println(action);

        }

    }

}
