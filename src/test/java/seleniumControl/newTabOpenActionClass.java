package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class newTabOpenActionClass {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement clickRegister = driver.findElement(By.xpath("//*[text()='Register']"));

        // ctrl + clickRegister
        actions.keyDown(Keys.CONTROL).click(clickRegister).keyUp(Keys.CONTROL).build().perform();

        // switching to Register page
        List<String> windowId = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(windowId.get(1)); // Switch to Register page

        driver.findElement(By.id("FirstName")).sendKeys("Selenium");

        // Switching to Home Page
        driver.switchTo().window(windowId.get(0));
        driver.findElement(By.xpath("//*[@placeholder='Search store']")).sendKeys("Electronics");

    }


    public static void main(String[] args) {
        newTabOpenActionClass ntc = new newTabOpenActionClass();
        ntc.openSite();
    }
}
