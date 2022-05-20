package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement newuserButton = driver.findElement(By.xpath("//button[@id='save']"));
		newuserButton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='card-text text-center p-3']")));
		WebElement emailText = driver.findElement(By.xpath("//p[@class='card-text text-center p-3']"));
		String email = emailText.getText();
		System.out.println(email);
		
		driver.close();
	}

}
