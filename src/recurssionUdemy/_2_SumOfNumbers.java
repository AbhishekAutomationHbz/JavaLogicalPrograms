package recurssionUdemy;

public class _2_SumOfNumbers {

	public static int sumOfNumbers(int num) {
		
		if(num<=1) {
			return num;
		}
		else {
			return num + sumOfNumbers(num-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOfNumbers(10));
		
	}
}
