package networking.sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ReadServer {
    public static void main(String[] args) {
        ReadServer rs = new ReadServer();
        rs.start();
        rs.close();
    }

    ServerSocket server = null;

    void start() {
        try {
            server = new ServerSocket(5000);

            System.out.println("Waiting for connections...");
            try (Socket socket = server.accept();
                    PrintWriter writer = new PrintWriter(socket.getOutputStream());) {

                writer.write("I am from server");
            }
        } catch (IOException e) {
            System.out.println("Err " + e.getMessage());
        }
    }

    void close() {
        try {
            if (server != null) {
                server.close();
            }

        } catch (IOException e) {
            System.out.println("Err: " + e.getMessage());
        }
    }

}
