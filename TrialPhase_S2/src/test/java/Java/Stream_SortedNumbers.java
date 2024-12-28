package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_SortedNumbers {

	public static void main(String[] args) {
		
//Sorted in ascending order		
		
        List<Integer> numbers = Arrays.asList(1,9,6,7,5,8,4,3,2);
		
		List<Integer> sortednumbers = numbers.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortednumbers);
		
//Descending order
		
		List<Integer> numbers2 = Arrays.asList(1,9,6,7,5,8,4,3,2);
		List<Integer> sortednumbers2 = numbers2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortednumbers2);
		
	}

}