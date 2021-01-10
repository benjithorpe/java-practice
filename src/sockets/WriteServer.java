package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class WriteServer {

    public static void main(String[] args) {
        WriteServer ws = new WriteServer();
        ws.start();
        ws.close();
    }

    ServerSocket server = null;

    void start() {
        try {
            server = new ServerSocket(5000);

            System.out.println("Waiting for connections...");
            try (Socket socket = server.accept();
                    InputStreamReader reader = new InputStreamReader(socket.getInputStream());
                    BufferedReader br = new BufferedReader(reader);) {

                System.out.println("I am from client");
                System.out.println(br.readLine());
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
