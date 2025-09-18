package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println("The Title is: "+driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
		System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
		driver.quit();
		
		
	}

}
