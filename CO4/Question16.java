package Collectionframes;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
public class Question16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set1=new HashSet<String>();
		HashSet<String>set2=new HashSet<String>();
            	Scanner sc=new Scanner(System.in);
		String el;
		int ch;
		do {
			System.out.println("enter choice\n 1:add to set1\n 2:add to set2\n 3:display\n 4:compare\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to set1:\n");
				el=sc.next();
				set1.add(el);
				break;
			case 2:System.out.println("enter element to set2:\n");
				el=sc.next();
				set2.add(el);
				break;
			case 3:System.out.println("linked Hashset1:"+set1);
				System.out.println("linked Hashset2:"+set2);
				break;
			case 4:System.out.println("compare hashsets\n");
				boolean isEqual=set1.equals(set2);
				System.out.println("are the Hashsets are equal?"+isEqual);
				break;
			case 0:
				break;		
			}
		}while(ch!=0);
}
}
