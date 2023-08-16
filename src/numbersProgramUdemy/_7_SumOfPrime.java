package numbersProgramUdemy;

import java.util.Scanner;

public class _7_SumOfPrime {

	public static void main(String[] args) {
		
		// In this program we are going to sum only prime digit in the given number
		// for eg - input - 35782  here prime digit are - 3,5,7,2
		// In 1 to 9 prime digits are  - 2,3,5,7
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int primeDigitSum=0, digit;
		
		while(num!=0) {
			
			digit = num%10;
			if(digit == 2 || digit == 3 || digit == 5 || digit ==7) {
				
				primeDigitSum = primeDigitSum + digit;
				
			}
			num = num/10;
			
		}
		System.out.println("Sum of the prime number in the string is "+primeDigitSum);
		
	}
	
}
