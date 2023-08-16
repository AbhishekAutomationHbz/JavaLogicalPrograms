package patterns;

import java.util.Scanner;

public class _3_RightTriangleReverseNumber {

	public static void main(String[] args) {
		
		//1 
		//2 1 
		//3 2 1 
		//4 3 2 1 
		//5 4 3 2 1 
		//6 5 4 3 2 1 
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
}
