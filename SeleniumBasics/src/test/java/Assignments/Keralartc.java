package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralartc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.keralartc.com/main.html");

		String expectedTitle = "Kerala State Road Transport Corporation - keralartc.in";
		String expectedUrl = "https://www.keralartc.com/main.html";
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is matching");
		} else {
			System.out.println("Title is not matching");
		}

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Url is matching");
		} else {
			System.out.println("Url is not matching");
		}

		WebElement eticket = driver.findElement(By.xpath("//a[text()='E-Ticketing']"));
		eticket.click();
		WebElement city = driver.findElement(By.xpath("//a[text()='City Circular']"));
		city.click();
		WebElement notifications = driver.findElement(By.xpath("//a[text()='Notifications']"));
		notifications.click();
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox1 = driver.findElement(By.xpath("//form//input[1]"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//form//input[2]"));
		checkbox2.click();
		
		
		driver.navigate().to("https://www.ebay.com/");
		String url=driver.getCurrentUrl();
		WebElement search = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		search.sendKeys("shoes");
		WebElement searchButton = driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));
		searchButton.click();
		String searchurl=driver.getCurrentUrl();
		
		if(searchurl.equals(url)) {
			System.out.println("Search is not working");
		}else {
			System.out.println("Search is working ");
		}
		
	}

}
