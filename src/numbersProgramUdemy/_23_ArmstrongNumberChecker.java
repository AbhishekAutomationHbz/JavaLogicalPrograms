package numbersProgramUdemy;

import java.util.Scanner;

public class _23_ArmstrongNumberChecker {

	public static void main(String[] args) {
		
		//Armstrong number - if each digit cube addition is equals to original number then it is an armstrong number.
		// for eg : - 1, 153, 370, 371 etc
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		int originalNum = num, sum=0, digit;
		
		while(num!=0) {
			digit = num%10;
			sum = sum + (digit*digit*digit);
			num=num/10;
		}
		
		if(sum==originalNum) {
			System.out.println("number is an armstrong number");
		}
		else {
			System.out.println("Number is not an armstrong number");
		}
		
	}
	
}
