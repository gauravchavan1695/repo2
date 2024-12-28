package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortStringAlphabetically {

	public static void main(String[] args) {
		
		String[] words = {"apple", "orange", "banana", "grape", "cherry"};
		
//		Arrays.sort(words); --> with using sort method
		
//       List<String> mylist = new ArrayList<>();
//       for(int i=0; i<words.length; i++) {
//    	   mylist.add(words[i]);
//       }
//       Collections.sort(mylist);
//       System.out.println(mylist);
       
		
		for(int i=0; i<words.length-1; i++) {
			for(int j=i+1; j<words.length; j++) {
				
				if(words[i].compareTo(words[j])>1) {
					
					String temp = words[i]; //temp = apple
					words[i] = words[j];    //i=orange
					words[j] = temp;        //j =apple
				}								
			}			
		}
		
		System.out.println("Sorted array is : "+Arrays.toString(words));

	}
	
		
}
