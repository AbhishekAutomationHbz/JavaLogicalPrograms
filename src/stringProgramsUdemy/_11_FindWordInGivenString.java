package stringProgramsUdemy;

import java.util.Scanner;

public class _11_FindWordInGivenString {

	/*
	 * find the word in the given sentence for eg : - find gold in the sentence
	 * "gold is so expensive"
	 */
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str1 = scn.nextLine();
		
		String word = "gold";
		str1 = str1.toLowerCase();
		Boolean found=false;
		
		for(int i=0; i<str1.length(); i++) {
			int k=i, j=0;
			
			for(j=0; j<word.length(); j++) {
				
				if(str1.charAt(k)!= word.charAt(j)) {
					break;
				}
				k++;
			}
			if(j==word.length()) {
				found=true;
				break;
			}		
			
		}
		if(found) {
			System.out.println(word + " is present inside");
		}
		else {
			System.out.println(word + " is NOT present inside");
		}
		 
		
		
	}
	
}
