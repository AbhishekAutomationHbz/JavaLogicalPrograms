package numbersProgramUdemy;

import java.util.Scanner;

public class _8_SumOfMultipleOf3 {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int multipleOf3Sum=0, digit;
		
		
		while(num!=0) {
			
			digit = num%10;
			if(digit%3==0) {
				multipleOf3Sum = multipleOf3Sum + digit;
			}
			num=num/10;
			
		}
		
		System.out.println("Summation of multiple of 3 "+multipleOf3Sum);
		scn.close();
	}
}
