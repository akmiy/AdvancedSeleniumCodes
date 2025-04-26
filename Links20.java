package advancedselenium;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links20 {

	public static void main(String[] args) throws InterruptedException {
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();   
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open Google
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		//1.Go to Home Page
		WebElement homepagelink = driver.findElement(By.linkText("Go to Dashboard"));
		homepagelink.click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		//2.Where i am suppose to go without clicking me
		WebElement wheretogolink = driver.findElement(By.partialLinkText("Find the URL"));
		@SuppressWarnings("deprecation")
		String where = wheretogolink.getAttribute("href");
		System.out.println(where);
		driver.navigate().back();
		Thread.sleep(5000);
		
		//3.Am I broken link?
		WebElement brokenlink = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[3]/div/div/a"));
		brokenlink.click();
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Broken Link");
		}
		driver.navigate().back();
		Thread.sleep(5000);
		
		//4.Duplicate link?
		WebElement homepagelink1 = driver.findElement(By.linkText("Go to Dashboard"));
		homepagelink1.click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		//5.How Many Links are available in this Page
		List<WebElement> countlink = driver.findElements(By.tagName("a")); //for links anchor tag <a> for images <img> tag
		int totallink = countlink.size();
		System.out.println(totallink);
	}

}
