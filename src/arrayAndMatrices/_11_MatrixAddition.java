package arrayAndMatrices;

import java.util.Scanner;

public class _11_MatrixAddition {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scn.nextInt();
		System.out.println("Enter the number of columns");
		int n = scn.nextInt();
		
		int arr1[][] = new int[m][n];
		int arr2[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.println("Enter the matrix1");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j]=scn.nextInt();
			}
		}
		System.out.println("Enter the matrix 2");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j]=scn.nextInt();
			}
		}
		System.out.println("Addition of Matrix 1 and Matrix 2 is :");
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Final Matrix is :");
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				sum[i][j] = arr1[i][j] + arr2[i][j];
				
			}
		}
		
	
	}
	
}
