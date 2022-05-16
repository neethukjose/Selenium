package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement LastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		WebElement userName=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		WebElement cityName=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		WebElement stateName=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		WebElement zipCode=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		firstName.sendKeys("Neethu");
		LastName.sendKeys("Jose");
		userName.sendKeys("login");
		cityName.sendKeys("Kochi");
		stateName.sendKeys("Kerala");
		zipCode.sendKeys("213123");
		
		WebElement termsCheckbox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		if(termsCheckbox.isEnabled()) {
			termsCheckbox.click();
			System.out.println("Terms button clicked");
		}
		
		WebElement submitButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		if(submitButton.isEnabled()) {
			submitButton.click();
			System.out.println("Submit button clicked");
		}
	}

}
