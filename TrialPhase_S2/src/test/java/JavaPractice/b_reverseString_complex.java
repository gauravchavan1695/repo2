package JavaPractice;

public class b_reverseString_complex {

	public static void main(String[] args) {
		
	// Reverse only first word from string
	// Input: String = "Gaurav is a tester"	
	// Output: = "varuaG is a tester"	
		
		String str = "Gaurav is a tester";
		String[] words = str.split(" ", 2);
		
		if(words.length > 1) 
		{		
			
		String firstword = words[0];
		String remainingSentence = words[1];
		char[] newfirstword = firstword.toCharArray();		
		String reverseword = "";
		
		for(int i=newfirstword.length-1;i>=0; i--)
		{		
			reverseword += newfirstword[i];		
	    }		
		
		System.out.println(reverseword+ " "+ remainingSentence);
		
		}		
		else {
			
			System.out.println("String is a straight line");
		}
			
//Method 1 --> ..................................................................................................
		
		String stri = "Gaurav is a tester";
		String[] stri1 = stri.split(" ", 2);
	    String st ="";
	    
		for(int i= stri1[0].length()-1; i>=0; i--)
		{
			st += stri1[0].charAt(i);
		}
		
		System.out.println("Output: "+st+" "+stri1[1]);
		
		
	}	

}




