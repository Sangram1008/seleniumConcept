package pageObject.pageObjectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class withPageFactory {

    WebDriver driver;

    withPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@name='username']")
    WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    WebElement passWord;

    @FindBy(tagName = "a")
    List<WebElement> list;

    public void setUserName(String user_Name) {
        userName.sendKeys(user_Name);
    }

    public void setPassword(String password) {
        passWord.sendKeys(password);
    }

}
