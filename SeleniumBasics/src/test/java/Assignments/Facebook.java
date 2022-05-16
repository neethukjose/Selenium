package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ObsquraZone\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		username.sendKeys("neethukolathu@gmail.com");
		password.sendKeys("123456");
		Thread.sleep(3000);
		WebElement login= driver.findElement(By.cssSelector("#u_0_d_Pe"));
		//WebElement login= driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected_5.1sy"));
		login.click();
		
		//WebElement forgotlink= driver.findElement(By.linkText("Forgotten password?"));
		WebElement forgotlink= driver.findElement(By.partialLinkText("password?"));
		forgotlink.click();

	}

}
