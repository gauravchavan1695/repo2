package Java;

public class FactorialOfNumber {

// non-recursion approach ......................................................................................	
	
	public static void main(String[] args) {
		
		int n = 4;
		int x = 1;
		
		if(n==0)
		System.out.println(1);
		
		for(int i=1; i<=n; i++) {
			x= x*i;		
		}		
		System.out.println(x);
		
		int number =7;
		int factorial = fact(number);
		System.out.println("Factorial of number "+number+" : "+factorial);
	}	

// recursion approach (recurion means a function calling itself) ............................................................................................	
	
	public static int fact(int num) {
		
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
	}
}