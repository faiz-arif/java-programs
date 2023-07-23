package CO4;
import java.util.*;
import java.util.Scanner;
public class Question15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>set=new LinkedHashSet<String>();
		Scanner sc=new Scanner(System.in);
		String el;
		int ch;
		do {
			System.out.println("enter choice\n 1:add\n 2:remove\n 3:display\n 4:searcch\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.next();
				set.add(el);
				break;
			case 2:System.out.println("enter element to remove:\n");
				el=sc.next();
				set.remove(el);
				break;
			case 3:System.out.println("linked Hashset:"+set);
				break;
			case 4:System.out.println("enter element to search:\n");
				el=sc.next();
				boolean contain=set.contains(el);
				System.out.println("set contains"+el+"?"+contain);
				break;
			case 0:break;		
			}
		}while(ch!=0);}}