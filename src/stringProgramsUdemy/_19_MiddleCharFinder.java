package stringProgramsUdemy;

import java.util.Scanner;

public class _19_MiddleCharFinder {

	//In this program we are trying to find the middle character of the string
	// if string is dependant - output - en
	// testng  - output - st
	//speak - output - e
	
	//Points to remember(Difference between % and /)
	//The modulo operation (abbreviated “mod”, or “%” in many programming languages) is the remainder when dividing. For example, “5 mod 3 = 2” which means 2 is the remainder when you divide 5 by 3.
	//  So % gives remainder and / gives quotient.
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scn.nextLine();
		
		int length = input.length();
		
		if(length%2==0) {
			System.out.println(input.substring(length/2-1, length/2+1));
		}
		else {
			System.out.println(input.substring(length/2, length/2+1));
		}
		
	}
	
}
