package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class n_automateDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");
		driver.manage().window().maximize();	
		
		WebElement doubleclickbutton = driver.findElement(By.id("b1"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.doubleClick(doubleclickbutton).build().perform();
		
	}

}
