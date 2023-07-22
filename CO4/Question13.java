package Collectionframes;
import java.util.*;
import java.util.Scanner;
public class Question13 {
	public static void main(String[] args) {
		PriorityQueue<String>q=new PriorityQueue<String>();
		Scanner sc=new Scanner(System.in);
		String el;
		int ch;
		do {
			System.out.println("enter choice\n 1:add\n 2:remove\n 3:display\n 4:head\n 5:poll\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.next();
				q.add(el);
				break;
			case 2:System.out.println("enter element to remove:\n");
				el=sc.next();
				q.remove(el);
				break;
			case 3:System.out.println("priority queue:"+q);
				break;
			case 4:System.out.println("head of the queue:"+q.peek());
				break;
			case 5:q.poll();
				break;
			case 0:break;	
			}
		}while(ch!=0);}}
