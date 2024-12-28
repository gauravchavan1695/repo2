package Selenium2;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class prac {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<String> options = Arrays.asList("option1","option3");
		
		boolean flag = true;
		
//		for(String option : options) {
//			WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='"+option+"']"));
//			if(!checkbox.isSelected()) {
//				checkbox.click();
//			}
//		}
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement element : elements) {
			String color = element.getAttribute("value");
		    	if(options.contains(color) && !element.isSelected()) {
				
				element.click();				
			}
			
				if(!options.contains(color) && element.isSelected()) {
					
					flag = false;				
				}
		}		
	}
}
