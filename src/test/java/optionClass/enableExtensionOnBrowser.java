package optionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enableExtensionOnBrowser {

    ChromeOptions options = new ChromeOptions();

    void openSite() {
        WebDriver driver = new ChromeDriver(options);

    }

    public static void main(String[] args) {

        enableExtensionOnBrowser eE = new enableExtensionOnBrowser();
    }
}
