package TestNgConcept.listnersMethods;

import TestNgConcept.listnersMethods.myListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class orgHrmLis extends myListener {

    WebDriver driver;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
