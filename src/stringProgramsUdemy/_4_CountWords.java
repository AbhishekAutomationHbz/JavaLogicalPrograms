package stringProgramsUdemy;

import java.util.Scanner;

public class _4_CountWords {

	//Count words in the given string/sentence.
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		int wordCount=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isWhitespace(str.charAt(i))) {
				
				wordCount++;
				
			}
			
		}
		//In the below statement we have given as wordCount+1 because after the last whitespace last word wont be counted
		System.out.println("number of word in the given string is "+(wordCount+1));
		
	}
	
}
