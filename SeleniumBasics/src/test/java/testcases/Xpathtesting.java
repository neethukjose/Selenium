package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ObsquraZone\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
        WebElement radioButton1= driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        radioButton1.click();*/
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement deals= driver.findElement(By.linkText("Today's Deals"));
		deals.click();
	}

}
