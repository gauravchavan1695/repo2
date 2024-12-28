package Java;

import java.util.HashMap;

public class logicalProgram {

	public static void main(String[] args) {

//Find repeating element in array and move them to last without using temporary array		
		
		int[] arr = {4, 5, 6, 5, 4, 3, 2, 1, 6};
		
		
		int n = arr.length;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 1: Count the frequency of each element and add to map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int index = 0; // Pointer for placing non-repeating elements

        // Step 2: Move non-repeating elements to the front
        for (int i = 0; i < n; i++) {
            if ((frequencyMap.get(arr[i]) == 1) && !(frequencyMap.get(arr[i]) > 1) ) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 3: Fill the rest of the array with repeating elements
        for (int i = 0; i < n; i++) {
            if (frequencyMap.get(arr[i]) > 1) {
            	if(frequencyMap.get(arr[i]) != -1) {
            		arr[index++] = arr[i];
            		frequencyMap.put(arr[i], -1);
            	}                
            }
        }

        // Printing the modified array for demonstration
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
