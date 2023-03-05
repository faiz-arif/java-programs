package faiz;
import java.util.*;
class product{
	int pcode;
	String pname;
	int price;
}
public class one {

	public static void main(String[] args) {

		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product code of the first object");
		obj1.pcode = sc.nextInt();
		System.out.println("enter the product name");
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
			System.out.println(obj1.price +"  is the lowets");
		}
		else if(obj2.price < obj1.price && obj2.price < obj3.price)
		{
			System.out.println(obj2.price +" is the lowest value");
		}
		else
		{
			System.out.println(obj3.price +" is the lowest value");
		}
	}

}