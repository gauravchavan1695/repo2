package JavaPractice;

import java.util.Arrays;

public class l_OddNumbersInArray {

	public static void main(String[] args) {
		
		int[] oddNumbers = new int[5]; // Array to store odd numbers
        int index = 0; // Index for the array

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i; // Store the odd number in the array
                index++; // Increment the index
            }
        }
        
        System.out.println(Arrays.toString(oddNumbers));
	}

}
