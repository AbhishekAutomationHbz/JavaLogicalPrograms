package stringProgramsUdemy;

import java.util.Scanner;

public class _14_DuplicateCharGenerator {

	public static void main(String[] args) {
		
		//for eg :-
		/*
		 * input - abcd 
		 * output - aabbccdd
		 */
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = scn.nextLine();
		
		StringBuffer output = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			
			output.append(str.charAt(i));
			output.append(str.charAt(i));
		}
		System.out.println(output);
	}
	
}
