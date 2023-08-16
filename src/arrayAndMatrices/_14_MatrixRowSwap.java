package arrayAndMatrices;

import java.util.Scanner;

public class _14_MatrixRowSwap {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scn.nextInt();
		System.out.println("Enter the number of columns");
		int n = scn.nextInt();
		
		int arr[][] = new int[m][n];
		System.out.println("Enter the matrix");
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				arr[i][j]=scn.nextInt();
				
			}
		}
		
		System.out.println("Matrix is ");
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		//Swapping logic
		System.out.println("Enter the rows to SWAP");
		int swapRow1 = scn.nextInt();
		int swapRow2 = scn.nextInt();
		int temp;
		
		for(int i=0; i<n; i++) {
			
			temp = arr[swapRow1-1][i];
			arr[swapRow1-1][i] = arr[swapRow2-1][i];
			arr[swapRow2-1][i] = temp;
			
		}
		
		System.out.println("Matrix after swap ");
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
}
