import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    
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
