package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch Browser
// Open Url https://phptravels.com/demo/
// Validate the title should be "Your Store"
// Close Browser

public class FirstTestCase {

    // Launch Browser

    // protected will help to access in other package with extends
    protected WebDriver driver = new ChromeDriver();

    String webSiteTitle = "Book Your Free Demo Now - Phptravels";

    protected void openUrl(String url) {
        driver.get(url);
    }

    void validateTitle() {
        this.openUrl("https://phptravels.com/demo/");

        // Validate the title should be "Your Store"
        if (this.webSiteTitle.equals(driver.getTitle())) {
            System.out.println("Title is Matched");
        } else {
            System.out.println("Title Not Matched");
        }
    }

    protected void closeBrowser() {
        // Close Browser
        driver.quit();
    }

    public static void main(String[] args) {
        FirstTestCase ftc = new FirstTestCase();
        ftc.validateTitle();
        ftc.closeBrowser();
    }
}

