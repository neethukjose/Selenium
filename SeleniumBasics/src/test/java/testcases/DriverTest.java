package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverTest {

	 static  WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		// System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+
		// "\\BrowserDrivers\\Edgedriver\\msedgedriver.exe");
		// driver = new EdgeDriver();

		// String path=System.getProperty("user.dir");
		// System.out.println(path);

		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		driver.close();

	}

}
