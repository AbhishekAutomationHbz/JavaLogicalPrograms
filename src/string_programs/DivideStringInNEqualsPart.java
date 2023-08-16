package string_programs;

import java.util.Scanner;

//Java Program to divide a string in 'N' equal parts.
public class DivideStringInNEqualsPart {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string ");
		String s1 = scn.nextLine();
		
		System.out.print("Divide the string in number of equal part ");
		int n = scn.nextInt();
		int len = s1.length();
		int temp=0;
		//  /(division) gives quotient and %(Modulus) gives remainder
		int chars = len/n;
		
		//Stores the array of string
		String[] equalStr = new String[n];
		
		if(len%n != 0) {
			System.out.println("Sorry this string cannot be divisible into "+n+" equals part");
		}
		else {
			
			for(int i=0; i<len; i=i+chars) {
				//Dividing string in n equal parts using substring
				String part = s1.substring(i,i+chars);
				equalStr[temp] = part;
				temp++;
				
			}
			System.out.println(n +" equal part of given strings are ");
			for(int i=0; i< equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
		
		
		
	}
}
