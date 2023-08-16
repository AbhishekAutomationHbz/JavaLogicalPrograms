package numbersProgramUdemy;

import java.util.Scanner;

public class _9_CountOfDigitInNumber {

	public static void main(String[] args) {
		
		//Count the number of digit in the given number
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int count=0, digit;
		
		while(num!=0) {
			
			count++;
			num = num/10;
			
			
		}
		System.out.println("Number of digit in the given number - "+count);
		scn.close();
		
		
	}
		
}
