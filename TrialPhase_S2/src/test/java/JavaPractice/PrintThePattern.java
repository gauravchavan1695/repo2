package JavaPractice;

public class PrintThePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rows = 4;
        for (int i = 1; i <= rows; i++) {   // To iterate through rows
            for (int j = 1; j <= i; j++) {  // To print the numbers in respective rows
                System.out.print(j);
            }
            System.out.println();
        }

	}

}
