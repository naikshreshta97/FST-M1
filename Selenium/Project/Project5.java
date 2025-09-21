package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project5 extends BaseTest1{
	

	
	@Test()
	@Parameters({"username","password"})
	public void editUser(String username, String password) {
		login(username,password);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[text()='My Info']")));
		driver.findElement(By.xpath("//b[text()='My Info']")).click();		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Personal Details']")));
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title='First Name']")));
		driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("Shristi8");
		driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys("Srivastava8");
		driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']")));
		select.selectByVisibleText("French");
		WebElement date= driver.findElement(By.xpath("//input[@id='personal_DOB']"));
		date.clear();
		date.sendKeys("2024-08-19",Keys.ENTER);
		driver.findElement(By.id("btnSave")).click();
		
	}
	
}
