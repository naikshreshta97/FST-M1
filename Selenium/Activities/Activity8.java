package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		Actions builder=new Actions(driver);
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("The title of the page is: " +driver.getTitle());
		WebElement cargolock=driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargotoml=driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement src=driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target=driver.findElement(By.xpath("//h1[text()='target']"));
		//Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. 
		//Print the confirmation text at the end of the sequence.
		builder.click(cargolock).pause(1000).moveToElement(cargotoml).pause(3000).click(cargotoml).build().perform();
		System.out.println("The confirmation text is: " +driver.findElement(By.id("result")).getText());
		//Double click on the src button. Then right click on the target button and select open. Print the confirmation text at the end of the sequence.
		builder.doubleClick(src).pause(5000).contextClick(target).pause(3000).build().perform();
		driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]")).click();
		System.out.println("The confirmation text is: " +driver.findElement(By.id("result")).getText());
		driver.quit();
	}

}
