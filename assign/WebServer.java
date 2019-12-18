/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebServer {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(6500);

            System.out.println("Listening on port 6500");

            while (true) {
                try (Socket socket = server.accept()) {
                    String response = "HTTP/1.1 200 OK\r\n\"Content-Type: text/html\r\n\r\n"
                            + "<html><body>"
                            + "CS330 - My first web server!"
                            + "</body></html>";

                    socket.getOutputStream().write(response.getBytes());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(WebServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
