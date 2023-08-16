package stringProgramsUdemy;

import java.util.Scanner;

public class _6_StringEndsComparison {

	public static void main(String[] args) {
		//Check if string ends with string. eg:-  powerful, ful  => here powerful ends with ful.
		//Here we are assuming that second string has less number of character.
		//eg : powerful is the first string and ful is the second string.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1 = scn.nextLine();
		System.out.println("Enter second string ");
		String s2 = scn.nextLine();
		
		
		int matchCount=0;
		for(int i=s1.length()-1, j=s2.length()-1; j>=0; i--, j--) {
			if(s1.charAt(i) == s2.charAt(j)) {
				matchCount++;
			}
			
		}
		if(matchCount==s2.length()) {
			System.out.println("String s1 ends with s2");
		}
		else {
			System.out.println("String s1 NOT ends with s2");
		}
		scn.close();

	}

}
