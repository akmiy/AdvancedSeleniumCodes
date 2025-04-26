package advancedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames12 {

	public static void main(String[] args) {
		//oru html page la inour html page embedded panrathuku per tha frames..divers la original html values tha usuall a eduthukum but frames la iframe kula oru html tag athula vendhu irukum
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//1.I am Inside a Frame
		driver.switchTo().frame(0); //frame 0 repesents first frame in in the iframe tag
		WebElement Framebutton1 = driver.findElement(By.id("Click"));
		Framebutton1.click();
		String text = driver.findElement(By.id("Click")).getText();//getext --> vsibile data edukrathuku getattribute -->src antha mari edukrathuku
		System.out.println(text);
		driver.switchTo().defaultContent(); //it will come to original content only applicable to frames not windows
		
		//2.I am Inside a Nested Frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement innerFrame = driver.findElement(By.tagName("iframe")); // Finds nested iframe inside frame(1)
		driver.switchTo().frame(innerFrame); // Switch to nested frame

		//3.Find Total Number of Frames
		WebElement Framebutton2 = driver.findElement(By.id("Click"));
		Framebutton2.click();
		driver.switchTo().defaultContent();
		List <WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int length = totalframes.size();
		System.out.println(length);

	}

}
