package numbersProgramUdemy;

import java.util.Scanner;

public class _13_Palindrome {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int rev=0,digit;
		int originalNum = num;
		
		while(num!=0) {
			digit = num%10;
			rev = rev*10+digit;
			num=num/10;
		}
		if(originalNum == rev) {
			
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
	}
	
}
