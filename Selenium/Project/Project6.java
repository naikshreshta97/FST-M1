package project;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project6 extends BaseTest1{
	

	
	@Test()
	@Parameters({"username","password"})
	public void editUser(String username, String password) {
		login(username,password);
		WebElement directory= driver.findElement(By.id("menu_directory_viewDirectory")); 
		wait.until(ExpectedConditions.visibilityOf(directory));
		assertTrue(directory.isDisplayed());
		System.out.println("Directory is displayed");
		directory.click();
		WebElement menu = driver.findElement(By.xpath("//a[@class='toggle tiptip']"));
		//WebElement menu=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/a[1]"));
		wait.until(ExpectedConditions.visibilityOf(menu));
		if(menu.isEnabled())
		{
			menu.click();
		}
		String heading="Search Directory";
		WebElement headingPage= driver.findElement(By.xpath("//h1[text()='Search Directory']"));
		Assert.assertEquals(headingPage.getText(), heading);
		Reporter.log("Heading matches with Search Directory");
		
	}
	
}
