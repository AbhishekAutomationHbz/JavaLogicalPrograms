package numbersProgramUdemy;

import java.util.Scanner;

public class _12_ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int rev=0,digit;
		
		while (num!=0) {
			
			digit = num%10;
			rev = rev*10+digit;
			num=num/10;
			
		}
		System.out.println("Reverse of the given number "+rev);
		
		
		
		
	}
	
}
