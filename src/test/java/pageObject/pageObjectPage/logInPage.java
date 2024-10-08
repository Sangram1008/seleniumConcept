package pageObject.pageObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logInPage {

    WebDriver driver;

    // Constructor
    public logInPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.xpath("//*[@name='username']");

    By password = By.xpath("//*[@name='password']");
    By login = By.xpath("//button[normalize-space()='Login']");

    By displayLogin = By.xpath("//div[@class='orangehrm-login-branding']");

    public void setUserName(String userNameValue) {
        driver.findElement(userName).sendKeys(userNameValue);
    }

    public void setPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }
}
