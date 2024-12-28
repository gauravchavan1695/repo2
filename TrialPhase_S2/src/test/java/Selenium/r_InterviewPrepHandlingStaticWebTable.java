package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class r_InterviewPrepHandlingStaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		
	//	url: https://testautomationpractice.blogspot.com/
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Implicit wait of 10secs
		
		driver.get("https://testautomationpractice.blogspot.com/");   // launching driver
		driver.manage().window().maximize();  // maximize window
		
		
// Task 1. -->  Find total number of rows in a table.
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Row count is: "+rows);
		
// Task 2. -->  Find total number of columns in a table.	
		
	    int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	    System.out.println("Column count is: "+columns);
		
// Task 3. -->  Read data from specific row and column (6th row 2nd column)
	    
	   String textname =  driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[2]")).getText();
	   System.out.println("Text present at 6th roe and 2nd column is: "+textname);
	   
// Task 4. -->  Read data from all the rows and columns 
	   
	   System.out.println("Data from given talbe is: ");
	   
	   for (int r=2; r<=rows; r++) {	   
		   
		   for(int c=2; c<=columns; c++) {		
			   
			   String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			   System.out.print(value+"     ");
		   }		   
		       System.out.println();
	   }

// Task5. --> COnditional requirement. say I want to print bookname for table whose author is mukesh	   
	   
               for (int r=2; r<=rows; r++) {	 
            	 String author =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            	 
            	 if(author.equals("Mukesh")) {
            		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
            		 
           		    System.out.print(bookname+",  ");
             }		  	   
	    }

// Task6. --> COnditional requirement.read the price for each book from table and print the total price.	               
               
	}
}
