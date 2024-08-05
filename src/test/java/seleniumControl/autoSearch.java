package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class autoSearch {

    WebDriver driver = new ChromeDriver();

    public void openSite() {
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> links = driver.findElements(By.xpath("//*[@role='listbox']//li//div[@role='option']"));

        for (WebElement x : links) {
            System.out.println(links.size());
            System.out.println(x.getText());
            if (x.getText().equals("selenium")) {
                x.click();
            }
        }
    }

    public static void main(String []args) {
        autoSearch as = new autoSearch();
        as.openSite();
    }
}
