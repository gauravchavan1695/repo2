	package Java;

public class moveAllNegativeNumbersToLast {

	public static void main(String[] args) {
		
		int[] arr = {1,-3,2,-6,9,-4,0,5};
		
		int index =0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				int temp = arr[i];				
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
			
		for(int num:arr) {			
			System.out.print(num+" ");
		}			
	}
}