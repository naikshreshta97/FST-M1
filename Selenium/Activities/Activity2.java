package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		System.out.println("The title of the page is: "+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		//Find the "Log in" button using any locator and click it.
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//Close the browser.
		driver.close();

	}

}
