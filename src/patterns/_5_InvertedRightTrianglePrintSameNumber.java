package patterns;

import java.util.Scanner;

public class _5_InvertedRightTrianglePrintSameNumber {

	public static void main(String[] args) {
		
		//6 6 6 6 6 6 
		//5 5 5 5 5 
		//4 4 4 4 
		//3 3 3 
		//2 2 
		//1
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		for(int i=num; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		
	}
	
}
