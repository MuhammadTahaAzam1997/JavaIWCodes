/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/**
 *
 * @author S com
 */
public class UDPServer {
 public final static int SERVICE_PORT=50001;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
    try{
      // Instantiate a new DatagramSocket to receive responses from the client
      DatagramSocket serverSocket = new DatagramSocket(SERVICE_PORT);
      
      /* Create buffers to hold sending and receiving data.
      It temporarily stores data in case of communication delays */
      byte[] receivingDataBuffer = new byte[1024];
      byte[] sendingDataBuffer = new byte[1024];
      
      /* Instantiate a UDP packet to store the 
      client data using the buffer for receiving data*/
      DatagramPacket inputPacket = new DatagramPacket(receivingDataBuffer, receivingDataBuffer.length);
      System.out.println("Waiting for a client to connect...");
      
      // Receive data from the client and store in inputPacket
      serverSocket.receive(inputPacket);
      
      // Printing out the client sent data
      String receivedData = new String(inputPacket.getData());
      StringBuilder str2 =new StringBuilder(); // string builder class
     str2.append(receivedData); 
     str2 = str2.reverse(); //reverse string
   
      System.out.println("Sent from the client: "+str2);
      
      /* 
      * Convert client sent data string to upper case,
      * Convert it to bytes
      *  and store it in the corresponding buffer. */
      sendingDataBuffer = receivedData.toUpperCase().getBytes();
      
      // Obtain client's IP address and the port
      InetAddress senderAddress = inputPacket.getAddress();
      int senderPort = inputPacket.getPort();
      
      // Create new UDP packet with data to send to the client
      DatagramPacket outputPacket = new DatagramPacket(
        sendingDataBuffer, sendingDataBuffer.length,
        senderAddress,senderPort
      );
      
      // Send the created packet to client
      serverSocket.send(outputPacket);
      // Close the socket connection
      serverSocket.close();
    }
    catch (SocketException e){
      e.printStackTrace();
    }
  }
}
