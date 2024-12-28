package JavaPractice;

public class g_PracticeProblems {
	public static void main(String[] args) {
		
		
		int a[][]= {{1,2,3},{11,22,33},{111,222,333},{1111,2222,3333}};
		
		//Read single value from an array		
		//System.out.println(a[2][2]);
		
		//Read all values from array using for loop
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+ "  ");
			}
			   
			    System.out.println();			
		}
		
		//Read values using enhanced for loop
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y +"  ");
			}
			
			    System.out.println();
		}
	}
}
