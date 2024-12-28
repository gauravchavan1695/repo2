package JavaPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class m_RandomProblems {

	public static void main(String[] args)) {

//Ex.1 ...............................................................................................................................		
		
//print numbers from 1-100.		
//If multiple of 5 - print "lane"
//If multiple of 7 - print "Rocks"
//If multiple of both - print "RocketLane"
//For other numbers print numbers as it is
   
/*
//Solution --> 		
		
		for(int i=1; i<=100; i++ ) {
			
            if(i%5 ==0 && i%7 == 0) {
				
				System.out.print("RocketLane ");				
			}
			
            else if(i%5 == 0) {
				
				System.out.print("Lane ");			
			}
			
			else if(i%7 ==0 ){
				
				System.out.print("Rocks ");				
			}
			
			else {
				
				System.out.print(i+" ");			
			}			
		}				
*/
		
		
//Ex 2. --> Java program to remove duplicate characters from given string..............................................................
		
		
		String str = "cerence india";
		String output = "";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			set.add(str.charAt(i));
			
		}
		
		for(Character c : set) {
			output += c;					
		}
		
		System.out.println(output);
		
	}
}
