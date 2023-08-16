package arrayAndMatrices;

import java.util.Scanner;

public class _12_PrintDiagonalElementInMetrics {

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
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.println(arr[i][j]);
				}
				
				
			}
		}
		
	}
	
}
