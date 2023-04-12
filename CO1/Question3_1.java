
import java.util.*;

class num{
int w;
int x;
int y;
int z;
}

public class Question3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		num no = new num();
		System.out.print("Enter the real part of first complex no:\n");
		no.x=sc.nextInt();
		System.out.print("Enter the img part of first complex no:\n");
		no.y=sc.nextInt();
		System.out.print("Enter the real part of second complex no:\n");
		no.w=sc.nextInt();
		System.out.print("Enter the img part of second complex no:\n");
		no.z=sc.nextInt();

		System.out.printf("First complex number  = %d + i %d\n",no.x,no.y);
		System.out.printf("Second complex number = %d + i%d\n",no.w,no.z);

		System.out.print("Complex number after addition = "+(no.x+no.w)+" + i"+(no.y+no.z));

	}

}

