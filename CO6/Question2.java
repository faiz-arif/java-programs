package CO6;
import java.util.*;
import java.io.*;
public class Question2
{
  public static void main(String[] args) throws Exception{
    FileOutputStream fos = new FileOutputStream("D:\\Programs\\github-rep\\faiz-arif\\java-programs\\faiz.txt");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter text to insert: ");
    String text = sc.nextLine();
    fos.write(text.getBytes());
    FileInputStream fis = new FileInputStream("D:\\Programs\\github-rep\\faiz-arif\\java-programs\\faiz.txt");
    byte[] b = new byte[fis.available()];
    fis.read(b);
    String s = new String(b);
    System.out.println(s);
    fos.close();
    fis.close();
    sc.close();
  }}