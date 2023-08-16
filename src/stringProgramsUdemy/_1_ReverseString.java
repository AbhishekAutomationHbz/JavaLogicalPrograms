package stringProgramsUdemy;

import java.util.Scanner;

public class _1_ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scn = new Scanner(System.in);
		String input = scn.next();//for taking the string input we can take either nextLine() or nextInt() thats why we are taking only next()
		String output="";
		
		for(int i=input.length()-1; i>=0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
	}
	
}
