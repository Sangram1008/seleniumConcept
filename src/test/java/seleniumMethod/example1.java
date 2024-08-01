package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class example1 {

    WebDriver driver = new ChromeDriver();

    void openSite() {
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//*[@class='wikipedia-search-input']")).sendKeys("Java");
        driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();

        List<WebElement> link = driver.findElements(By.tagName("a"));

        for (int i = 0; i < link.size(); i++) {
            System.out.println(link.get(i).getText() + "i");
            if (link.get(i).getText().equals("1i")){

            }
        }


    }

    public static void main(String[] args) {

        example1 e1 = new example1();
        e1.openSite();
    }
}
