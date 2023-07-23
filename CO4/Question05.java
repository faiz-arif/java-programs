package CO4;
import java.util.*;
import java.lang.Math;
class Multiplicationtable extends Thread{
	int n;
	Scanner sc=new Scanner(System.in);
	Multiplicationtable(int n){
		this.n=n;
	}
	public void run(){
		for(int i=0;i<n;i++){
			System.out.printf("%d*%d=%d\n",i,5,i*5);
		}
}
}
class Primenumbers extends Thread{
	int number;
	Primenumbers(int number){
		this.number=number;
	}
	public void run(){
		int i,j,flag;
		for(i=1;i<=number;i++){
if(i==1||i==0)
					continue;
				flag=1;
				for(j=2;j<= i/2 ;++j){
				if (i%j==0){
					flag=0;
					break;
}
				
			}
			if(flag==1){
				System.out.println(i);
			}
		}
	
	}
}
public class Question05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of table entries of 5");
		int n=sc.nextInt();
		System.out.println("enter the number of prime numbers");
		int number=sc.nextInt();
		Multiplicationtable mult=new Multiplicationtable(n);
		mult.start();
		sc.close();
		Primenumbers prime=new Primenumbers(number);
		prime.start();
		sc.close();
	}}
