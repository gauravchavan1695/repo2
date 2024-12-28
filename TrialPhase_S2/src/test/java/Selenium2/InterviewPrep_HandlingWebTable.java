package Selenium2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewPrep_HandlingWebTable {

	public static void main(String[] args) {
		
		//How to verify if perticular element is present in webtable or not?
		// If yes then print the column and row number for the same.

		verifywebelement("Austria");
		
	}
	
	public static void verifywebelement(String name) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		List<WebElement> table = driver.findElements(By.id("customers"));
		int rowcount = driver.findElements((By.xpath("//*[@id=\"customers\"]/tbody/tr"))).size();
		//System.out.println(rowcount);
		int columncount = driver.findElements((By.xpath("//*[@id=\"customers\"]/tbody/tr/th"))).size();
		//System.out.println(columncount);
		
		boolean status = false;
		
		for(int i = 1; i < rowcount; i++) {
			for(int j = 1; j <=columncount; j++) {
				
				String tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				
				if(tableElement.equals(name)) {
					status = true;
					System.out.println(i +" : "+ j);
					System.out.println(status);
					break;		
				}				
			}			
		}
		
		if(status == true) {
			System.out.println("Element is present");			
		}
		if(status == false) {
			System.out.println("Element is not present");
			
		}		
    }
}
