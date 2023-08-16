package numbersProgramUdemy;

import java.util.Scanner;

public final class _11_DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Duck Number - A number which has 0 anywhere is called as duck number for eg - 793043, 005234, 2340
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		int digit;
		boolean duckFound = false;
		
		while(num!=0) {
			
			digit = num%10;
			
			if(digit == 0) {
				duckFound = true;
				break;
				
			}
			num=num/10;
		}
		if(duckFound) {
			System.out.println("Entered number is duck number");
		}
		else {
			System.out.println("Entered number is not a duck number");
		}
		
	}

}
