package sorting;

public class _1_BubbleSort {
	//Test
	public static void main(String[] args) {
		
		int[] numbers = {2,5,1,7,8,3,4,8,6};
		_1_BubbleSort bubbleSort = new _1_BubbleSort();
		bubbleSort.sort(numbers);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
	}
	
	public void sort(int[] numbers) {
		
		for(int i=1; i<numbers.length; i++) {
			
			for(int j=0; j<numbers.length-1; j++) {
				
				if(numbers[j]>numbers[j+1]) {
					
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					
				}
				
			}
			
		}
		
		
	}

}
