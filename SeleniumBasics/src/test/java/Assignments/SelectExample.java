package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		WebElement colorSelect= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select= new Select(colorSelect);
		select.selectByValue("Yellow");
		
		WebElement twoinputField= driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select2= new Select(twoinputField);
		select2.selectByIndex(0);
		
		WebElement selectedButton= driver.findElement(By.xpath("//button[@id='button-first']"));
		selectedButton.click();
		WebElement textValue=driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualMessage=textValue.getText();
		String expectedMessage="First selected color is : Red";
		
		System.out.println(actualMessage);
		if(actualMessage.equals(expectedMessage)) {
			System.out.println("Message is matching");
		}
		

	}

}
