package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ObsquraZone\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
		searchField.sendKeys("watches");
		Thread.sleep(3000);
	   List<WebElement> suggestions	=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	
	    for(WebElement s: suggestions) {
	    System.out.println(s.getText());
	    }
		//searchButton.click();
		//driver.quit();
		searchField.clear();
		
		
	}

}
