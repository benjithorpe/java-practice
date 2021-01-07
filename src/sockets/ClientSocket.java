package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {

    // things about the server to know
    // 1. who it is (IP Address)
    // 2. port number

    // important points
    // 1. use socketObject.getInputStream() to read from a socket
    // 2. use socketObject.getOutputStream() to write to a socket
    public static void main(String[] args) throws IOException {

        // READING DATA FROM A SOCKET
        // make a Socket connection to the Server
        Socket socket = new Socket("127.0.0.1", 5000);

        // get the input from a socket before reading
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

        // read the data with buffered reader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String message = bufferedReader.readLine();
        System.out.println("Message: " + message);

        // WRITING DATA TO A SOCKET
        // make a socket connection
        // get the output stream before writing using PrintWriter
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Message to send!");
    }

}
