package JavaPractice;

import java.util.Arrays;

public class k_secondLargestElementInArray {

	public static void main(String[] args) {

//Find the second largest element in a given array
		
		int arr[] = {1,3,2,12,5,4,7,8,12,6,5,9};	
		int size = arr.length;	
		//System.out.println(size);
	    Arrays.sort(arr);
		System.out.println("Array after sorting: "+Arrays.toString(arr));	    
	    
	    for(int i=size-1; i>=0; i--) {
	    	if(arr[i]<arr[size-1] && arr[i]!= arr[size-1]) {	    		
	    		System.out.println("Second largest element from array: "+arr[i]);
	    		break;
	    	}
	    	  	
	    }	    

	}

}
