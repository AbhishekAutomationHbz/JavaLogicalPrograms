package stringProgramsUdemy;

import java.util.Scanner;

public class _7_StringEndsComparisonUsingResuableMethds {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1 = scn.nextLine();
		System.out.println("Enter second string ");
		String s2 = scn.nextLine();
		
		if(s1.endsWith(s2)) {
			System.out.println("String s1 ends with s2");
		}
		else {
			System.out.println("String s1 NOT ends with s2");
		}
		
	}
	
}
