package numbersProgramUdemy;

import java.util.Scanner;

public class _1_EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mod(%) gives remainder and / given quotient
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		if(num<=0) {
			System.out.println("Invalid Number");
			//In the real time we should throw the exception
			//throw new IllegalArgumentException("Invalid Number "+num);
		}
		else {
			if(num%2==0) {
				System.out.println("Even number");
			}
			else {
				System.out.println("Odd number");
			}
		}

	}

}
