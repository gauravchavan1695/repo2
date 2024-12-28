package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class j_handleFrames {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		
	    List<WebElement> totalframes = driver.findElements(By.tagName("frame"));
	    System.out.println(totalframes.size());
	    
	    driver.switchTo().frame("frame-top");
	    List <WebElement> framecount = driver.findElements(By.tagName("frame"));
	    System.out.println(framecount.size());
	    
	    driver.switchTo().frame(0);
	    String framename = driver.findElement(By.tagName("body")).getText();
	    System.out.println(framename);
	    
	    
	}

}
