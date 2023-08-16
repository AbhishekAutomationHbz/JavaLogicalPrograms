package patterns;

import java.util.Scanner;

public class _7_MirrorRightTriangleReversed {
	
	public static void main(String[] args) {
		
		/*
		123456789
		 23456789
		  3456789
		   456789
		    56789
		     6789
		      789
		       89
		        9
		        */
		Scanner scn = new Scanner(System.in);
		System.out.println("How Many Numbers");
		int num = scn.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=num; j++) {
				
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}
	
}
