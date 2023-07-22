package CO6;

public class Question6 {
    
}



socUDPClient.java
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class socUDPClient {
public static void main(String[] args) {
    	try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
        	int serverPort = 9908;
        	Scanner scanner = new Scanner(System.in);
            System.out.print("ENTER A STRING: ");
        	String str = scanner.nextLine();
            scanner.close();
        	byte[] sendData = str.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
        	byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
        	String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server Response: " + serverResponse);
            clientSocket.close();
    	} catch (UnknownHostException e) {
            e.printStackTrace();
    	} catch (IOException e) {
        	e.printStackTrace();
    	}
}
}
 
UDPServer.java
import java.io.*;
import java.net.*;
public class UDPServer {
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
