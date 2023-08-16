package patterns;

import java.util.Scanner;

public class _1_RightTriangleOrHalfPyramidUsingDifferentNumber {

	public static void main(String[] args) {
		//print right triangle based on the number user enters
		//1 
		//1 2 
		//1 2 3 
		//1 2 3 4 
		//1 2 3 4 5 
		//1 2 3 4 5 6 
		Scanner scn = new Scanner(System.in);
		System.out.println("How Many Numbers");
		int num = scn.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
}
