package string_programs;

import java.util.Arrays;
import java.util.Scanner;
// Java Program to determine whether two strings are the anagram
public class AnagramString_4 {
	public static void main(String[] args) {
		
		// An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
		// For example, “abcd” and “dabc” are an anagram of each other.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string 1 ");
		String s1 = scn.nextLine();
		System.out.print("Enter the string 2 ");
		String s2 = scn.nextLine();
		
		//Convert into lower case
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		//Verify the length first
		if(s1.length()!=s2.length()) {
			System.out.println("Both the strings are not Anagram");
		}
		else {
			
			//Convert the string into character array
			char[] string1 = s1.toCharArray();
			char[] string2 = s2.toCharArray();
			
			//Sorting the arrays using in-built function sort ()
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			//
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Both the strings are Anagram");
			}
			else {
				System.out.println("Both the strings are not Anagram");
			}
			
		}
		
		
		
	}
}
