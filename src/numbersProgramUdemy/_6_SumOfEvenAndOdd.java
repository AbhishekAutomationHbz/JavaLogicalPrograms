package numbersProgramUdemy;

import java.util.Scanner;

public class _6_SumOfEvenAndOdd {

	public static void main(String[] args) {
		
		//In this program we are going to do the addition of even and odd number in mentioned number
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int sumEven=0, sumOdd=0, digit;
		
		while(num!=0) {
			
			digit = num%10;
			if(digit%2==0) {
				sumEven = sumEven + digit;
			}
			else {
				sumOdd = sumOdd + digit;
			}
			num = num/10;
			
		}
		System.out.println("Even digit summation "+sumEven);
		System.out.println("Odd digit summation "+sumOdd);
		
	}
	
}
