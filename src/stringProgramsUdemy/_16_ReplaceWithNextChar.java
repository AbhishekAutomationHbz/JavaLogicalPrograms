package stringProgramsUdemy;

import java.util.Scanner;

public class _16_ReplaceWithNextChar {

	public static void main(String[] args) {
		
		//for input - password - then output will be next character of each character
		// output -   qbttxpse
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = scn.nextLine();
		String output="";
		
		for(int i=0; i<str.length(); i++) {
			
			output = output + (char)(str.charAt(i)+1);
			
		}
		System.out.println(output);
		scn.close();
		
	}
	
}
