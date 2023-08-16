package stringProgramsUdemy;

import java.util.Scanner;

public class _18_FindingDuplicateConsecutiveChars {

	public static void main(String[] args) {
		
		//If string contains the same character consecutive - for eg - abccdefgh -- here c is repeating again.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scn.nextLine();
		
		boolean found = false;
		
		for(int i=0; i<input.length(); i++) {
			if(i != input.length()-1) {
				if(input.charAt(i) == input.charAt(i+1)) {
					
					found = true;
					break;
				}
			}
			
			
		}
		System.out.println(found);
		
		
		
	}
	
}
