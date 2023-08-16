package stringProgramsUdemy;

import java.util.Arrays;
import java.util.Scanner;

public class _17_CheckStringOrder {

	public static void main(String[] args) {
		
		//We are going to check the order as part of this program
		// For eg - if input is -- abcdefghif -- This is in correct order.
		// if input is in dhdrwerewd -- Here characters are not in correct order.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = scn.nextLine();
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		
		if(new String(charArray).equals(str)) {
			System.out.println("Entered string are in correct order");
		}
		else {
			System.out.println("Not in correct Order");
		}
		
	}
	
}
