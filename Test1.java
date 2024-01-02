public class Test1 {

    private static String generateChatResponse(String input) {

        try {

            HttpClient httpClient = HttpClients.createDefault();
            HttpPost request = new HttpPost("https://api.openai.com/v1/engines/davinci-codex/completions");

            request.setHeader("Content-Type", "application/json");
            request.setHeader("Authorization", "Bearer " + apiKey);

            String jsonPayload = "{\n" +
                    "  \"prompt\": \"" + input + "\"\n" +
                    "}";
            request.setEntity(new StringEntity(jsonPayload));

            HttpResponse response = httpClient.execute(request);
            String responseBody = EntityUtils.toString(response.getEntity());

            // Επιστροφή της απάντησης που λάβατε από το ChatGPT
            return responseBody;

        } catch (IOException e) {

            e.printStackTrace();
            return "Error connecting to ChatGPT.";

        }

    }

    public static void main(String args[]) {

        System.out.println(generateChatResponse("Hi!"));

    }
    
}