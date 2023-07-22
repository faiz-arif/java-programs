package Collectionframes;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Question17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String el;
		int key;
		int ch;
		do {
			System.out.println("enter choice\n 1:add\n 2:remove\n 3:display\n 4:search\n 5:change value\n 6:exist a value\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.next();
				key=sc.nextInt();
				map.put(el,key);
				break;
			case 2:System.out.println("enter element to remove:\n");
				el=sc.next();
				map.remove(el);
				break;
			case 3:System.out.println("hashmap:"+map);
				break;
			case 4:System.out.println("enter key to search:\n");
				el=sc.next();
				boolean containKey=map.containsKey(el);
				System.out.println("set contains"+el+"?"+containKey);
				break;
			case 5:System.out.println("enter key to change the value:\n");
				el=sc.next();
				System.out.println("enter value to change:\n");
				int val=sc.nextInt();
				map.put(el, val);
				System.out.println("after updating the value:"+map.get(el));
				break;
			case 6:System.out.println("enter value to search:\n");
				 key=sc.nextInt();
				boolean containsValue=map.containsValue(key);
				System.out.println("map contains"+key+"?"+containsValue);
			case 0:
				break;		
			}
		}while(ch!=0);}}