package JavaPractice;

import java.util.Arrays;

public class i_iip {

	public static void main(String[] args) {
		
//1. Pallindrome Number.....................................................................................................
	
		
		int num = 12321;
		String stri = "";		 
		String str=Integer.toString(num);
		
		for(int i=str.length()-1; i>=0; i--)
		{
			 stri += str.charAt(i);
		}
		
		int reverse =Integer.valueOf(stri);
		System.out.println(reverse);
		
		if(reverse==num)
		{
			System.out.println("Number is pallindrome number");
		}
		else
		{
			System.out.println("Number is not pallindrome number");
		}
	


//2. Check if the number is prime or not...................................................................................
		
		//condition for prime number--> 
		//number should be greater than 1
		//number should be divisible by 1 and itself only
		
		int number = 19;
		int count=0;
		
		if(number > 1)
		{
			for(int i=1; i<=number; i++)
			{
				if(number%i == 0)
				{
					count++;
				}
			}		
			if(count==2)
			{
				System.out.println("Number is a prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}
		else
		{
			System.out.println("Number is not natural number");
		}

		
		
//3. Print prime numbers till specific numbers............................................................................
//Logic 1
		
		int count=0;
		for (int i=1; i<=100; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.print(i+",");
			}
			count=0;
		} 		
 
		


		
//4. Input is {1,1,0,-1,-1}, output should be the ratio of count of positive,negative,and zero numbers.	
			
	
		int arr[] ={1,1,0,-1,-1};
	    double countp=0;
	    double countn=0;
	    double countz=0;
	    double resultp=0;
	    double resultn=0;
	    double resultz=0;
	    for(int i=0; i<arr.length; i++)
	    {
	        if(arr[i]>0)
	        {
	            countp++;
	        }
	        if(arr[i]<0)
	        {
	          countn++;  
	        }
	        if(arr[i]==0)
	        {
	            countz++;
	        }
	    }
	    resultp=countp/arr.length;
	    System.out.printf("%.6f",resultp);
	    resultn=countn/arr.length;
	    System.out.printf("%.6f",resultn);
	    resultz=countz/arr.length;
	    System.out.printf("%.6f",resultz);


	    }
}
