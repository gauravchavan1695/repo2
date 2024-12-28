package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class g_automateLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//get the size of the url's present on above link(number of url's)
		List <WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		
	
		//print those url's and the text for them
		for(int i=0; i<urls.size(); i++)
		{
			System.out.println(urls.get(i).getAttribute("href"));
			System.out.println(urls.get(i).getText());
		}


		//locating with by linkText method
		WebElement linktext = driver.findElement(By.linkText("Gmail"));
		System.out.println(linktext);
		linktext.click();

	}

}
