package searching;

import java.util.Arrays;

public class _2_BinarySearch {

	public static void main(String[] args) {
		
		int[] a = {100,200, 10, 30, 40, 50, 75};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int index = binarySearch(a, 75, 0, a.length-1);
		if(index == -1) {
			System.out.println("Searched Number is not available in the array");
		}
		else {
			System.out.println("Searched Number is present at the index "+index);
		}
		
	}
	
	private static int binarySearch(int[] a, int num, int low, int high) {

		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==num) {
				return mid;
			}
			if(a[mid] < num) {
				low = mid+1;
			}
			if(a[mid] > num) {
				high = mid-1;
			}
		}
		return -1;
		
	}

}
