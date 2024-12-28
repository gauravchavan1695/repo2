package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l_automateFileUploads {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement chosefile = driver.findElement(By.id("file-upload"));
		chosefile.sendKeys("C:\\Users\\gaurav.chavan\\OneDrive - Cerence Inc\\Desktop\\demodile.xlsx");
		WebElement submit = driver.findElement(By.id("file-submit"));
		submit.click();
	

	}

}
