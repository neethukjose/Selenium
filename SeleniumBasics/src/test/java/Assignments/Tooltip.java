package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/social-icon.html");
		
		WebElement mailText = driver.findElement(By.xpath("//a[@class='mail']"));
		System.out.println("Tooltip of Mail is :" +mailText.getAttribute("title"));
		
		WebElement googleText = driver.findElement(By.xpath("//a[@class='google']"));
		System.out.println("Tooltip of google is :" +googleText.getAttribute("title"));
		
		WebElement youtubeText = driver.findElement(By.xpath("//a[@class='you-tube']"));
		System.out.println("Tooltip of youtube  is :" +youtubeText.getAttribute("title"));
		
		WebElement facebookText = driver.findElement(By.xpath("//a[@class='facebook']"));
		System.out.println("Tooltip of facebook  is :" +facebookText.getAttribute("title"));

		WebElement rssText = driver.findElement(By.xpath("//a[@class='rss']"));
		System.out.println("Tooltip of rss  is :" +rssText.getAttribute("title"));

	}

}
