package Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicatecharacters {

	public static void main(String[] args) {
		
		String str = "cerence india";
		String output = "";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) {
			if(!String.valueOf(str.charAt(i)).isBlank()) {
			set.add(str.charAt(i));
			}			
		}
		
//		for(Character c : set) {
//			output += c;					
//		}
		
		System.out.println(set);

	}

}
