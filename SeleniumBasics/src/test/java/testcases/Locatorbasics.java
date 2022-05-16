package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorbasics {

	public static void main(String[] args) {

		/*System.setProperty("webdriver.chrome.driver", "D:\\ObsquraZone\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		// System.setProperty("webdriver.gecko.driver","D:\\ObsquraZone\\Selenium\\Geckodriver\\geckodriver.exe");

		// WebDriver driver= new FirefoxDriver();
		
		//edge
		
		System.setProperty("webdriver.edge.driver", "D:\\ObsquraZone\\Selenium\\Edgedrver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// WebElement searchfield= driver.findElement(By.name("q"));
		WebElement searchfield = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchfield.sendKeys("testing");
		// driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
		driver.quit();

	}

}
