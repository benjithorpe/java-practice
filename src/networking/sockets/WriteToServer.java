package networking.sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class WriteToServer {

    // things about the server to know
    // 1. who it is (IP Address)
    // 2. port number
    // important points
    // 1. use socketObject.getInputStream() to read from a socket
    // 2. use socketObject.getOutputStream() to write to a socket
    public static void main(String[] args) {

        try (Socket socket = new Socket("127.0.0.1", 5000);
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());) {

            printWriter.println("I am writing to server from client");
            System.out.println("message sent");

        } catch (IOException e) {
            System.out.println("Err " + e.getMessage());
        }
    }
}
