package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project2 {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println("The title of the page is: "+driver.getTitle());
	}
	
	@Test
	public void verifyImageHeader() {
		WebElement imgHeader= driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		String urlHeader= imgHeader.getAttribute("src");
		System.out.println("URL of the header image :"+urlHeader);
	}
	
	@AfterClass
	public void closePageTest() {
		driver.quit();
	
	}
}
