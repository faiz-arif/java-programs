package CO4;
import java.util.*;
import C04.Graphics.Rectangle;
import C04.Graphics.Triangle;
import C04.Graphics.Square;
import C04.Graphics.Circle;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle objrect = new Rectangle();
        Triangle objtri = new Triangle();
        Square objsqr = new Square();
        Circle objcir = new Circle();
        int c;
        do{
            System.out.println("Enter the choice\n1. Area of Rectangle\n2. Area of Triangle\n3. Area of Square\n4. Area of Circle\n0. Exit");
            c = sc.nextInt();
            switch(c){
                case 1: objrect.rectangle();
                break;
                case 2: objtri.triangle();
                break;
                case 3: objsqr.square();
                break;
                case 4: objcir.circle();
                break;
                case 0: System.out.println("Exiting...!!!");
                break;
            }
        }while(c!=0);
    }
}
