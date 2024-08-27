package seleniumControl;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomPage {

    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    void openSite() {
        driver.get("https://www.facebook.com/reg/");
        driver.manage().window().maximize();
        js.executeScript("document.body.style.zoom='50%'");
        js.executeScript("document.body.style.zoom='80%'");
    }

    public static void main(String[] args) {
        zoomPage zp = new zoomPage();
        zp.openSite();
    }
}
