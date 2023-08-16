package sorting;

public class _2_SelectionSort {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,1,7,8,3,4,9,6};
		_2_SelectionSort selectionSort = new _2_SelectionSort();
		selectionSort.sort(numbers);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
	}
	
	public void sort(int[] numbers) {
		
		int min, temp, size = numbers.length;
		
		for(int i=0; i<size-1; i++) {
			min = i;
			
			for(int j=i+1; j<size; j++) {
				if(numbers[j]<numbers[min]) {
					min=j;
				}
			}
			temp = numbers[i];
			numbers[i]=numbers[min];
			numbers[min]=temp;
		}
		
		
	}
	
}
