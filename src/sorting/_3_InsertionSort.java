package sorting;

public class _3_InsertionSort {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,1,7,8,3,4,9,6};
		_3_InsertionSort sort = new _3_InsertionSort();
		sort.insertionSort(numbers);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
	}
	
	public void insertionSort(int[] numbers) {
		
		for(int i=0; i<numbers.length; ++i) {
			int j=i;
			while(j>0 && numbers[j-1]>numbers[j]) {
				int temp = numbers[j];
				numbers[j]=numbers[j-1];
				numbers[j-1]=temp;
				
				j=j-1;
				
			}
			
		}
		
	}
	
}
