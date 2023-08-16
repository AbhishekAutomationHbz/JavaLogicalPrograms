package searching;

import java.util.Arrays;

public class _3_RecursiveBinarySearch {

	public static void main(String[] args) {
		
		int[] a = {100,200, 10, 30, 40, 50, 75};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int searchNum = 75;
		int index = recursiveBinarySearch(a, searchNum, 0, a.length-1);
		if(index == -1) {
			System.out.println("Searched Number "+searchNum+" is not available in the array");
		}
		else {
			System.out.println("Searched Number "+searchNum+" is present at the index "+index);
		}
		
	}

	public static int recursiveBinarySearch(int[] a, int num, int low, int high) {
		
		while(high>=low) {
			int mid = (low+high)/2;
			
			if(a[mid]==num) {
				return mid;
			}
			
			if(a[mid]>num) {
				return recursiveBinarySearch(a, num, low, mid-1);
			}
			if(a[mid]<num) {
				return recursiveBinarySearch(a, num, mid+1, high);
			}
		}
		return -1;
	}
	
}
