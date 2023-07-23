package CO6;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
public class Question5_client {
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
