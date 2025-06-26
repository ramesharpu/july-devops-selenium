package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		//open the browser and url and make it available for all the testcases
		
		//open the chrome browser
		driver = new ChromeDriver();
		
		//open the url
		driver.get("https://www.facebook.com");
	}
	
	
	@AfterTest
	public void tearDown() {
		//once the is executed successfully, browser will get closed
		driver.quit();
	}

}
