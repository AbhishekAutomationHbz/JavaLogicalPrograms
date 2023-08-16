package searching;

public class _1_LinearSearch {

	
	
	public static void main(String[] args) {
		int a[]= {10, 30, 15, 19, 32};
		int index = searchTheElement(a, 19);
		if(index==-1) {
			System.out.println("Element is not found in any index");
		}
		else {
			System.out.println("Element found at the index "+index); 
		}
	}
	public static int searchTheElement(int[] a, int num) {
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				return i;
			}
		}
		return -1;
	}
	
}
