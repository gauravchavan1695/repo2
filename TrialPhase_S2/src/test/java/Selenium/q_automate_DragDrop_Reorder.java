package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class q_automate_DragDrop_Reorder {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mikeplate.github.io/jquery-drag-drop-plugin/example/reorder.html");
		driver.manage().window().maximize();			
		
		WebElement draggable = driver.findElement(By.xpath("//li[normalize-space()='Item E']"));
		WebElement droppable = driver.findElement(By.xpath("//li[normalize-space()='Item B']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDrop(draggable, droppable).build().perform();

	}

}
