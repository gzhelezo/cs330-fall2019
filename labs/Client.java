/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Client {

    public void run() {
        SocketAddress socketAddress = new InetSocketAddress("localhost", 8008);

        try (SocketChannel socketChannel = SocketChannel.open(socketAddress)) {
            System.out.println("Who hoo, we are connected");
            //String message;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Waiting for a message ....");
                String message = receiveMessage(socketChannel);
                System.out.println("Message Received: " + message);
                System.out.print("> ");
                String reply = scanner.nextLine();
                sendMessage(socketChannel, reply);

                if (reply.equalsIgnoreCase("ciao")) {
                    break;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
