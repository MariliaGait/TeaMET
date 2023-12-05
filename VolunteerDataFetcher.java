import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class VolunteerDataFetcher {

    public static String fetchDataFromApi(String apiUrl) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        HttpResponse<String> response = client.send(request,
            HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
    
}

private class Scheduler {
    
    private static final String apiURL = "to api url mas klp";
    
    public static void main(String[] args) {

        ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

        //lambda
        scheduler.scheduleAtFixedRate(() -> {
            
            try {

            VolunteerDataFetcher.fetchDataFromApi(apiURL);
            
            } catch (Exception e) {

                e.printStackTrace();

            }
        //kathe 5 lepta fixed
        }, 0, 5, TimeUnit.MINUTES);

    }

}
