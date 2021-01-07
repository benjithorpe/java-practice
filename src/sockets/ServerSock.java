package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSock {

    public static void main(String[] args) throws IOException {

        // server makes a server socket on a port
        // for other sockets will connect to
        ServerSocket serverSocket = new ServerSocket(5000);

        // creates a new socket for each client which connects
        Socket clientSocket = serverSocket.accept();
    }

}
