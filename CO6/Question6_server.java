package CO6;
import java.io.*;
import java.net.*;
public class Question6_server {
public static void main(String[] args) {
    	try {
            DatagramSocket serverSocket = new DatagramSocket(9908);
            System.out.println("Server is Waiting for Client Messages...");
 
        	while (true) {
            	byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
            	String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from Client: " + clientMessage);
                System.out.print("Enter Reply: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            	String replyMessage = reader.readLine();
            byte[] sendData = replyMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
      	  }
    	} catch (IOException e) {
            e.printStackTrace();
    	}
}
}
