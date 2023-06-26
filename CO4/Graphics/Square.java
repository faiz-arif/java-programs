package CO4.Graphics;
import java.util.Scanner;

interface Sqr{
    void square();
}

public class Square implements Sqr {
    Scanner sc = new Scanner(System.in);
    public void square(){
        System.out.println("Enter a side of the square:");
        int s = sc.nextInt();
        System.out.println("The area of the square is: "+(s*s));
    }
}