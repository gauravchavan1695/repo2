package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_automateCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		Thread.sleep(3000);
		checkbox.click();
	}
}