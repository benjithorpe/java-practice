package networking.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadFromServer {

    public static void main(String[] args) {

        try (Socket socket = new Socket("127.0.0.1", 5000);
                InputStreamReader reader = new InputStreamReader(socket.getInputStream());
                BufferedReader br = new BufferedReader(reader);) {

            System.out.println("I am reading from server");
            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("Err " + e.getMessage());
        }
    }
}
