package Collectionframes;
import java.util.Scanner;
import java.util.Stack;
public class Question12 {
	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		int ch;
		String el;
		do {System.out.println("enter choice\n 1:push\n 2:pop\n 3:remove object using position\n 4:display\n   0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter element to insert:\n");
				el=sc.next();
				stack.push(el);
				break;
			case 2:
				String Poppedelement=stack.pop();
				System.out.println("popped element:\n"+Poppedelement);
				break;
			case 3:
				System.out.println("enter the position you wish to remove element:");
			    int index=sc.nextInt();
			    stack.remove(index);
			    break;
			case 4:
				System.out.println("stack:"+stack);
				break;
			case 0:
				break;	}
		}while(ch!=0);}}