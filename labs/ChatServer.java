package server;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class ChatServer {

    public void run() {
        System.out.println("Chat Server Started");

        try {

            // Create a socket channel
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

            // Bind to some IP address
            serverSocketChannel.bind(new InetSocketAddress(8008));

            // Server loop
            while (true) {
                System.out.println("Waiting for a client request .....");

                // wait for a message from the client
                SocketChannel socketChannel = serverSocketChannel.accept();

                System.out.println("Connected to client ....");

                // Enter the conversation
                Scanner scanner = new Scanner(System.in);

                // Begin the clinet-server conversation
                while (true) {

                    System.out.println(">");
                    String message = scanner.nextLine();

                    // while some terminating message
                    if (message.equalsIgnoreCase("ciao")) {
                        sendMessage(socketChannel, message);
                        break;
                    } else {
                        sendMessage(socketChannel, message);

                        System.out.println("Waiting for response ....");

                        String response = receiveMessage(socketChannel);
                        System.out.println("Response: " + response);
                    }
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void sendMessage(SocketChannel socketChannel, String message) {
        try {
            // Allocate enough space for message as bytes
            ByteBuffer buffer = ByteBuffer.allocate(message.length() + 1);
            buffer.put(message.getBytes());
            buffer.put((byte) 0x00);
            buffer.flip();

            // Write the bytes to the socket channel
            while (buffer.hasRemaining()) {
                socketChannel.write(buffer);
            }

            System.out.println("Message Sent: " + message);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String receiveMessage(SocketChannel socketChannel) {
        try {
            // Allocate space
            ByteBuffer byteBuffer = ByteBuffer.allocate(8);

            String response = "";

            while (socketChannel.read(byteBuffer) > 0) {
                char byteRead = 0x00;
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    byteRead = (char) byteBuffer.get();
                    if (byteRead == 0x00) {
                        break;
                    }
                    response += byteRead;
                }
                if (byteRead == 0x00) {
                    break;
                }
                byteBuffer.clear();
            }
            return response;
            // Read the incoming message
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "";
    }
}
