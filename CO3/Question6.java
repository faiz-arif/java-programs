import java.util.*;
import java.lang.Math;
interface Prototypes {
    double Area ();
    double Perimeter();
}

class Circle implements Prototypes {

    float Radius;

    Circle ( float radius) {
        this.Radius = radius;
    }
    public double Area() {
        return (Math.PI * Math.pow(this.Radius,2.0));
    }

    public double Perimeter () {
        return (2 * Math.PI * this.Radius);
    }
}

class Rectangle implements Prototypes {
    float Length;
    float Breadth;

    Rectangle (float length ,float breadth) {
        this.Length = length;
        this.Breadth = breadth;
    }

    public double Area() {
        return (this.Length * this.Breadth);
    }

    public double Perimeter() {
        return 2 * (this.Length * this.Breadth);
    }
}
public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("OPTIONS:\n1.For circle\n2.For Rectangle\n0.For Exit");
        do {
            System.out.println("Enter the options:");
            choice = scan.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the Radius of the Circle");
                    float radius = scan.nextFloat();
                    Circle cirObj = new Circle(radius);
                    System.out.println("Area of the given Circle: " + cirObj.Area());
                    System.out.println("Perimeter of the given Circle: " + cirObj.Perimeter());
                    break;
                }
                case 2:{
                    System.out.println("Enter the length and breadth:");
                    float length = scan.nextFloat();
                    float breadth = scan.nextFloat();
                    Rectangle rectObj =  new Rectangle( length,  breadth);
                    System.out.println("Area of the given Rectangle: " + rectObj.Area());
                    System.out.println("Perimeter of the given Rectangle: " + rectObj.Perimeter());
                    break;
                }
                case 0:{
                    System.out.println("Exiting");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice.......!");
                    break;
                }
            }
        }while(choice!=0);
    }
}
