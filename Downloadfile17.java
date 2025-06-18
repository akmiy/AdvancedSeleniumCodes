package advancedselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile17 {

	public static void main(String[] args) throws InterruptedException {
		// Set the path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazal\\Selenium\\Drivers\\chromedriver.exe");
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();      
		// Open Google
		driver.get("https://demo.automationtesting.in/FileDownload.html");

		//1.Download File
		WebElement downloadbutton = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		Thread.sleep(5000);
		downloadbutton.click();
		//Thread.sleep(5000);
		File filelocation = new File("C:\\Users\\fazal\\Downloads");
		File[] totalfiles= filelocation.listFiles();
		for (File file : totalfiles) {
			if(file.getName().equals("samplefile.pdf"))
			{
				System.out.println("File is Downloaded");
				break;
			}
			else
			{
				System.out.println("File is not Downloaded");
			}
		}
	}

}
