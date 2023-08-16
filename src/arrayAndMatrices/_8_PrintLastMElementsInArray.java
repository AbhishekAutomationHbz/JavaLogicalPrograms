package arrayAndMatrices;

import java.util.Scanner;

public class _8_PrintLastMElementsInArray {

	public static void main(String[] args) {
		//in this program we are going to print the last digit from the given array, if array has [2,4,6,2,6,7,1] and we
		//want to print the last 3 digit which is 6, 7,1
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of any array");
		int num = scn.nextInt();
		
		int arr[] = new int[num];
		//Take the input from the user and store in the array
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int lastDigits;
		System.out.println("Please enter the number of last digit which user want to print");
		lastDigits = scn.nextInt();
		
		for(int i=num-lastDigits; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		
		
		
	}
	
}
