package stringProgramsUdemy;

import java.util.Scanner;

public class _10_FindMaxOccuranceOfChar {
	
	/*
	 * for eg: - abcd efh ilsdfsjfjkdjf here we are going to find the character
	 * which occurs maximum number of time. We are going to find that using ASCII of
	 * the chars ASCII of some chars are as below a = 97, b = 98 etc
	 */
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		
		int arr[] = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			
			arr[(int)str.charAt(i)]++;
			
		}
		int m=0;
		for(int j=1; j<arr.length; j++) {
			
			if(arr[j]>arr[m]) {
				m=j;
			}
			
		}
		System.out.println("Maximum occuring character is "+(char)m);
		
	}
}
