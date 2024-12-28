package Java;

import java.util.HashMap;
import java.util.Map;

public class practice1 {

	public static void main(String[] args) {
		
		String input = "aaabbccccdeeffffff$$$";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);			
		}
		
		StringBuilder builder = new StringBuilder();
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			builder.append(entry.getKey()).append(entry.getValue());			
		}
		
		System.out.println(builder);
	}

}
