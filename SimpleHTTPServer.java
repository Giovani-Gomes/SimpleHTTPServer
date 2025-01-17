package hhtp;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHTTPServer {
    public static void main(String[] args) throws Exception {
        final ServerSocket SERVER = new ServerSocket(8081);
        System.out.println("Listening for connection on port 8081 ....");
        while (true){
            try (Socket socket = SERVER.accept())
            { Date today = new Date(); String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream() .write(httpResponse.getBytes("UTF-8")); }



        }
    }



}
