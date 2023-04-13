package CO3;
import java.util.Scanner;

interface ShapeInterface
{
  float area();
  float perimeter();
}

class Circle implements ShapeInterface
{
  float r;
  public Circle(float r)
  {
    this.r = r;
  }
  public float area()
  {
    return 3.14f*r*r;
  }
  public float perimeter()
  {
    return 2*3.14f*r;
  }
}

class Rectangle implements ShapeInterface
{
  float l, b;
  public Rectangle(float l, float b)
  {
    this.l = l;
    this.b = b;
  }

  public float area()
  {
    return l * b;
  }

  public float perimeter()
  {
    return 2*(l+b);
  }
}

public class Question6
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int choice;
    float result;

    do {
      System.out.println("Select a shape:\n1. Circle\n2. Rectangle\n3. Exit");

      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter radius:");
          Circle circle = new Circle(sc.nextFloat());
          System.out.println("Area: " + circle.area());
          System.out.println("Perimeter: " + circle.perimeter());
          break;
        case 2:
          System.out.println("Enter length and width:");
          Rectangle rectangle = new Rectangle(sc.nextFloat(), sc.nextFloat());
          System.out.println("Area: " + rectangle.area());
          System.out.println("Perimeter: " + rectangle.perimeter());
          break;
        case 3:
          System.out.println("Exiting program.");
          break;
        default:
          System.out.println("Invalid choice. Try again.");
          break;
      }
    } while (choice != 3);
  }
}