package CO6;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Question6_client {
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
 