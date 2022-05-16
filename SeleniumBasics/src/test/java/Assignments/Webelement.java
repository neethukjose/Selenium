package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");

		driver.findElement(By.xpath("//input[@id='gridCheck']")).click();
		String expectedMessage = "Success - Check box is checked";

		WebElement message1 = driver.findElement(By.xpath("//div[@class='my-2']"));
		String actualMessage = message1.getText();
		System.out.println(actualMessage);

		if (actualMessage.contains(expectedMessage)) {
			System.out.println("Message Matching");

		}
		
		driver.findElement(By.xpath("//input[@id='button-two']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-one']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-two']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-three']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-four']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-one']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-two']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-three']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='check-box-four']")).isSelected());
		
		driver.navigate().refresh();
		
		WebElement checkbox1= driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkbox2= driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkbox3= driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkbox4= driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		if(!checkbox1.isSelected()) {
			checkbox1.click();
			System.out.println("checkbox 1 clicked");
		}
		
		if(!checkbox2.isSelected()) {
			checkbox2.click();
			System.out.println("checkbox 2 clicked");
		}
		
		if(!checkbox3.isSelected()) {
			checkbox3.click();
			System.out.println("checkbox 3 clicked");
		}
		
		if(!checkbox4.isSelected()) {
			checkbox4.click();
			System.out.println("checkbox 4 clicked");
		}
		
		driver.close();
	}

}
