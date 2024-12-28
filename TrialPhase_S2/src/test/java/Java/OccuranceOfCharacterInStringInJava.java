package Java;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacterInStringInJava {

	public static void main(String[] args) {
		
		String str = "test java test";
		// output = t=2, e=2, s=1, r=1
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char arr[] = str.toCharArray();
		for(Character c:arr) {
			if(!String.valueOf(c).isBlank()) {				
				map.put(c, map.getOrDefault(c, 0)+1);
		     }
		}
		
		System.out.println(str+" : "+map);
	
	}
}