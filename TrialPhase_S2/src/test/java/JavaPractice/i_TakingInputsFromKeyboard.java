package JavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class i_TakingInputsFromKeyboard {

	public static void main(String[] args) {
		
//Reading value from console/keyboard ..................................................................................
/*		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input: ");
		int x = sc.nextInt();
		System.out.println("x= " +x);
*/		

/*		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String x = sc.next();
		System.out.println("Name: "+x);
		
		System.out.println("Enter your Sirname: ");
		String y =sc.next();
		System.out.println("Sirname: "+y);
		
		System.out.println("Enter your City: ");
		String z =sc.next();
		System.out.println("City: "+z);
*/
		
//Reading and writing data from an array also reverse an array ......................................................................................................................................
		
		int array[]=new int[6];
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<array.length;i++)
		{	
			System.out.println("Enter the number at position "+i +": ");
			array[i]=sc.nextInt();		
		}
		
		System.out.println("Entered values are: "+Arrays.toString(array));
		
		for(int i=array.length-1;i>=0;i--)
		{			
			System.out.print(array[i]+" ");
		}					
	}
}
