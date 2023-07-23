package CO4;
import java.util.*;
public class Question08 {
	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		int ch;
		String el;
				do {
			System.out.println("enter choice\n 1:push\n 2:pop\n 3:display\n  0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.next();
				stack.push(el);
				break;
			case 2:String Poppedelement=stack.pop();
				System.out.println("popped element:\n"+Poppedelement);
				break;
			case 3:
				System.out.println("stack:"+stack);
				break;
			case 0:
				break;	
			}
		}while(ch!=0);
	}
}
