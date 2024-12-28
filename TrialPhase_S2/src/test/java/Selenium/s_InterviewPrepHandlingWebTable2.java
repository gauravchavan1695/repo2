 package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s_InterviewPrepHandlingWebTable2 {

	public static void main(String args[]){
		
		//How to verify if pertivular element is present in webtable or not?
		// If yes then print the column and row nuber for the same.
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> table = driver.findElements(By.id("customers"));
		int rowcount = driver.findElements((By.xpath("//*[@id=\"customers\"]/tbody/tr"))).size();
		int columncount = driver.findElements((By.xpath("//*[@id=\"customers\"]/tbody/tr/th"))).size();

		
		for(int i = 1; i < rowcount; i++) {
			for(int j = 1; j <= columncount; j++) {
				
				String tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				if(tableElement.equals("Roland Mendel")) {
					System.out.println(i +" : "+ j);
					break;
		
				}
				
			}
			
		}
	}

}