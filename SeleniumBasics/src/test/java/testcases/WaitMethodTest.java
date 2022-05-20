package testcases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethodTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver, 10);

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement text=driver.findElement(By.xpath("//div[@class='example']//h4"));
		String actualText= text.getText();
		System.out.println(actualText);
		
		WebElement startButton=driver.findElement(By.xpath("//div[@id='start']//button"));
		startButton.click();
	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
		
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));

		WebElement hellotext=driver.findElement(By.xpath("//div[@id='finish']//h4"));
		
		String text2=hellotext.getText();
		System.out.println(text2);
		
		//alert
		//wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']//button")));
		
		
	}

}
