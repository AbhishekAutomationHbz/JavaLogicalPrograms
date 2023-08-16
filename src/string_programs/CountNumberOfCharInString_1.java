package string_programs;

import java.util.Scanner;

/*Algorithm:
	
	Step 1 : START
	Step 2 : DEFINE String string =  "Hello Java world"
	Step 3 : Set count = 0
	Step 4 : Set i = 0 and REPEAT Step 5 to Step 6 until i< string.length()
	Step 5 : IF(string.charAt(i)!=' ') then count = count + 1
	Step 6 : i = i+1
	Step 7 : PRINT count
	Step 8 : END
*/

public class CountNumberOfCharInString_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String str = sc.nextLine();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				count = count+1;
			}
			
		}
		System.out.println("Total Number of character present in the above string is "+count);
		
	}

}
