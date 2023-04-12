//CO2 1st program

package co2;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        String [] str = new String[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        String [] str1 = new String[n];
        for(int i=0; i<n; i++){
            str1[i] = str[i];
        }
        Arrays.sort(str1);
        System.out.println("Array Before Sorting:-");
        for(int i=0; i<n; i++){
            System.out.print(str[i]+"\t");
        }
        System.out.println();
        System.out.println("Array After Sorting:-");
        for(int i=0; i<n; i++){
            System.out.print(str1[i]+"\t");
        }
    }
}