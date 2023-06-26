package CO4.Graphics;
import java.util.Scanner;

interface Cir{
    void circle();
}

public class Circle implements Cir {
    Scanner sc = new Scanner(System.in);
    public void circle(){
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        System.out.println("The area of the circle is: "+(3.14*r*r));
    }
}
