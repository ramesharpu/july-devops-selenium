package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest {
	
	@Test
	public void welcomeMessageValidation() {
		String expectedResult = "Facebook helps you connect and share with the people in your life.";		
		String actualRestult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualRestult);
		
		assertTrue(actualRestult.equals(expectedResult), "Mismatch in the welcome message,");
		
	}

	@Test
	public void emailPlaceholderValidation() {
		String expectedResult = "Email address or phone number";		
		String actualRestult = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualRestult);
		
		assertTrue(actualRestult.equals(expectedResult), "Mismatch in the email placeholder,");
		
	}
	
	@Test
	public void passPlaceholderValidation() {
		String expectedResult = "Password";		
		String actualRestult = driver.findElement(By.id("pass")).getDomAttribute("placeholder");
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualRestult);
		
		assertTrue(actualRestult.equals(expectedResult), "Mismatch in the password placeholder,");
		
	}
	
}
