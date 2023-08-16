package stringProgramsUdemy;

import java.util.Scanner;

public class _2_ReverseStringUsingInBuiltMethod {

	
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scn = new Scanner(System.in);
		String input = scn.next();//for taking the string input we can take either nextLine() or nextInt() thats why we are taking only next()
		String output="";
		
		System.out.println(new StringBuffer(input).reverse());
	}
	
	
}
