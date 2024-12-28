package JavaPractice;

public class animal {
	
	String colour = "White";
}


class dog extends animal {
	
	String colour = "Black";
	
	void displaycolour()
	{
		System.out.println(super.colour);
	}	
}


