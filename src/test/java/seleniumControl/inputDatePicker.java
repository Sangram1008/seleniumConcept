package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class inputDatePicker {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement frameId = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        driver.switchTo().frame(frameId);

        // Method 1 Using SendKeys
        // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("13/02/1998");

        // Method 2 Using DatePicker
        String year = "2025";
        String month = "December";
        String day = "13";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        while (true) {
            String checkMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
            String checkYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();

            if (checkMonth.equals(month) && checkYear.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        driver.findElement(By.xpath("//*[@data-date='" + day + "']")).click();
    }

    public static void main(String[] arg) {
        inputDatePicker idp = new inputDatePicker();
        idp.openSite();
    }
}
