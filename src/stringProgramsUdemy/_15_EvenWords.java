package stringProgramsUdemy;

import java.util.Scanner;

public class _15_EvenWords {

	public static void main(String[] args) {
		//Here we are going to print the words which length are even from the given string.
		//Eg : - My world is beautiful india ->output - My is
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = scn.nextLine();
		
		String[] words = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			if(words[i].length()%2==0) {
				System.out.println(words[i]);
			}
			
		}
		
		
	}
	
}
