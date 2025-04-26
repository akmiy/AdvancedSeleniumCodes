package advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set; 

public class Windows11 {

	public static void main(String[] args) throws InterruptedException {
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://www.leafground.com/window.xhtml");
		
		//1.Click Button to Open Homepage in New Window and close the New Window
		String oldwindow=driver.getWindowHandle(); //Parent window
		WebElement windowbutton1 = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		windowbutton1.click();
		Thread.sleep(3000);
		Set <String> handles = driver.getWindowHandles(); //Newly opened windows including parent window
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		driver.close();
		driver.switchTo().window(oldwindow); //Parent Window
		
		//2.Find the Number of Opened Windows
		WebElement windowbutton2 = driver.findElement(By.id("j_idt88:j_idt91"));
		windowbutton2.click();
		int length = driver.getWindowHandles().size();
		System.out.println(length);
		
		//3.Close all Except Parent Window
		WebElement windowbutton3 = driver.findElement(By.id("j_idt88:j_idt93"));
		windowbutton3.click();
		Set <String> handles1 = driver.getWindowHandles();
		for (String allwindows : handles1) {
			if(!allwindows.equals(oldwindow))
				driver.switchTo().window(allwindows);
			driver.close(); //it will close only the current focus window
		}
		driver.quit(); //it will close the all the window including primary window
	}

}
