package CO4;
import java.util.*;
import C04.Arithmetic.Addition;
import C04.Arithmetic.Division;
import C04.Arithmetic.Subtraction;
import C04.Arithmetic.Multiplication;


public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        System.out.println("Enter two numbers to perform the Arithmetic operations: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        do{
            System.out.println("Enter the choice\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n0. Exit");
            c = sc.nextInt();
            switch(c){
                case 1: add.addition(a,b);
                    break;
                case 2: sub.subtraction(a,b);
                    break;
                case 3: mul.multiplication(a,b);
                    break;
                case 4: div.division(a,b);
                    break;
                case 0: System.out.println("Exiting...!!!");
                    break;
            }
        }while(c!=0);
    }
}

