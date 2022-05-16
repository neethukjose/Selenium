package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		//System.out.println(searchBox.getSize());
		String value= searchBox.getAttribute("aria-label");
		System.out.println(value);
		System.out.println(searchBox.getTagName());
		
		//tooltip value
		
		WebElement allDropdown= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String tooltipValue=allDropdown.getAttribute("title");
		System.out.println(tooltipValue);
		driver.close();
	}

}
