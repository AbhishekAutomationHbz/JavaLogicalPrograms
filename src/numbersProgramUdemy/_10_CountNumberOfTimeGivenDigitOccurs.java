package numbersProgramUdemy;

import java.util.Scanner;

public class _10_CountNumberOfTimeGivenDigitOccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count number of time given digits occurs for eg ... 3452344322   - here 2 occurs 3 times.
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		int count=0, digit;
		int reqDigit = scn.nextInt();
		
		while(num!=0) {
			
			digit = num%10;
			if(digit == reqDigit) {
				count++;
			}
			num = num/10;
			
		}
		System.out.println("Number of times req digit appeared - "+count);
		
	}

}
