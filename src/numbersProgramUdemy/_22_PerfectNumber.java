package numbersProgramUdemy;

import java.util.Scanner;

public class _22_PerfectNumber {

	public static void main(String[] args) {
		
		//Perfect Number - If numbers multiples addition other than the number itself is equals to the number the it is called
		//as perfect Number.
		
		//for eg : - 6 = 1+2+3
		//			28 = 1+2+4+7+14
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		
		System.out.println(perfectNumberChecker(num)==num ? "Number is a Perfect Number"  : "Not a perfect number");
		
	}
	
	public static int perfectNumberChecker(int num) {
		
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum +=i;
			}
		}
		return sum;
	}
	
}
