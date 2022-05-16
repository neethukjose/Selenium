package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement okButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		okButton.click();
		WebElement loginButton= driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']"));
		String loginColor= loginButton.getCssValue("color");
		System.out.println(loginColor);
        String fontSize= loginButton.getCssValue("font-size");
        System.out.println(fontSize);
        
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='search_btn train_Search']"));
        String backgroundColor= searchButton.getCssValue("background-color");
        System.out.println(backgroundColor);
	}

}
