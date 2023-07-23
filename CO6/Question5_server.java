package CO6;

import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Question5_server {
	public static void main(String[] args) {
try {
            System.out.println("Server is Waiting!");
            ServerSocket ss = new ServerSocket(9908);
        	Socket soc = ss.accept();
            System.out.println("Connection Established!");
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        	String str = br.readLine();
            System.out.println("Client: " + str);
      	  Scanner sc = new Scanner(System.in);
            System.out.print("Enter Reply: ");
        	String text = sc.nextLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server: " + text);
     	   sc.close();
    		} catch (IOException e) {
        	        	e.printStackTrace();
}
}
}