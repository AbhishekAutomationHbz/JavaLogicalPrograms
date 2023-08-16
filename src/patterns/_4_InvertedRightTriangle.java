package patterns;

import java.util.Scanner;

public class _4_InvertedRightTriangle {

	public static void main(String[] args) {
		
		//1 2 3 4 5 6 
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3 
		//1 2 
		//1
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		for(int i=num; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}
	
}
