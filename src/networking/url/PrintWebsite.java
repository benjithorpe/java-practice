// scraping the site and viewing the source code
package networking.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class PrintWebsite {

    public static void main(String[] args) {
        // using the URLConnection Class
        try {
            URL url2 = new URL("https://benjithorpe.github.io/");

            // opens connection to the URL
            URLConnection urlConnection = url2.openConnection();

            HttpURLConnection httpURLConnection = null;

            if (urlConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("Please enter an Http URL");
                return;
            }

            try (InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

                StringBuilder urlString = new StringBuilder("");
                String currentLine;

                while ((currentLine = bufferedReader.readLine()) != null) {
                    urlString.append(currentLine.concat("\n"));
                }
                System.out.println(urlString);
            }

        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.getMessage());
        }
    }
}
