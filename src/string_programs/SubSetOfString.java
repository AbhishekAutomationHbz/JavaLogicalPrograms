package string_programs;

import java.util.Scanner;

/*
In this program, all the subsets of the string need to be printed. 
The subset of a string is the character or the group of characters that are present inside the string.

All the possible subsets for a string will be n(n+1)/2.

For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
*/
public class SubSetOfString {

	public static void main(String[] args) {
		//funt
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string ");
		String str = scn.nextLine();
		
		int length = str.length();
		
		//Total possible subsets for string of size n is n*(n+1)/2  
		int subStr = length*(length+1)/2;
		System.out.println(subStr);
		
		String arrayOfCombination[] = new String[subStr];
		int temp=0;
		
		for(int i=0; i<length; i++) {
			//This loop adds the next character every iteration for the subset to form and add it to the array  
			for(int j=i; j<length; j++) {
				
				String combination = str.substring(i, j+1);
				arrayOfCombination[temp] =  combination;
				temp++;
				
			}
		}
		System.out.println("Subsets of the above strings are ");
		for(int i=0; i<arrayOfCombination.length; i++) {
			System.out.println(arrayOfCombination[i]);
		}
		
	}
	
}
