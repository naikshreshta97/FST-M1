package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("The Title is: "+driver.getTitle());
		List <WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());
        List <WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cols.size());
        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Book name before sorting: " + cellValue.getText());
        driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
        cellValue = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Book Name after sorting: " + cellValue.getText());
        driver.quit();

	}

}
