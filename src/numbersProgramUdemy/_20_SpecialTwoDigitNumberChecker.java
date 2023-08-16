package numbersProgramUdemy;

import java.util.Scanner;

public class _20_SpecialTwoDigitNumberChecker {

	
	public static void main(String[] args) {
		
		//Special Number for two digit - if sum of the digit + muliplication of digit equals to original number then it is special
		//eg - 29, 59
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		int digit1, digit2, result = 0;
		
		digit1 = num%10;
		digit2 = num/10;
		result = (digit1+digit2) + (digit1*digit2);
		
		System.out.println(result == num ? "Special Number" : "Not a special number");
		
	}
}
