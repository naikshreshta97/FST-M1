package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page is: "+driver.getTitle());
		WebElement inputtext=driver.findElement(By.id("textInput"));
		System.out.println("Is the Text field enabled? "+inputtext.isEnabled());
		driver.findElement(By.id("textInputButton")).click();
		System.out.println("Is the Text field enabled? "+inputtext.isEnabled());
		driver.close();
	}

}
