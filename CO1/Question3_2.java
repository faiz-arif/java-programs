import java.util.*;

class complex {
	int real;
	int img;
	
	void display() {
		System.out.println(this.real+" + "+this.img + "i");
	}
	
	void sum(complex n1,complex n2) {
		this.real = n1.real + n2.real;
		this.img = n1.img + n2.img;
	}
}
public class Question3_2 {

	public static void main(String[] args) {
		complex num1 =new complex();
		complex num2 =new complex();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first complex number: ");
		num1.real = scan.nextInt();
		System.out.print(" +i ");
		num1.img = scan.nextInt();
		
		num1.display();
		
		System.out.print("\nEnter the second complex number: ");
		num2.real = scan.nextInt();
		System.out.print(" +i ");
		num2.img = scan.nextInt();
		
		num2.display();
		
		complex num3 =new complex();
		num3.sum(num1,num2);
		
		System.out.println("\nSum of complex numbers:");
		
		num3.display();
		
	}

}