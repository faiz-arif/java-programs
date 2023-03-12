import java.util.*;
class product{
	int pcode;
	String pname;
	int price;
}
public class Question1 {

	public static void main(String[] args) {

		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product code of the first object");
		obj1.pcode = sc.nextInt();
		System.out.println("enter the first product name");
		obj1.pname = sc.next();
		System.out.println("enter the price of the first product");
		obj1.price = sc.nextInt();
		
		System.out.println("Enter the product code of the second product");
		obj2.pcode = sc.nextInt();
		System.out.println("Enter the name of second product");
		obj2.pname = sc.next();
		System.out.println("Enter the price of second product");
		obj2.price = sc.nextInt();
		
		System.out.println("Enter the product code of the third product");
		obj3.pcode = sc.nextInt();
		System.out.println("Enter the name of the third product");
		obj3.pname = sc.next();
		System.out.println("Enter the price of the third product");
		obj3.price = sc.nextInt();
		
		if(obj1.price < obj2.price && obj1.price < obj3.price)
		{
			System.out.println("Product code: "+obj1.pcode+", Product Name: "+obj1.pname+", Price: "+obj1.price +" has the lowest price.");
		}
		else if(obj2.price < obj1.price && obj2.price < obj3.price)
		{
			System.out.println("Product code: "+obj2.pcode+", Product Name: "+obj2.pname+", Price: "+obj2.price +" has the lowest price.");
		}
		else
		{
			System.out.println("Product code: "+obj3.pcode+", Product Name: "+obj3.pname+", Price: "+obj3.price +" has the lowest price.");
		}
	}
}