package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project8 extends BaseTest1{
	

	
	@Test()
	@Parameters({"username","password"})
	public void editUser(String username, String password) {
		login(username,password);
		WebElement applyLeave= driver.findElement(By.xpath("//span[text()='Apply Leave']")); 
		wait.until(ExpectedConditions.visibilityOf(applyLeave));
		applyLeave.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Apply Leave']")));
		Select leaveType= new Select(driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")));
		leaveType.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).sendKeys("2025-09-10");
		driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).sendKeys("2025-09-24");
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		WebElement myLeave=driver.findElement(By.xpath("//a[text()='My Leave']"));
		wait.until(ExpectedConditions.visibilityOf(myLeave));
		myLeave.click();
		WebElement status=driver.findElement(By.xpath("(//a[contains(text(),'Pending Approval')])[1]"));
		System.out.println("Status of applied leave: "+status.getText());
	}
	
}
