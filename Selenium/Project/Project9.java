package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project9 extends BaseTest1{
	

	
	@Test()
	@Parameters({"username","password"})
	public void editUser(String username, String password) {
		login(username,password);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[text()='My Info']")));
		driver.findElement(By.xpath("//b[text()='My Info']")).click();		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Personal Details']")));
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Assigned Emergency Contacts']")));
		//WebElement table= driver.findElement(By.id("emgcontact_list"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> columns= driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr["+i+"]/td"));
			for(int j=1;j<columns.size();j++)
			{
				WebElement cell= driver.findElement(By.xpath("//table[@id='emgcontact_list']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(" "+cell.getText());
			}
		}
	}
	
}
