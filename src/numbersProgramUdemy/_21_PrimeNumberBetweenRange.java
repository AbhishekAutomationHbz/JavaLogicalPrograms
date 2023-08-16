package numbersProgramUdemy;

import java.util.Scanner;

public class _21_PrimeNumberBetweenRange {

	public static void main(String[] args) {
		
		//Prime number - The number which is divisible by only 1 and itself is a prime number, It starts with 2.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the start and end number range");
		int start = scn.nextInt(), end = scn.nextInt();
		
		for(int i=start; i<=end; i++) {
			
			int count = 0;
			// Here can check till j<i but as per the mathematics rule we can check till i/2 which will do the same job as i.
			for(int j=2; j<i/2; j++) {
				
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			
			
		}
		
	}
	
}
