package WebServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1337);
        System.out.println("Now listening on port 1337");

        while(true)
        {
            //Listen for a connection
            Socket socket = server.accept();
            Responder responder = new Responder(socket);
            Thread thread = new Thread(responder);
            thread.start();
        }
    }
}

class Responder implements Runnable
{
    private Socket socket;

    public Responder(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Connection established");

            //Read http request
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = reader.readLine();
            if(line == null)
                throw new Exception("Empty http message");

            String[] tokens = line.split("\\s");

            //Generate response
            String response;

            //Only GET requests are supported
            if (!tokens[0].equals("GET"))
                response = "HTTP/1.1 501 NOT IMPLEMENTED \r\n";
            else {
                File file = new File("html" + tokens[1]);
                if (file.isFile())
                    response = "HTTP/1.1 200 OK \r\n" +
                            "Content-Type: text/html\r\n" +
                            "\r\n" +
                            Files.readString(Paths.get("html" + tokens[1]));
                else
                    response = "HTTP/1.1 404 NOT FOUND \r\n";
            }
            socket.getOutputStream().write(response.getBytes());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Close the connection
            try
            {
                socket.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
