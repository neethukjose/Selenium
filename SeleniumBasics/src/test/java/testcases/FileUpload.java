package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	static WebDriver driver;
    static WebElement fileUploadOption;

	public static void fileUpload(WebElement element, String path) {

		element.sendKeys(path);
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");
		
		FileUpload obj= new FileUpload();

		//obj.fileUploadOption = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		fileUploadOption = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
	     String path = "D:\\Testing\\FileOutput\\mytext.txt";
		//fileUpload(obj.fileUploadOption, path);
		
		fileUpload(fileUploadOption, path);

	}

}
