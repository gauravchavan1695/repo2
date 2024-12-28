package JavaPractice;

public class c_Practice {

	public static void main(String[] args) {
	
//Input = "Hello World"	
//Output = "World Hello"
		
		String str = "hello world";
		String[] words = str.split(" ");
		String result = "";
		
		for(int i = words.length-1; i>=0; i--)
		{
			result += words[i] + " ";
		}
		
		System.out.println(result);
			
		
	}
}
