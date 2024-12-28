package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m_actionsClass_Automate_rightClick {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement images = driver.findElement(By.xpath("//a[normalize-space()='Images']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.contextClick(images).build().perform();
		
	}
}
