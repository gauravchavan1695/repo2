package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class o_automateClickandHold {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
		driver.manage().window().maximize();	
		
		WebElement button = driver.findElement(By.id("1"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.clickAndHold(button).build().perform();

	}

}
