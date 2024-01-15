package com.ethelontismos;
import java.util.List;

public class Ethelo_1 { // main class και σύνδεση με ΑΙ

    public static void main(String[] args) throws Exception {

        System.out.println("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα νέο εθελοντικό ταξίδι;");

        UsersProfile userProfile = UsersProfile.collectUserInformation();
        UsersProfileManager.newUser(userProfile);
        String userName = userProfile.getUsername();

        System.out.println("Ας ανακαλύψουμε τι σας ταιριάζει!");
        String result = UsersInterests.return_result(); 
        
        VolunteerDB.fillDB();
        List<VolunteerAction> allActions = VolunteerDB.getAllVolunteerActions();
    
        String targetKeyword = RemoveNegativeInterests.removeNegativeInterests(result);
        //1η γραμμή σύνδεση μέσω Chat
        String promptDBandKeyword = ChatDbKeyword.promptBuilder(targetKeyword,allActions,userName);
        String answer =ChatConn.chatGPT(promptDBandKeyword);
        System.out.println(answer);
        /*
        String actions = /* εδω συνδεση με db */ ;
        String prompt =  "Ο χρήστης με το όνομα " + userName + " ενδιαφέρεται να λάβει μέρος σε μια εθελοντική δράση. Ενδιαφέρεται για: " + result + ". Πρότεινέ του την πιο κατάλληλη εθελοντική δράση από τις ακόλουθες: " + actions ;
        String answer = ChatConn.chatGPT(prompt);
        System.out.println(answer); 
        */
    }
}
