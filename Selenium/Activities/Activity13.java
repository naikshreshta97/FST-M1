package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("The Title is: "+driver.getTitle());
        List <WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());
        List <WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cols.size());
        List <WebElement> thirdrow=driver.findElements(By.xpath("//table/tbody/tr[3]"));
        for(WebElement cell : thirdrow) {
            System.out.println("The third row data is" +cell.getText());
        }
        WebElement secondrow=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + secondrow.getText());
        driver.quit();
	}

}
