package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitMethod {

    WebDriver driver = new ChromeDriver();

    void openUrl() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    void implicitWaitMethod() {
        this.openUrl();
    }

    void explicitWaitMethod() {
        this.implicitWaitMethod();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        firstName.sendKeys("San123");

        driver.quit();
    }

    public static void main(String[] args) {
        waitMethod wm = new waitMethod();
        wm.explicitWaitMethod();
    }
}
