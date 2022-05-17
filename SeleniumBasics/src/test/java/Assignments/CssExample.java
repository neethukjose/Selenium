package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		WebElement autoclosableSuccess= driver.findElement(By.xpath("//button[contains(text(),'Autoclosable success')]"));
		WebElement normalSuccess= driver.findElement(By.xpath("//button[contains(text(),'Normal success')]"));
		WebElement autoclosableWarning= driver.findElement(By.xpath("//button[contains(text(),'Autoclosable warning')]"));
		WebElement normalDanger= driver.findElement(By.xpath("//button[contains(text(),'Normal warning')]"));
		
		System.out.println("Background color of autoclosableSuccess is : "+autoclosableSuccess.getCssValue("background-color"));
		System.out.println("Color of autoclosableSuccess is : "+autoclosableSuccess.getCssValue("color"));
		System.out.println("Font size of autoclosableSuccess is : "+autoclosableSuccess.getCssValue("font-size"));
		
		System.out.println("Background color of normalSuccess is : "+normalSuccess.getCssValue("background-color"));
		System.out.println("Color of normalSuccess is : "+normalSuccess.getCssValue("color"));
		System.out.println("Font size of normalSuccess is : "+normalSuccess.getCssValue("font-size"));
		
		System.out.println("Background color of autoclosableWarning is : "+autoclosableWarning.getCssValue("background-color"));
		System.out.println("Color of autoclosableWarning is : "+autoclosableWarning.getCssValue("color"));
		System.out.println("Font size of autoclosableWarning is : "+autoclosableWarning.getCssValue("font-size"));
		
		System.out.println("Background color of normalDanger is : "+normalDanger.getCssValue("background-color"));
		System.out.println("Color of normalDanger is : "+normalDanger.getCssValue("color"));
		System.out.println("Font size of normalDanger is : "+normalDanger.getCssValue("font-size"));
		
		driver.close();
	}

}
