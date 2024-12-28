package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}
