package stringProgramsUdemy;

import java.util.Scanner;

public class _3_PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scn = new Scanner(System.in);
		String input = scn.next();
		
		String palindrome = "";
		for(int i=input.length()-1; i>=0; i--) {
			
			palindrome = palindrome+input.charAt(i);
			
		}
		if(palindrome.equals(input)) {
			System.out.println("Entered String is palindrome");
		}
		else
			System.out.println("Entered String is not palindrome");
		
		
	}
	
}
