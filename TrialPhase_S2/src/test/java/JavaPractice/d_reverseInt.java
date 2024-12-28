package JavaPractice;

public class d_reverseInt {

	
	public static void main(String[] args) {
		/*
				
//problem: input= 1234 : output should be: 4321
		
		int number = 1234;
		int num = 0;
		
		while(number!= 0)
		{
			int reminder=number % 10; //43
			num=num*10 + reminder;    //0+4=432
			number= number/10;    //123 12 2
		}
		 
		System.out.println(num);
	
	*/
	
	
	
	//Method2------------------------- Using String builder
	
	int number = 12345;
	int reverse;
	
	StringBuilder builder = new StringBuilder(String.valueOf(number));
	String reversenum = builder.reverse().toString();
	reverse = Integer.valueOf(reversenum);
	System.out.println(reverse);
		
	}	
}
