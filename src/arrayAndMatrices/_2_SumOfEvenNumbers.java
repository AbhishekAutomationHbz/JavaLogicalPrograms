package arrayAndMatrices;

import java.util.Scanner;

public class _2_SumOfEvenNumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = scn.nextInt(), sumOfEven=0;
		
		int a[] = new int[num];
		System.out.println("Enter the elements for the array.");
		//Stores the values in the array
		for(int i=0; i<num; i++) {
			a[i] = scn.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				sumOfEven += a[i];
			}
			
		}
		System.out.println("Sum of even number in the given integer array is "+ sumOfEven);
		
		
	}
	
}
