package CO4;
import java.util.*;

class Fibonacci implements Runnable{
    public void run(){
        System.out.println("First 10 fibonacci numbers: ");
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1);
        System.out.println(n2);

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}

class EvenNum implements Runnable{
    int start, end;

    public EvenNum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run(){
        System.out.println("Even numbers from "+start+" to "+end+":");
        for (int i = start; i<= end; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range of even numbers ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range of even numbers ");
        int end = sc.nextInt();
        EvenNum even = new EvenNum(start,end);
        Fibonacci fib = new Fibonacci();
        fib.run();
        even.run();
    }
}
