import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;
//έβαλα και άλλα import και τα λάθη μειώθηκαν σε 11 απο 16(εμμέλεια)//
public class eTHELOntismos {

    public static String chatGPT(String prompt) {
        String url = "https://api.openai.com/v1/completions";
        String apiKey = "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";
        String model = "gpt-3.5-turbo";

        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "application/json");

            // The request body
            String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt + "\"}]}";
            connection.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();

            // Response from ChatGPT
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            StringBuffer response = new StringBuffer();

            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            // calls the method to extract the message.
            return extractMessageFromJSONResponse(response.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String extractMessageFromJSONResponse(String response) {
        int start = response.indexOf("content") + 11;

        int end = response.indexOf("\"", start);

        return response.substring(start, end);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Καλώς ήρθατε στον εΘΕΛΩντισμό! Είστε έτοιμοι για ένα νέο εθελοντικό ταξίδι;");
        UsersProfile userProfile = UsersProfile.collectUserInformation();
        //καλω την κλαση που περιλαμβανει το προφιλ του χρηστη και παιρνω το ονομα του 
        String userName = userProfile.getUsername();
        System.out.println("Ας ανακαλύψουμε τι σας ταιριάζει!");
        //καλω την κλαση userinterest ωστε να λαβω τα ενδιαφεροντα του χρηστη 
        UsersInterests usersint = new UsersInterests();
        String result = usersint.return_result();
        System.out.println(chatGPT("Ο χρήστης με το όνομα" + userName + "ενδιαφέρεται να λάβει μέρος σε μια εθελοτνική δράση. Ενδιαφέρεται για :" + result + " Πρότεινέ του την κατάλληλη εθελοντική εργασία"));
    }
}
