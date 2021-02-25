/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/**
 *
 * @author S com
 */
public class UDPClient {
 public final static int SERVICE_PORT = 50001;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
    try{
      /* Instantiate client socket. 
      No need to bind to a specific port */
      DatagramSocket clientSocket = new DatagramSocket();
      
      // Get the IP address of the server
      InetAddress IPAddress = InetAddress.getByName("localhost");
      
      // Creating corresponding buffers
      byte[] sendingDataBuffer = new byte[1024];
      byte[] receivingDataBuffer = new byte[1024];
      
      /* Converting data to bytes and 
      storing them in the sending buffer */
      String sentence = "ALIKHAN";
      sendingDataBuffer = sentence.getBytes();
      
      // Creating a UDP packet 
      DatagramPacket sendingPacket = new DatagramPacket(sendingDataBuffer,sendingDataBuffer.length,IPAddress, SERVICE_PORT);
      
      // sending UDP packet to the server
      clientSocket.send(sendingPacket);
      
      // Get the server response .i.e. capitalized sentence
      DatagramPacket receivingPacket = new DatagramPacket(receivingDataBuffer,receivingDataBuffer.length);
      clientSocket.receive(receivingPacket);
      
      // Printing the received data
      String receivedData = new String(receivingPacket.getData());
      System.out.println("Sent from the server: "+receivedData);
      
      // Closing the socket connection with the server
      clientSocket.close();
    }
    catch(SocketException e) {
      e.printStackTrace();
    }
  }
}