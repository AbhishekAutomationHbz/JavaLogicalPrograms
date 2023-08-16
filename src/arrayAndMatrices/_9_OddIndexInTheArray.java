package arrayAndMatrices;

import java.util.Scanner;

public class _9_OddIndexInTheArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of any array");
		int num = scn.nextInt();
		
		int arr[] = new int[num];
		//Take the input from the user and store in the array
		System.out.println("Scan the users input and store in the array.");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
			
			
		}
		
	}
	
}
