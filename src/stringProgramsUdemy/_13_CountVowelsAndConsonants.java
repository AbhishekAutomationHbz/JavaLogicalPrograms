package stringProgramsUdemy;

import java.util.Scanner;

public class _13_CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		
		str = str.toLowerCase();
		
		int vowelCount = 0, consonantsCount = 0;
		
		for(int i =0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowelCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				consonantsCount++;
			}
			
		}
		System.out.println("Number of Vowel count in the given string "+vowelCount);
		System.out.println("Number of Consonants count in the given string "+consonantsCount);
		
	}

}
