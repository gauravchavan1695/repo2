package JavaPractice;

public class a_reverseString_Normal {

	public static void main(String[] args) {
		

//Reverse String
		
		
// String = "Gaurav Chavan"

//Method-1 --> using normal for loop
		
/*	
		String str = "Gaurav Chavan";
		String finalword = "";
	for(int i = str.length()-1; i>=0; i--)
	{
		finalword += str.charAt(i);
	}
		System.out.println(finalword);
*/
		
//Method-2 --> using String Builder
		
		String str1 = "Gaurav Chavan";
		
		StringBuilder builder = new StringBuilder(str1);
		String reversedString = builder.reverse().toString();
		System.out.println(reversedString);
		
		
		// Reverse only first word from string
		// Input: String = "Gaurav is a tester"	
		// Output: = "varuaG is a tester"	
		
		String str = "Gaurav is a tester";
		String[] words = str.split(" ", 2);
		String str2 = words[0];
		String str3 ="";
		
		for(int i=str2.length()-1; i>=0; i--) {
			 str3 += str2.charAt(i);
		}
		
		System.out.println(str3+" "+ words[1]);	
	
		
		
//fobonacci series		
		int first =0, second = 1;
		
		for(int i=1; i<=15; i++) {
			
			System.out.print(first+" ");
			
			int third = first+second;
			first = second;
			second=third;			
						
        }
				
	}	

}
