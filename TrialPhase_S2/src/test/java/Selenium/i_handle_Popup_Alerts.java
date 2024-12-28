package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_handle_Popup_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		
	//Alerts does not have web elements hence cannot be inspected.
	//In order to automate alert we need to switch to alert window and perform alert methods
		
		
		//Locating click button to navigate alert page
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
				
		//Switching to alert window and accepting alert.(click OK)
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
	
		//Dismissing (click cancel) alert
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert cancel = driver.switchTo().alert();
		Thread.sleep(5000);
		cancel.dismiss();
		
		//Adding prompt to alert and accept it
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(5000);
		prompt.sendKeys("I am an alert. Please accept me");
		Thread.sleep(5000);
		prompt.accept();
		
		driver.quit();
				
	}

}
