package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Assignments.Webelement;

public class SelectExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		  driver.get("https://www.facebook.com/");
		 
		  WebElement account=driver.findElement(By. xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		  account.click();
		 
		 WebElement firstname=driver.findElement(By.xpath("//input[@id='u_5_b_2i']"));
		 firstname.sendKeys("Neethu");
		 
		 WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		 
		  Thread.sleep(3000); Select selectDate= new Select(day); day.click();
		 selectDate.selectByIndex(3); //selectDate.selectByValue("2"); WebElement
		 WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select selectMonth= new Select(month);
		 selectMonth.selectByVisibleText("Feb");
		 

		// amazon

		/*driver.get("https://www.amazon.in/");
		WebElement selectValue = driver.findElement(By.xpath(
				"//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));

		Select selectOption = new Select(selectValue);
		selectOption.selectByVisibleText("Amazon Fashion");*/
	}

}
