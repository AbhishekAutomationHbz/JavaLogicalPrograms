package numbersProgramUdemy;

import java.util.Scanner;

public class _5_SumOfDigits {

	public static void main(String[] args) {
		
		//In this program we are going to sum the each digit in the given number
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int sum=0, digit;
		
		while(num !=0) {
			
			digit = num%10;
			sum = sum +digit;
			num = num/10;
			
		}
		System.out.println("Sum of each digit in the entered number "+sum);
		
	}
	
}
