package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class h_automateBasicAuthentication {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	
		
	//Basic authentications are pop-ups having credential fields, but cannot be inspected.	
	//In order to automate those we need to add or concate the credentials with the urls itself.
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	

	//more generic way
		
		String username = "admin";
		String password = "admin";
		String URL = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
		
		driver.get(URL);
		
	}

}