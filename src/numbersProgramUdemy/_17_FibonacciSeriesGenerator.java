package numbersProgramUdemy;

import java.util.Scanner;

public class _17_FibonacciSeriesGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci Series - first two numbers are always 0 and 1 and next number will be addition of the last two numbers.
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the range in which we want febonacci series");
		int range = scn.nextInt();
		int n1=0, n2=1, n3;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<range; i++) {
			
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			
		}
		
		
	}

}
