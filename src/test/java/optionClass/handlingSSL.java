package optionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingSSL {

    ChromeOptions options = new ChromeOptions();

    void openSite() {
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        driver.quit();
    }

    public static void main(String[] args) {
        handlingSSL hssl = new handlingSSL();
        hssl.openSite();
    }
}
