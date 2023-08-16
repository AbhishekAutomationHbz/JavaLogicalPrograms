package numbersProgramUdemy;

import java.util.Scanner;

public class _4_DigitExtractor {

	public static void main(String[] args) {
		//In this program we will be extracting each digit from the given number
		// for eg - input -- 45623421 --
		// output
		/*
		 * 1 2 4 3 2 6 5 4
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int digit;
		
		while(num !=0) {
			
			digit = num%10;
			System.out.println(digit);
			num = num/10;
			
		}
		
	}
	
}
