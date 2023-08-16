package stringProgramsUdemy;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scn1 = new Scanner(System.in);
		String str1 = scn1.nextLine();
		System.out.println("Enter the string 1");
		
		Scanner scn2 = new Scanner(System.in);
		String str2 = scn2.nextLine();
		System.out.println("Enter the string 2");
		
		int matchCount = 0;
		
		for(int i=str1.length()-1, j=str2.length()-1; j>=0; i--, j--) {
			
			if(str1.charAt(i) == str2.charAt(j)) {
				matchCount++;
			}
			
		}
		if(matchCount == str2.length()) {
			
			System.out.println("String 1 ends with String 2");
			
		}
		else {
			System.out.println("String 1 not ends with String 2");
		}
		
	}
}
