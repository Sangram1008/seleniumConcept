package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class dropDownWithoutSelect {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    void openSite() {
        driver.get("https://phptravels.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@class='nav-item dropdown']")).click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement x : links) {

            String value = x.getText();
            System.out.println(value);
            if (x.getText().equals("Requirements")) {
                wait.until(ExpectedConditions.elementToBeClickable(x));
                x.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        dropDownWithoutSelect ds = new dropDownWithoutSelect();
        ds.openSite();
    }
}
