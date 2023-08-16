package arrayAndMatrices;

import java.util.Scanner;

public class _1_ArrayFromUserInput {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = scn.nextInt();
		
		int a[] = new int[num];
		
		System.out.println("Enter the elements for the array.");
		//Stores the values in the array
		for(int i=0; i<num; i++) {
			
			a[i] = scn.nextInt();
			
		}
		//Print the values from the array.
		System.out.println("Printing the values from the array.");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
	
}
