package arrayAndMatrices;

public class _7_MinAndMaxInArray {

	public static void main(String[] args) {
		
		int arr[] = {20,3,10,45,71,40};
		int min=arr[0], max=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
						
			}
			else if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println("Min and Max in the given array are "+min+"  "+max);
		
	}
	
}
