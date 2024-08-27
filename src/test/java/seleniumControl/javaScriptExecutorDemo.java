package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorDemo {

    WebDriver driver = new ChromeDriver();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    void openSite() {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    void sendKeyJS() {

        this.openSite();
        WebElement sendFirstName = driver.findElement(By.xpath("//*[@id='name']"));

        // If we have the driver is invoked like this then  we can set the JavascriptExecutor like below
        //  ChromeDriver driver = new ChromeDriver();
        //  JavascriptExecutor js = driver;

        //==============================================

        // arguments[0] will always same
        // arguments[0] will always take the sendFirstName
        js.executeScript("arguments[0].setAttribute('value','John')", sendFirstName);
    }

    void clickJE() {
        this.sendKeyJS();

        WebElement clickButton = driver.findElement(By.xpath("//*[@value='male']"));
        js.executeScript("arguments[0].click()", clickButton);
    }


    public static void main(String[] args) {
        javaScriptExecutorDemo js = new javaScriptExecutorDemo();
        js.clickJE();
    }
}
