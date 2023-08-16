package patterns;

import java.util.Scanner;

public class _6_MirroredRightTriangle {
//        9
//       89
//      789
//     6789
//    56789
//   456789
//  3456789
// 23456789
//123456789

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("How Many Numbers");
		int num = scn.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=num; j++) {
				
				if(j<=num-i) {
					System.out.print(" ");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}
	
}
