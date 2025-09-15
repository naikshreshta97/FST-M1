package activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
		
	}
	
	@Test(priority=1)
	public void pageTitleTest() {
		Assert.assertEquals(driver.getTitle(),"Selenium: Login Form");
	}
	
	@DataProvider(name="InvalidCred")
	public Object[][] cred() {
		return new Object[][] {
			{"admin","WrongPassword"},
			{"WrongAdmin","password"},
			{"@#$%&*","DELETE TABLE users;"}
		};
	}
	
	@Test(priority=2,dataProvider="InvalidCred")
	public void invalidLoginTest(String username, String password)
	{
		WebElement usernameField=driver.findElement(By.id("username"));
		WebElement passwordField=driver.findElement(By.id("password"));
		WebElement submit=driver.findElement(By.xpath("//button[@text='Submit']"));
		
		usernameField.clear();
		passwordField.clear();
		
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		submit.click();
		
		String message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subheading"))).getText();
		assertEquals(message,"Invalid credentials");
	}
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
}
