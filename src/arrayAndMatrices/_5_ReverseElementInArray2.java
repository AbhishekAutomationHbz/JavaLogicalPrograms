package arrayAndMatrices;

public class _5_ReverseElementInArray2 {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int reversed[] = new int[5];
		
		for(int i=0, j=arr.length; i<arr.length; i++,j--) {
			reversed[j-1] = arr[i];
		}
		
		for(int i=0; i<reversed.length; i++) {
			
			System.out.print(reversed[i]);
			
		}
		
	}
}
