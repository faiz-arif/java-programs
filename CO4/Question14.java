package Collectionframes;
import java.util.*;
import java.util.Scanner;
public class Question14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>dq=new ArrayDeque<String>();
		Scanner sc=new Scanner(System.in);
		String el;
		int ch;
		do {
			System.out.println("enter choice\n 1:add first\n 2:add last\n 3:delete first\n 4:delete last\n 5:display\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to add first:\n");
				el=sc.next();
				dq.addFirst(el);
				break;
			case 2:System.out.println("enter element to add last:\n");
				el=sc.next();
				dq.addLast(el);
				break;
			case 3:System.out.println("remove element from first");
				dq.removeFirst();
				System.out.println(" after removing first ,deque:"+dq);
				break;
			case 4:System.out.println("remove last element");
				dq.removeLast();
				System.out.println(" after removing last ,deque:"+dq);
				break;
			case 5:System.out.println("deque:"+dq);
				break;	
			case 0:break;	
			}
		}while(ch!=0);
	}
}
