package optionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognitoMode {

    ChromeOptions options = new ChromeOptions();

    void openSite() {
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.flipkart.com/");
    }

    public static void main(String[] args) {
        incognitoMode im = new incognitoMode();
        im.openSite();
    }
}
