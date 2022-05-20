package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commandstest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox1 = driver.findElement(By.xpath("//form//input[1]"));
		int x=checkbox1.getLocation().getX();
		int y=checkbox1.getLocation().getY();
		System.out.println("X value is " +x+"Y value is " +y);
		
		System.out.println("checkbox1" + checkbox1.isDisplayed());
		WebElement checkbox2 = driver.findElement(By.xpath("//form//input[2]"));
		Boolean b=checkbox1.isSelected();
		System.out.println(b);
		Boolean b2=checkbox2.isSelected();
		System.out.println(b2);
        
		if(b.equals(false)) {
			checkbox1.click();
			System.out.println("checkbox 1 clicked");
			System.out.println(checkbox1.isEnabled());
		}
		
		if(!checkbox2.isSelected()) {
			checkbox2.click();
			System.out.println("checkbox  2 clicked");
		}
		
		
		
	}

}
