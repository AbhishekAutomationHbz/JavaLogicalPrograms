package arrayAndMatrices;

import java.util.Scanner;

public class _4_ReverseElementInArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = scn.nextInt(), reverse=0;
		
		int a[] =  new int[num];
		
		//Store the element in the array
		System.out.println("Enter the elements for the array.");
		for(int i=0; i<num; i++) {
			a[i]=scn.nextInt();
		}
		
		for(int i=a.length-1; i>=0; i--) {
			
			System.out.print(a[i]+" ");
		}
		
	}
	
}
