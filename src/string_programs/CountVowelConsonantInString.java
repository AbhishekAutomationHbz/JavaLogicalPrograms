package string_programs;

import java.util.Scanner;

public class CountVowelConsonantInString {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = scn.nextLine();
		str = str.toLowerCase();
		int vowelCount=0;
		int consonantsCount=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowelCount++;
			}
			else if(str.charAt(i) >='a' && str.charAt(i)<='z') {
				consonantsCount++;
			}
			
		}
		System.out.println("Vowel count in the string is "+vowelCount);
		System.out.println("Consonents count in the string is "+consonantsCount);
		
	}
	
}
