package Selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webtable {

	/*
	 * public static void main(String[] args) {
	 * 
	 * handlingWebTableGenericWay("Shopify product", "Shopping");
	 * 
	 * }
	 */
	
    @Test
	public static void handlingWebTableGenericWay(String descriptionName, String catname) {

//Launching application		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com/app.html");
		driver.manage().window().maximize();

		int rowcount = driver.findElements(By.xpath("//table[@class='table table-padded']//tbody//tr")).size();
		// int columncount = driver.findElements(By.xpath("//table[@class='table
		// table-padded']//tbody//tr[1]//td")).size();

		List<WebElement> descriptions = driver
				.findElements(By.xpath("//table[@class='table table-padded']//tbody//tr//td[3]"));

		List<WebElement> category = driver
				.findElements(By.xpath("//table[@class='table table-padded']//tbody//tr//td[4]"));
		String categoryName = "";

		for (int i = 0; i < rowcount; i++) {
			if (descriptions.get(i).getText().equals(descriptionName)) {
				categoryName = category.get(i).getText();
			}
		}

		System.out.println(descriptionName + " : " + categoryName);
		Assert.assertEquals(categoryName, catname);

	}
}