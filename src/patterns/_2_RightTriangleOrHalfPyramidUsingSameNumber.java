package patterns;

import java.util.Scanner;

public class _2_RightTriangleOrHalfPyramidUsingSameNumber {

	public static void main(String[] args) {
		
		//1 
		//2 2 
		//3 3 3 
		//4 4 4 4 
		//5 5 5 5 5 
		//6 6 6 6 6 6 
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
}
