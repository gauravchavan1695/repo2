package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f_automateRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Male']"));
		Thread.sleep(3000);
		checkbox.click();

	}

}
