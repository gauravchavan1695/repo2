package Java;

public class B_logicQuestions {

	public static void main(String[] args) {
		
// Write a java logic to print the output as "ab ac ad bc bd cd" from a given string as "abcd"
		
		String str = "abcd";
		int n = str.length();
		
		// Generate all possible pairs of characters from the string
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
            	
                // Print each pair of characters separated by a space
                System.out.print(str.charAt(i) + "" + str.charAt(j) + " ");
            }
        }			
	}
}
