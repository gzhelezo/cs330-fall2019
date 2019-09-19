/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author
 */
public class UDPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(7001);
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        while (true) {
            DatagramPacket receivePacket
                    = new DatagramPacket(receiveData,
                            receiveData.length);

            serverSocket.receive(receivePacket);

            String input = new String(
                    receivePacket.getData());

            InetAddress IPAddress
                    = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String capitalizedSentence
                    = input.toUpperCase();
            sendData = capitalizedSentence.getBytes();
            DatagramPacket sendPacket
                    = new DatagramPacket(sendData, sendData.length,
                            IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}
