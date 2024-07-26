package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class getMethod extends seleniumBasic.FirstTestCase {

    static getMethod gm = new getMethod();

    void openUrlMethod() {
        gm.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    void getTitleOfPageMethod() {
        this.openUrlMethod();
        String title = gm.driver.getTitle();
        System.out.println("Current Title of OrangeHrm is" + " " + title);
        // Current Title of OrangeHrm is OrangeHRM
    }

    void getCurrentUrlMethod() {
        this.getTitleOfPageMethod();
        String currentUrl = gm.driver.getCurrentUrl();
        System.out.println("Current Url of Page" + " " + currentUrl);
        // Current Url of Page https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    }

    void getPageSourceCodeMethod() {
        this.getCurrentUrlMethod();
        gm.driver.getPageSource();
    }

    void getWindowHandleMethod() {
        this.getPageSourceCodeMethod();
        String windowHandle = gm.driver.getWindowHandle();
        System.out.println("Get Current Id" + " " + windowHandle);
        // Get Current Id 68DA375D4D0E240C0AB3E809DE8E6522 - will change everytime
    }

    void getWindowHandlesMethod() {
        this.getWindowHandleMethod();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement abc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='OrangeHRM, Inc']")));
        abc.click();
        Set<String> windows = gm.driver.getWindowHandles();
        System.out.println("Get Window Id" + " " + windows);
        driver.quit();
    }

    void closeBrowserMethod() {
        this.getWindowHandlesMethod();
        gm.closeBrowser();
    }

    public static void main(String args[]) {
        gm.closeBrowserMethod();
    }
}
