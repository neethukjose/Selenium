package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\ObsquraZone\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement round= driver.findElement(By.xpath("//div[text()='round trip']"));
		round.click();
		
		WebElement deals= driver.findElement(By.xpath("//div[text()='Deals']"));
		deals.click();
	
		WebElement gift= driver.findElement(By.xpath("//div[contains(text(),'Gift')]"));
		gift.click();
		
		WebElement spiceclub= driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[contains(text(),'SpiceClub')]"));
		spiceclub.click();
	
		WebElement cargo= driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-le9fof']//div[(text()='Cargo')]"));
		cargo.click();
	
       driver.close();
       driver.quit();
	}

}
