package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class browserMethod extends seleniumBasic.FirstTestCase {

    static browserMethod bm = new browserMethod();

    void openUrlMethod() {
        bm.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickOtherLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='OrangeHRM, Inc']")));
        clickOtherLink.click();
        bm.driver.quit();
    }

    public static void main(String[] args) {
        bm.openUrlMethod();
    }
}
