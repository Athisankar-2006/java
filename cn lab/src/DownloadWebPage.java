
 import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DownloadWebPage{


    public static void main(String[] args) {
        // URL of the webpage you want to download
        String url = "https://www.google.com"; // you can change this

        // Name of file to save the webpage
        String fileName = "downloaded_page.html";

        // Create an HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Build a GET request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            // Send request and get response as a string
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Save webpage HTML content to a local file
            Files.writeString(Path.of(fileName), response.body());

            System.out.println("✅ Webpage downloaded successfully!");
            System.out.println("📄 Saved as: " + fileName);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    

