package CO6;

public class Question5 {
    
}


socServer.java
import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class socServer {
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
socClient.java
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
public class socClient {
        	public static void main(String[] args) {
try{
                                	Socket soc = new Socket("localhost", 9908);
                                	System.out.println("ENTER A STRING: ");
                                	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                	String str = br.readLine();  	
                                	PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                                	out.println(str);                   	
                                	BufferedReader brIn = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                                	System.out.println(brIn.readLine());}
                    	catch (UnknownHostException e) {
                                	e.printStackTrace();}
                    	catch (IOException e) {
                                	e.printStackTrace();
}
}
}
