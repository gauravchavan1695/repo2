package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		//Locating dropdown field
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		//Importing Select class
		Select select = new Select(dropdown);
				
		//SelectByIndex Method 1
		select.selectByIndex(2);
				
		//SelectByValueMethod 2		
		select.selectByValue("2");
				
		//SelectByVisibleText Method 3
		select.selectByVisibleText("Option 1");
				
		//Count no.of values available under dropdown
		List<WebElement> totalcount = select.getOptions();
		totalcount.size();
		System.out.println(totalcount.size());

	}

}
