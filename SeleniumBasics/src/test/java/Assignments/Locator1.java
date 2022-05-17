package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ObsquraZone\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();

		// radio id
		WebElement radioButton1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radioButton2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radioButton3 = driver.findElement(By.id("vfb-7-3"));
		radioButton1.click();
		radioButton2.click();
		radioButton3.click();

		// raido xpath

		WebElement radioButton4 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		WebElement radioButton5 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		WebElement radioButton6 = driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
		radioButton4.click();
		radioButton5.click();
		radioButton6.click();

		// checkbox id

		WebElement checkboxButton1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkboxButton2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkboxButton3 = driver.findElement(By.id("vfb-6-2"));
		checkboxButton1.click();
		checkboxButton2.click();
		checkboxButton3.click();

		// checkboxxpath

		WebElement checkboxButton4 = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		WebElement checkboxButton5 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		WebElement checkboxButton6 = driver.findElement(By.xpath("//input[@id='vfb-6-2']']"));
		checkboxButton4.click();
		checkboxButton5.click();
		checkboxButton6.click();
		
		driver.close();

	}

}
