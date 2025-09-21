package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project4 extends BaseTest {

	@Test(priority = 1)
	@Parameters({ "username", "password" })
	public void verifyLogin(String username, String password) {
		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		user.sendKeys(username);
		pwd.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		wait.until(ExpectedConditions.visibilityOf(loginBtn));
		loginBtn.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_dashboard_index")));
		WebElement dashboard = driver.findElement(By.id("menu_dashboard_index"));
		Assert.assertTrue(dashboard.isDisplayed());
		System.out.println("User successfully logged into HRM portal");

	}

	@Test(priority = 2)
	@Parameters({ "employeeName", "employeeTitle" })
	void addEmployee(String employeeName, String employeeTitle) {

		wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewPimModule"))).click(); //
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_dashboard_index")));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("empsearch_employee_name_empName")));
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Add Employee']")));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(employeeName);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(employeeTitle);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed());

	}

	@Test(priority = 3, dependsOnMethods = "addEmployee")
	@Parameters({ "employeeName", "employeeTitle" })
	public void searchEmployee(String employeeName, String employeeTitle) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewPimModule"))).click();

		WebElement search = driver.findElement(By.id("searchBtn"));
		WebElement employee = driver.findElement(By.id("empsearch_employee_name_empName"));
		employee.clear();
		employee.sendKeys(employeeName + " " + employeeTitle); //
		search.click();
		WebElement result = driver.findElement(By.xpath("//tr[@class='odd']/td[3]"));
		wait.until(ExpectedConditions.visibilityOf(result));
		Assert.assertEquals(result.getText(), employeeName);
		System.out.println("Employee " + employeeName + " " + employeeTitle + " has been successfuly created");

	}

}
