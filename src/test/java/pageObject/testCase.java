package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.pageObjectPage.logInPage;

import java.time.Duration;

public class testCase {


    private WebDriver driver;
    logInPage lp;

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        lp = new logInPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
    }

    @Test(priority = 1)
    void testLogin() {
        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }
}
