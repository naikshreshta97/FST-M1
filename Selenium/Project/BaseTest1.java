package project;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest1 {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
    }

    public void login(String username, String password) {
        WebElement user = driver.findElement(By.id("txtUsername"));
        WebElement pwd = driver.findElement(By.id("txtPassword"));
        user.sendKeys(username);
        pwd.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_dashboard_index")));
        WebElement dashboard = driver.findElement(By.id("menu_dashboard_index"));
        Assert.assertTrue(dashboard.isDisplayed());
        System.out.println("✅ User successfully logged into HRM portal");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
