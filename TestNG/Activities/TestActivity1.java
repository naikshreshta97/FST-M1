package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new FirefoxDriver();
		driver.get("https://training-support.net/");
		System.out.println("The title of the page is: "+driver.getTitle());
	}
	@Test (priority = 1)
	public void homePageTest() {
		Assert.assertEquals(driver.getTitle(), "Training Support");
	}
	
	@Test (priority = 2)
	public void aboutPageTest() {
		driver.findElement(By.linkText("About Us")).click();
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	@AfterClass
	public void closePageTest() {
		driver.quit();
	
	}
}
