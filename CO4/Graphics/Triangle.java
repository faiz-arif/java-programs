package CO4.Graphics;
import java.util.Scanner;

interface Tri{
    void triangle();
}

public class Triangle {
    Scanner sc = new Scanner(System.in);
    public void triangle(){
        System.out.println("Enter the breadth and height of the triangle:");
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("The area of the triangle is: "+(0.5*b*h));
    }
}
