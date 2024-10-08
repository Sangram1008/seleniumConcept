package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class orangeHrm {

    //Open Application
    //test logo
    //login
    //close
    WebDriver driver = new ChromeDriver();

    @Test(priority = 1)
    public void open() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 2)
    public void isLogoCorrect() {
        WebElement logo = driver.findElement(By.xpath("//*[@alt='company-branding']"));
        logo.isDisplayed();
    }

    @Test(priority = 3)
    public void logIn() {
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Test(priority = 4)
    public void logOut() {
        driver.close();
    }
}
