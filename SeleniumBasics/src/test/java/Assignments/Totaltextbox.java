package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totaltextbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

		String messageText = "hai";
		WebElement message = driver.findElement(By.xpath("//div[@id='message-one']"));
		String textExpected = message.getText();
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys(messageText);
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		textExpected = textExpected.concat(" ").concat(messageText);
		System.out.println(textExpected);
		String textActual = message.getText();
		System.out.println(textActual);
		String[] st = textActual.split(":");
		String messageText1 = st[1].trim();
		System.out.println(messageText1);

		if (textActual.contains(textExpected)) {
			System.out.println("Message is matching");
		}

		// two input fields
        
	
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys("10");
		WebElement totalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String expectedTotal=totalText.getText();
		System.out.println(expectedTotal);
		expectedTotal=expectedTotal.concat(" ").concat("13");
		System.out.println(expectedTotal);
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();

		String actualTotal = totalText.getText();
		
		String[] value2 = actualTotal.split(":");
		String total = value2[1].trim();
		System.out.println(actualTotal);
		
		if(actualTotal.equals(expectedTotal)) {
			System.out.println("Message is matching");
		}
		

		driver.close();
	}

}
