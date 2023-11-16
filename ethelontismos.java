import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class eTHELOntismos {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα νέο εθελοντικό ταξίδι;");
      // δημιουργια κλασης για το προφιλ χρηστη
      UsersProfile userProfile = UsersProfile.collectUserInformation();
      // καλω την κλαση που περιλαμβανει το προφιλ του χρηστη και απο αυτη χρειαζομαι μονο ονομα και ηλικια
      String userName = userProfile.getUsername();
      int userAge = userProfile.getAge();
      System.out.println("Ας ανακαλύψουμε τι σας ταιριάζει!");
      // δημιουργια κλασης για τα ενδιαφεροντα του χρηστη 








        // Ask other relevant questions and collect user responses

        // Step 2: Connect to GPT-3.5 for Suggestions
        String apiKey = "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";
        String apiUrl = "https://api.openai.com/v1/engines/davinci-codex/completions";
        
        // Construct the prompt based on user responses
        String prompt = "Given the following information about " + userName + ", who is " + userAge + " years old, located in " + userLocation + ", and interested in " + userInterests + ", suggest suitable volunteering opportunities: ...";
        String payload = "{ \"prompt\": \"" + prompt + "\", \"max_tokens\": 150 }";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(apiUrl);
            httpPost.addHeader("Content-Type", "application/json");
            httpPost.addHeader("Authorization", "Bearer " + apiKey);
            httpPost.setEntity(new StringEntity(payload));

            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // Step 3: Display Suggestions to the User
                    String suggestions = EntityUtils.toString(entity);
                    System.out.println("Volunteering Suggestions:\n" + suggestions);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 4: User Interaction and Refinement
        // Allow the user to provide feedback or refine the suggestions

        // Step 5: Integration with Volunteering Platforms
        // Optionally, integrate with real-time volunteering opportunities

        // Close resources
        scanner.close();
    }
}