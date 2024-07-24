package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch Browser
// Open Url https://phptravels.com/demo/
// Validate the title should be "Your Store"
// Close Browser

public class FirstTestCase {

    // Launch Browser
    WebDriver driver = new ChromeDriver();

    String webSiteTitle = "Book Your Free Demo Now - Phptravels";

    void openUrl() {
        // Open Url https://phptravels.com/demo/
        driver.get("https://phptravels.com/demo/");
    }

    void validateTitle() {
        this.openUrl();

        // Validate the title should be "Your Store"
        if (this.webSiteTitle.equals(driver.getTitle())) {
            System.out.println("Title is Matched");
        } else {
            System.out.println("Title Not Matched");
        }
    }

    void closeBrowser() {
        this.validateTitle();

        // Close Browser
        driver.quit();
    }

    public static void main(String[] args) {
        FirstTestCase ftc = new FirstTestCase();
        ftc.closeBrowser();
    }
}

