package CO4.Graphics;
import java.util.*;
interface Rect{
    void rectangle();
}

public class Rectangle implements Rect{
    Scanner sc = new Scanner(System.in);
    public void rectangle(){
        System.out.println("Enter the length and breadth of the rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The area of the rectangle is: "+(l*b));
    }
}
