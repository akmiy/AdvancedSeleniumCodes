package advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop13 {

	public static void main(String[] args) {
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//1.Drag and Drop
		WebElement From = driver.findElement(By.id("form:drag_content"));
		WebElement To = driver.findElement(By.id("form:drop_content"));
		Actions action = new Actions(driver);  //actions are use when we do mouse related work like drag and drop
		action.dragAndDrop(From, To).build().perform();//action will perform only we give build and perform
		
		//Method 2
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform(); //build perform it will build events we have doen so far like click and hold,move,release.
	}

}
