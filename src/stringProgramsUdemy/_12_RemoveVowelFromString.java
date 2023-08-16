package stringProgramsUdemy;

import java.util.Scanner;

public class _12_RemoveVowelFromString {
	//Two ways we can solve this problem. 1. Using the normal logic. 2 Using the predefined methods and regular expression.
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		
		//Using Regular Expression
		System.out.println(str.replaceAll("[aeiou]", ""));
		
		StringBuffer output = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' ||
					str.charAt(i)=='e' ||
					str.charAt(i)=='i' ||
					str.charAt(i)=='o' ||
					str.charAt(i)=='u') {				
			}
			else {
				output.append(str.charAt(i));
			}
			
		}
		System.out.println(output);
		
	}


}
