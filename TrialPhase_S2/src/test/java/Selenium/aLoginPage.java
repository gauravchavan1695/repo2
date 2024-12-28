package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("student");
		
		
		WebElement password = driver.findElement(By.name("password"));
		username.isDisplayed();
		username.isEnabled();
		password.sendKeys("Password123");
		
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		
		
		WebElement title = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		String actualvalue = title.getText();
		String expectedValue = "HOME";
		
		if(actualvalue.equalsIgnoreCase(expectedValue))
		{
			System.out.println("Testcase is passed");
		}
		
		else
		{
			System.out.println("Testcase is failed");
		}
			
	}
	
}
