package advancedselenium;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image19 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://practice.expandtesting.com/broken-images");
		
		//1.Click on this Image to go to Home Page 
		WebElement firstimage = driver.findElement(By.xpath("//*[@id=\'dropdown-menu\']/li")); 
		firstimage.click();
		
		//2.Finding Broken Image
		WebElement brokenimage = driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div[1]/img")); 
		brokenimage.click();
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The image is broken");
		}
		else
		{
			System.out.println("The image is not broken");
		}
	}

}
