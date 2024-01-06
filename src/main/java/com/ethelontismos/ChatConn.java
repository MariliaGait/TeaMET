package com.ethelontismos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

public class ChatConn {

  public static String chatGPT(String prompt) {

    String url = "https://api.openai.com/v1/chat/completions";
    String apiKey = "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";
    String model = "gpt-3.5-turbo";

    StringBuffer response = new StringBuffer();

    try {

      URI uri = new URI(url);
      URL obj = uri.toURL();
      HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

      connection.setRequestMethod("POST");
      connection.setRequestProperty("Authorization", "Bearer " + apiKey);
      connection.setRequestProperty("Content-Type", "application/json");

      // The request body
      String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt
          + "\"}]}";
      connection.setDoOutput(true);
      OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
      writer.write(body);
      writer.flush();
      writer.close();

      // Response from ChatGPT
      BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String line;

      while ((line = br.readLine()) != null) {
        response.append(line);
      }

      br.close();

      // calls the method to extract the message.
      return extractContentFromResponse(response.toString());

    } catch (IOException e) {

      throw new RuntimeException(e);

    } catch (URISyntaxException e) {

      e.printStackTrace();

    }

    return response.toString();

  }

  public static String extractContentFromResponse(String response) {

    int start = response.indexOf("content") + 11;
    int end = response.indexOf("\"", start);
    return response.substring(start, end);

  }

}
