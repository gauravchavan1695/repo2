package JavaPractice;

import java.util.Arrays;

public class j_BubbleSortArray {	

	public static void main(String[] args) {

//Bubble sort Array		

		int[] array = { 2, 5, 4, 3, 8, 6, 0, 9, 357, 50, 43 };

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("Arrays After sort: " + Arrays.toString(array));

	}

}
