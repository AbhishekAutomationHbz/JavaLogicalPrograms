package numbersProgramUdemy;

import java.util.Scanner;

public class _18_FibonacciUsingRecursion {

		public static int fibonacci(int n) {
			
			if(n==0 || n==1) {
				return n;
			}
			else {
				return (fibonacci(n-1)+fibonacci(n-2));
			}
		}
		public static void main(String[] args) {
				
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the range in which we want febonacci series");
			int range = scn.nextInt();
			
			for(int i=0; i<range; i++) {
				System.out.print(fibonacci(i)+" ");
			}
			
		}
		

}
