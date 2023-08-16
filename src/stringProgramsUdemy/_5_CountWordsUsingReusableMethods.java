package stringProgramsUdemy;

import java.util.Scanner;

public class _5_CountWordsUsingReusableMethods {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(str.split(" ").length);
		
	}
	
}
