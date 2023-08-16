package numbersProgramUdemy;

import java.util.Scanner;

public class _14_PalindromeAndReverseSecondWay {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		String number = scn.nextLine();
		
		StringBuffer sb = new StringBuffer(number);
		String reverseOfNumber = sb.reverse().toString();
		
		if(reverseOfNumber.equals(number)) {
			System.out.println("Enter number is palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
		
		
	}
	
}
