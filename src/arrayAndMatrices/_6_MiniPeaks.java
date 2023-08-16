package arrayAndMatrices;

import java.util.Scanner;

public class _6_MiniPeaks {

	public static void main(String[] args) {
		
		// In the program we are going to find out the number which is greater than its before and next number in the array
		// for eg - 2 4 7 5 1 ==> here 7 is the greatest from 4 and 5 thats why it is a mini peak.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num = scn.nextInt();
		
		int a[] =  new int[num];
		
		//Store the element in the array
		System.out.println("Enter the elements for the array.");
		for(int i=0; i<num; i++) {
			a[i]=scn.nextInt();
		}
		
		for(int i=1; i<a.length-1; i++) {
			
			if(a[i]>a[i-1] && a[i]>a[i+1]) {
				System.out.println(a[i]+" is the mini peak");
			}
			
		}
		
	}
	
}
