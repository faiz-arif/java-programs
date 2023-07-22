package Collectionframes;
import java.util.*;
import java.util.Scanner;
public class Question10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String el;
		int ch;
		do {
			System.out.println("enter choice\n 1:add\n 2:size\n 3:search by index\n 4:find index\n 5:remove\n 6:remove by index \n 8:display\n 9:cleae\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.next();
				list.add(el);
				break;
				
			case 2:System.out.println("size of the arraylist:"+list.size());
			   break;
			case 3:System.out.println("enter index of element to search:");
				int index=sc.nextInt();
				System.out.println("element at index"+index +"is"+list.get(index));
				break;
			case 4:System.out.println("enter the element\n");
				el=sc.next();
				 index=list.indexOf(el);
				System.out.println("index of "+el+"is"+index);
                break;
			case 5:System.out.println("enter the element\n");
				el=sc.next();
				boolean contains=list.contains(el);
				System.out.println("contains "+el+"?"+contains);
				break;
			case 6:System.out.println("enter the element to remove:\n");
				 el=sc.next();
				 boolean removed=list.remove(el);
				 System.out.println("after removing"+el+ "arraylist:"+removed);
					break;
			case 7:System.out.println("enter the index to remove the element:\n");
				 index=sc.nextInt();
				 list.remove(index);
				 System.out.println("after removing the element,arraylist:"+list);
				 break;
			case 8:System.out.println("arraylist:"+list);
				break;
			case 9:list.clear();
				break;	
			case 0:
				break;		
			}
		}while(ch!=0);}}