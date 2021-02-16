package networking.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) {
        String site = "https://benjithorpe.github.io";

        try {
            URL url = new URL(site);

            // gets current URL path
            System.out.println("Path: " + url.getPath());

            // gets query
            System.out.println("Query: " + url.getQuery());

            // gets authority
            System.out.println("Authority: " + url.getAuthority());

            // gets port
            System.out.println("Port: " + url.getPort());

            // gets default port
            System.out.println("Default Port: " + url.getDefaultPort());

            // gets protocol
            System.out.println("Protocol: " + url.getProtocol());

            // gets host
            System.out.println("Host: " + url.getHost());

            // gets filename
            System.out.println("Filename: " + url.getFile());

            // gets reference
            System.out.println("Reference: " + url.getRef());

        } catch (MalformedURLException ex) {
            System.out.println("Error: " + ex.getLocalizedMessage());
        }
    }
}
