package Collectionframes;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
public class Question18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String el;
		int key;
		int ch;
		do {
			System.out.println("enter choice\n 1:add to hashmap \n 2:display\n 3:covert to treemap\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.next();
				key=sc.nextInt();
				map.put(el,key);
				break;
			case 2:System.out.println("hashmap:"+map);
				break;
			case 3:System.out.println("convert hashmap to treemap" );
				TreeMap<String,Integer>treemap=new TreeMap<>(map);
				System.out.println("treemap:"+treemap );
				case 0:
				break;		
			}
		}while(ch!=0);
	}

}
