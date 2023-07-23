package CO4;
import java.util.*;
public class Question11 {
	public static void main(String[] args) {
		LinkedList<Integer>li=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int ch,el;
		do {
			System.out.println("enter choice\n 1:add\n 2:remove\n 3:display\n 4:clear\n 0:wrong choice\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("enter element to insert:\n");
				el=sc.nextInt();
				li.add(el);
				break;
			case 2:System.out.println("enter element to remove:\n");
				el=sc.nextInt();
				li.remove(el);
				break;
			
			case 3:System.out.println("linked list:"+li);
				break;
			case 4:li.clear();
				break;
			case 0:break;	
			}
		}while(ch!=0);
	}
	}
