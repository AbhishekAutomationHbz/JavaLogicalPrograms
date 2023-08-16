package numbersProgramUdemy;

import java.util.Scanner;

public class _19_NivenNumber {

	
	public static void main(String[] args) {
		
		//Niven Number - If we divide the given number with its digit sum and result is 0 then it is a Niven number.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		/*
		 * if(num%sumOfDigit(num)==0) {
		 * System.out.println("Entered number is the Niven number"); } else {
		 * System.out.println("Number is not a Niven number"); }
		 */
		System.out.println(num%sumOfDigit(num)==0 ? "Number is Niven number" : "Number is not niven number");
		
	}
	
	public static int sumOfDigit(int num) {
		int digit, sum=0;
		while(num!=0) {
			
			digit = num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		return sum;
		
	}
	
}
