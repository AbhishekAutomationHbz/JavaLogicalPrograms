package arrayAndMatrices;

import java.util.Scanner;

public class _3_SumOfPositiveAndNegative {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = scn.nextInt(), sumOfPositive = 0, sumOfNegative=0;
		
		int a[] =  new int[num];
		
		//Store the element in the array
		System.out.println("Enter the elements for the array.");
		for(int i=0; i<num; i++) {
			a[i]=scn.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>0 && a[i]!=0) {
				sumOfPositive += a[i];
			}
			else if(a[i]<0 && a[i]!=0) {
				sumOfNegative += a[i];
			}
			
		}
		System.out.println("Sum of positive number from the array is "+sumOfPositive);
		System.out.println("Sum of negative number from the array is "+sumOfNegative);
		

	}

}
