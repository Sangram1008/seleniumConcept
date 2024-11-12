package TestNgConcept.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;

public class dataProviderMethod {

    WebDriver driver;

    //    @DataProvider(name = "login",indices = {0,1}) for using index form array
    @DataProvider(name = "login")
    public Object[][] loginData() {
        Object data[][] = {{"pavanol123@gmail.com", "test@123"}, {"abcl123@gmail.com", "test@123"}, {"bcfl123@gmail.com", "test@12"}, {"asdadl123@gmail.com", "test@23"}};
        return data;
    }

    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1, dataProvider = "login")
    void login(String email, String pwd) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(pwd);

        driver.findElement(By.xpath("//*[@value='Login']")).click();

        boolean checkLogo = driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();
        if (checkLogo == true) {
            driver.findElement(By.xpath("//*[text()=\"Logout\"][@class='list-group-item']")).click();
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @AfterTest
    void tearDown() {
        driver.close();
    }
}
