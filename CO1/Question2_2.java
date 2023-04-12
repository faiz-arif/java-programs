// Matrix size is 3x3

import java.util.*;

class mat{
	int a[][];
	int b[][];
	int c[][];
}
public class Question2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mat m1=new mat();
		m1.a = new int[3][3];
		m1.b = new int[3][3];
		m1.c = new int[3][3];
		
		System.out.print("Enter the elements of first matrix : \n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m1.a[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Enter the elements of second matrix : \n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m1.b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Resulted matrix after matrix addition : \n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m1.c[i][j]=m1.a[i][j]+m1.b[i][j];
				System.out.print(m1.c[i][j]+" ");
			
			}System.out.println();
		}
	}
}
