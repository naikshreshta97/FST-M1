package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project3 extends BaseTest1{

	
	@Test()
	@Parameters({"username","password"})
	public void verifyLogin1(String username, String password) {
		/*
		 * WebElement user=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		 * WebElement pwd= driver.findElement(By.xpath("//input[@id='txtPassword']"));
		 * user.sendKeys(username); pwd.sendKeys(password); WebElement loginBtn=
		 * driver.findElement(By.xpath("//input[@id='btnLogin']"));
		 * wait.until(ExpectedConditions.visibilityOf(loginBtn)); loginBtn.click();
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
		 * "menu_dashboard_index"))); WebElement dashboard=
		 * driver.findElement(By.id("menu_dashboard_index"));
		 * Assert.assertTrue(dashboard.isDisplayed());
		 * System.out.println("User successfully logged into HRM portal");
		 */
		login(username,password);
		
	}
	

}
