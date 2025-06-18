package advancedselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile18 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		//1.Upload File
		WebElement uploadbutton = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		uploadbutton.click();
		String file ="C:\\Users\\fazal\\OneDrive\\Desktop\\Asi offl\\Professional Details";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		
	}
}
