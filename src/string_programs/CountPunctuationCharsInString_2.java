package string_programs;

import java.util.Scanner;

public class CountPunctuationCharsInString_2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string with punctuation chars :: ");
		String str = scn.nextLine();
		
		int count =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)==';' || str.charAt(i)=='.' || str.charAt(i)=='?') {
				count = count + 1;
			}
		}
		System.out.println("Total number of punctuation chars in the above string is :: "+count);
		
	}
	
}
