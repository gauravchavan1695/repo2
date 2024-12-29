package Java;

import org.testng.annotations.Test;

public class A_stringToCapitalizeString {

	public static void main(String[] args) {
		
// Input = String str = "gaurav vishnudas chavan";		
// output = Gaurav Vishnudas Chavan		
		
		String cap = stringCapitalization("gaurav vishnudas chavan");
		System.out.println(cap);
				
	}
	
	public static String stringCapitalization(String str) {
		
		String word[] = str.split("\\s");
		String result = "";
		for(String firstword : word) {
			String firstLetter = firstword.substring(0,1).toUpperCase(); //G
			String restLetters = firstword.substring(1); //aurav
			result = result + firstLetter + restLetters + " ";				
		}	
		return result.trim();			
	}
}
