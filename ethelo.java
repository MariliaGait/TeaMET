import java.util.Scanner;

public class ethelo {
    public static void main(String[] args) {
        System.out.println("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα νέο εθελοντικό ταξίδι;");
        UsersProfile userProfile = UsersProfile.collectUserInformation();
        //καλω την κλαση που περιλαμβανει το προφιλ του χρηστη και παιρνω το ονομα του 
        String userName = userProfile.getUsername();
        System.out.println("Ας ανακαλύψουμε τι σας ταιριάζει!");
        //καλω την κλαση userinterest ωστε να λαβω τα ενδιαφεροντα του χρηστη 
        String result =  UsersInterests.return_result();
        System.out.println(ChatConn.chatGPT("Ο χρήστης με το όνομα" + userName + "ενδιαφέρεται να λάβει μέρος σε μια εθελοτνική δράση. Ενδιαφέρεται για :" + result + " Πρότεινέ του την κατάλληλη εθελοντική εργασία"));
    }
}
