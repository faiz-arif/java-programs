package co2;
import java.util.*;

class Search{
    void search(int [] arr, int n, int item){
        int flag = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            count++;
            if(item == arr[i]) {
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Item is found at the position "+count);
        }
        else{
            System.out.println("The entered item is not found in the array!!");
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search obj = new Search();
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("Enter the element to search:");
        int item = sc.nextInt();
        obj.search(arr,n,item);
    }
}