package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_DuplicateIntegersFromArray {

	public static void main(String[] args) {
		
	int[] arr = {1,2,4,5,6,4,5,2,3,5,8,9,9,7,7,3,7};	
	
	Set<Integer> set = new HashSet<Integer>();
	for(int i=0; i<arr.length; i++) {
		set.add(arr[i]);
	}
	
	System.out.println(set);
				
	}
}