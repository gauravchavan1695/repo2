package JavaPractice;

import java.util.Arrays;

public class h_ProblemsOnArrays {

	public static void main(String[] args) {
		
			
		
//EX. 1 --> Find if there's 100 in given array or not..........................................................................................................................................

	//Solution 1 --> Using normal for loop
		int array[] = {300,500,6,1,100,10,50,37,48,86,9};
	    int expected = 100;
	    boolean status=false;
	    
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==expected)
			{
				System.out.println("Ex.1 sol'n method1:  The value 100 is perent in array");
				status=true;
				break;
			}				
		}
		
		if(status==false)
		{
			System.out.println("Ex.1 sol'n method1:  element not found");
		}
		
		    		
	//Solution 2 --> Using enhanced for loop
		for(int x:array)
		{
			if(x==100)
			{
				System.out.println("Ex.1 sol'n method2:  The value 100 is perent in array");
			}
			
		}
		
		if(status==false)
		{
			System.out.println("Ex.1 sol'n method2:  element not found");
		}
		
		

		
//Ex. 2 --> Find the count of duplicates in array? ................................................................................................................................................................................		

	int array[] = {100,200,4,5,9,4,100,300,500,100,6,7,100,200};
	int number = 100;
	int count=0;
	for(int i=0;i<array.length;i++)					
	{
		if(number==array[i])
		{
			count++;
		}
	}
	
	    System.out.println("Ex.2 sol'n count is: " + count);    
	    


//Ex. 3 --> Sort the below given array. .......................................................................................................................................................................................	    
	    
		int array[] = {1,3,5,2,9,4,7,6,8,0};
		System.out.println("Array before sorting: "+Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Ex.3 sol'n: Array after sorting: "+Arrays.toString(array));
		
Ex. 4 --> //Reverse the same array? .........................................................................................................
		
		for(int i=array.length-1; i>0; i--)
		{
			System.out.println("Ex.4 sol'n : Array after reverse: "+array[i]);
		}

		
//Ex. 5 --> //Find missing number in array. ......................................................................................................	

		
		int[] array = {1,3,4,5,2,6,9,8,0};
		int sum =0;
		System.out.println("Given array is: "+Arrays.toString(array));
		
		for(int i=0; i<array.length; i++)
		{
			sum = sum+array[i];
		}
		
		int sum1 =0;
		
		for(int i=0; i<=9; i++)
		{
			sum1 = sum1+i;
		}
		
		int number = sum1-sum;
		System.out.println("Ex.5 sol'n: Missing number from an array is: "+number);


		
//Ex.6 --> Find the maximum number in an array...............................................................................................................
		
		int array[]= {10,7,5,79,25,78,103,98,55};
		
		System.out.println("Given array is: "+ Arrays.toString(array));
		
		int max = array[0];	
		for (int i=1; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
		}
		
		System.out.println("Ex.6 sol'n :Maximum number is: "+max);

		
		
 
//Ex.7 --> Find the minimum number in an array...............................................................................................................
		
				int array[]= {10,7,5,79,25,78,103,98,55};
				
				System.out.println("Giver array is: "+ Arrays.toString(array));
				
				int min = array[0];	
				for (int i=1; i<array.length; i++)
				{
					if(array[i]<min)
					{
						min = array[i];
					}
				}
				
				System.out.println("Ex.7 sol'n: Minimum number is: "+min);
				
				
				
//Ex.8 --> Find the element in the array that is least in the array but greater than a target number 	
				
				int[] array = {3,4,1,2,6,7,9,4,5,8};
				int number = 3;
				
				Arrays.sort(array);
				
				for(int i=0; i< array.length; i++) {
					if(array[i]>number && array[i]!= number && array[i]<array.length-1) {
						System.out.println("Ex.8 sol'n "+ array[i]);										
					}
					break;		
				}
	}
	
}
