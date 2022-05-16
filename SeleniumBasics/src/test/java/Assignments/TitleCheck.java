package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.spicejet.com/");
		String expectedTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String expectedUrl="https://www.spicejet.com/";
		String actualTitle= driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title is matching");
		}
		else {
			System.out.println("Title is not matching-Test case failed");
		}
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("URL  is matching");
		}
		else {
			System.out.println("URL  is not matching- Test case failed");
		}*/
		
		//driver.close();
		
	  //  String page= driver.getPageSource();
	    //System.out.println(page);
	    driver.navigate().to("https://www.facebook.com/");
	    Thread.sleep(2000);
		driver.navigate().to("https://www.javatpoint.com/java-tutorial");
		 Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		// driver.navigate().refresh();
	
	}

}
