package advancedselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion16 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://practice.expandtesting.com/autocomplete");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//1.Autocompletion
		WebElement searchbox = driver.findElement(By.id("country"));
		searchbox.sendKeys("i");
		List <WebElement> optionslist = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		for (WebElement webElement : optionslist) {
			if (webElement.getText().equals("india"))
			{
				webElement.click();
				break;
			}
		}
	}
} 
