package optionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headLessMode {

    void openInHeadLess() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        String title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        if (driver.getTitle().equals(title)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        headLessMode hm = new headLessMode();
        hm.openInHeadLess();
    }
}
