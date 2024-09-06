package optionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disableAutomateText {

    ChromeOptions options = new ChromeOptions();

    void openSite() {
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
    }

    public static void main(String[] args) {
        disableAutomateText dmt = new disableAutomateText();
        dmt.openSite();
    }
}
