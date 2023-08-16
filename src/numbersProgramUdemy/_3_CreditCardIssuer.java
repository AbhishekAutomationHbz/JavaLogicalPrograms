package numbersProgramUdemy;

import java.util.Scanner;

public class _3_CreditCardIssuer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the credit score");
		int creditScore = scn.nextInt();
		
		if(creditScore <400 || creditScore>850) {
			
			System.out.println("Invalid Credit Score");
			
		}
		else {
			
			if(creditScore >=400 && creditScore < 600) {
				System.out.println("Silver Card");
			}
			else if( creditScore >=600 && creditScore <800) {
				System.out.println("Gold Card");
			}
			else if(creditScore >=800 && creditScore < 850) {
				System.out.println("Platinum Card");
			}
			
		}
		scn.close();
	}

}
