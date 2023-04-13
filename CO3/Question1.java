package CO3;
import java.util.*;

class operator {
    int area (int side ){
        return side * side ;
    }
    double area (float radius){
        return 3.14 * radius * radius ;
    }
    int area ( int length , int breadth){
        return length * breadth;
    }
}

 class Question1 {
    public static void main(String[] args) {
        operator object = new operator();
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("OPTIONS:\n1.Area of circle(use float number)\n2.Area of square\n3.Area of Rectangle\n0.Exit");
        do{
            System.out.println("Enter the choice:");
            choice = scan.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter the radius of the cirlce:");
                    float radius = scan.nextFloat();
                    System.out.println("Area of circle: " + object.area(radius));
                    break;
                }
                case 2:{
                    System.out.println("Enter the side of the square:");
                    int side = scan.nextInt();
                    System.out.println("Area of square: " + object.area(side));
                    break;
                }
                case 3:{
                    System.out.println("Enter the length and breadth of the Rectangle:");
                    int length = scan.nextInt();
                    int breadth = scan.nextInt();
                    System.out.println("Area of Rectangle: " + object.area(length,breadth));
                    break;
                }
            }
        }while(choice!=0);
    }
}
