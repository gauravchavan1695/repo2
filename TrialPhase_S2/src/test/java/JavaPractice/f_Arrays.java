package JavaPractice;

public class f_Arrays {

	public static void main(String[] args) {

//------------------------------------  Single dimentional array  ---------------------------------------------------------		
		
		//Declaration
		
		int[] myArray;
		int[] MyArray = new int[5];
		
		
		//Reading all the elements from an array.
		int a[] = {100,200,300,400,500,1,2,3};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//Size of an array
		System.out.println(a.length);
		
		//Reading all the elements from an array using enhanced for loop.
		for (int x:a)
		{
			System.out.println(x);
		}
		
//------------------------------------  Two/multi dimentional array  ---------------------------------------------------------		

		//Declaration
		int ar[][] = {{100,200,5},{100,300,7},{400,500,9},{600,700,3}};
		
		//Find size of an array. 
		System.out.println("Size of the row in an array: "+ar.length);   //--> will give you size of the row in an array
		System.out.println("Size of columns in zeroth row: "+ar[0].length);     //--> will give size of columns in zeroth row
		
		//Read single value from an array
		System.out.println(ar[2][1]); //500
		
		//Read all the values from an array
		//METHOD 1 - Normal for loop
		for(int r=0; r<ar.length; r++)
		{
			for(int c=0; c<ar[r].length; c++)
			{
				System.out.print(ar[r][c]+ "  ");
				
			}
			System.out.println();
						
		}
		
		//METHOD 2
		//Enhanced for loop
		for(int[] z:ar)
		{
			for(int y:z)
			{
				System.out.print(y+ "  ");
			}
			
			System.out.println();
			
		}
		
//------------------------------------------------------------------------------------------------------------------------
//You can store heterogeneous data in array as well with Object type variable. but it is not recommended
		
		Object array[] = {100,10.5,'A',"Welcome",true,null};
		System.out.println("Length of an array:" +array.length);
		
		//reading elements from an array
		for(int i =0;i<array.length;i++)
		{
			System.out.print(array[i]+"  ");
		}
	}

}
