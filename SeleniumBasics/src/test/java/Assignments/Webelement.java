package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {

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

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkbox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));

		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox2.isDisplayed());
		System.out.println(checkbox3.isDisplayed());
		System.out.println(checkbox4.isDisplayed());

		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox2.isSelected());
		System.out.println(checkbox3.isSelected());
		System.out.println(checkbox4.isSelected());

		driver.navigate().refresh();

		checkbox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkbox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkbox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		checkbox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));

		Thread.sleep(3000);

		if (!checkbox1.isSelected()) {
			checkbox1.click();
			System.out.println("checkbox 1 clicked");
		}

		if (!checkbox2.isSelected()) {
			checkbox2.click();
			System.out.println("checkbox 2 clicked");
		}

		if (!checkbox3.isSelected()) {
			checkbox3.click();
			System.out.println("checkbox 3 clicked");
		}

		if (!checkbox4.isSelected()) {
			checkbox4.click();
			System.out.println("checkbox 4 clicked");
		}

		driver.close(); 
	}

}
