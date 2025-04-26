package advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip14 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Set the path for ChromeDriver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
				// Initialize WebDriver
				WebDriver driver = new ChromeDriver();      
				// Open Google
				driver.get("https://practice.expandtesting.com/tooltips");
				
				//1.Tool Tip text
				WebElement name = driver.findElement(By.id("btn1"));
				String tooltiptext = name.getAttribute("title");
				System.out.println(tooltiptext);

	}

}
