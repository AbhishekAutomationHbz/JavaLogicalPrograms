package arrayAndMatrices;

import java.util.Scanner;

public class _13_SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int count=0;
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(arr[i][j]==0) {
					count++;
				}
				
			}
			
		}
		if(count>(m*n)/2) {
			System.out.println("Entered Matrix is Sparse Matrix");
		}
		else {
			System.out.println("Not a sparse matrix");
		}

	}

}
