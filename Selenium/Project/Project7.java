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

import java.util.Random;

public class Project7 extends BaseTest1 {

	@Test()
	@Parameters({ "username", "password" })
	public void editUser(String username, String password) {
		login(username, password);
		WebElement myInfo = driver.findElement(By.xpath("//a[@id = 'menu_pim_viewMyDetails']"));
		boolean isMyInfoDisplayed = myInfo.isDisplayed();
		if (isMyInfoDisplayed) {
			assertTrue(isMyInfoDisplayed);
			System.out.println(myInfo.getText() + " is displayed");
		}
		myInfo.click();
		WebElement qualifications = driver.findElement(By.xpath("(//a[contains(.,'Qualifications')])[2]"));
		assertTrue(qualifications.isDisplayed());
		System.out.println(qualifications.getText() + " is displayed");
		qualifications.click();
		WebElement workExperience = driver.findElement(By.xpath("//h1[text()='Work Experience']"));
		assertTrue(workExperience.isDisplayed());
		driver.findElement(By.cssSelector("input#addWorkExperience")).click();
		int fourDigitNumber = new Random().nextInt(9000) + 1000;
		driver.findElement(By.cssSelector("#experience_employer")).sendKeys("IBM_" + String.valueOf(fourDigitNumber));
		driver.findElement(By.cssSelector("#experience_jobtitle")).sendKeys("Full Stack QA Engineer II");
		WebElement fromDate = driver.findElement(By.cssSelector("#experience_from_date"));
		fromDate.clear();
		fromDate.sendKeys("2025-09-01");
		WebElement toDate = driver.findElement(By.cssSelector("#experience_to_date"));
		toDate.clear();
		toDate.sendKeys("2026-02-28");
		driver.findElement(By.cssSelector("#experience_comments"))
				.sendKeys("Happy to start as Full Stack QA Engineer II");
		driver.findElement(By.cssSelector("#btnWorkExpSave")).click();
		System.out.println("test");

	}

}
