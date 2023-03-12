// Matrix's array size is user input 

import java.util.*;

class matrix {
	int[][] sum(int [][] array1 , int [][] array2 , int n){
		int array3[][] = new int[n][n];
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return array3;
	}
	 void display(int [][] myarray, int n){
		 System.out.println("SUM of the martix :");
		 for(int i = 0; i<n ;i++) {
			 for(int j = 0; j < n; j++) {
				 System.out.print(myarray[i][j]+"\t");
			 }
			 System.out.println();
		 }
	 }
}
public class Question2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array1[][] = null;
		
		System.out.println("Enter the size of the N*N matrix :");
		int n = scan.nextInt();
		array1 = new int[n][n];
		
		System.out.println("Enter the first array :");
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				array1[i][j] = scan.nextInt();
			}
		}
		
		int array2[][] = null;
		array2 = new int[n][n];
		
		System.out.println("Enter the second array :");
		for(int i = 0; i<n ;i++) {
			for(int j = 0; j < n; j++) {
				array2[i][j] = scan.nextInt();
			}
		}

		matrix obj =new matrix();
		int array3[][] = obj.sum(array1,array2,n);
		obj.display(array3,n);
	}

}