package TestNgConcept.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class parmTest {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String value, String url) {

        switch (value.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + value);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    @Test(priority = 1)
    void testLogo() {
        boolean logo = driver.findElement(By.xpath("//*[@class='orangehrm-login-branding']")).isDisplayed();
        if (logo == true) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Test(priority = 2)
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 3)
    void testUrl() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }
}
