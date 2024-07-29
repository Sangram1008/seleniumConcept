package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class waitMethod {

    WebDriver driver = new ChromeDriver();
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

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


    }

    void fluentWaitMethod() {
        this.explicitWaitMethod();
        WebElement passWord = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.name("password"));
            }
        });
        passWord.sendKeys("admin123");
        driver.quit();
    }

    public static void main(String[] args) {
        waitMethod wm = new waitMethod();
        wm.fluentWaitMethod();
    }
}
