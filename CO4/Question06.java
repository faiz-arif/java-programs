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

public class Question06 {
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


// package co4programs;
// import java.util.Scanner;
// class Fibonacci implements Runnable {
//     private int count;
//     public Fibonacci(int count) {
//         this.count = count;
//     }
//     @Override
//     public void run() {
//         int first = 0;
//         int second = 1;
//         System.out.println("Fibonacci Series:");
//         System.out.print(first + " " + second + " ");
//         for (int i = 2; i < count; i++) {
//             int next = first + second;
//             System.out.print(next + " ");
//             first = second;
//             second = next;
//         }
//         System.out.println();
//     }
// }
// class EvenNumber implements Runnable {
//     private int start;
//     private int end;
//     public EvenNumber(int start, int end) {
//         this.start = start;
//         this.end = end;
//     }
//     @Override
//     public void run() {
//         System.out.println("Even Numbers:");
//         for (int i = start; i <= end; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }
// }
// public class program6 {
//     public static void main(String[] args) {
//     	Scanner scanner = new Scanner(System.in);
//         System.out.println("how many numbers of fibonacci series (greater than two) : ");
//         int count = scanner.nextInt();
//         Fibonacci fibonacciGenerator = new Fibonacci(count);
//         Thread fibonacciThread = new Thread(fibonacciGenerator);
//         System.out.println("enter a starting number and an ending number :");
//         int start = scanner.nextInt();
//         int end = scanner.nextInt();
//         EvenNumber evenNumberPrinter = new EvenNumber(start,end);
//         Thread evenNumberThread = new Thread(evenNumberPrinter);
//         fibonacciThread.start();
//         scanner.close();
//         evenNumberThread.start();
//         scanner.close();
//     }
// }
