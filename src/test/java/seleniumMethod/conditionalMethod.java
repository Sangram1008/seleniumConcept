package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class conditionalMethod extends seleniumBasic.FirstTestCase {

    static conditionalMethod cm = new conditionalMethod();

    void openUrlMethod() {
        cm.openUrl("https://demo.nopcommerce.com/register?returnUrl=%2F");
        cm.driver.manage().window().maximize();
    }

    void isDisplayedMethod() {
        this.openUrlMethod();
        WebElement logImage = driver.findElement(By.xpath("//*[@class='header-logo']"));

        if (logImage.isDisplayed()) {
            System.out.println("header-logo is isDisplayed");
        } else {
            System.out.println("header-logo is Not isDisplayed");
        }
    }

    void isEnabledMethod() {
        this.isDisplayedMethod();
        boolean firstNameEnabled = cm.driver.findElement(By.id("FirstName")).isEnabled();
        if (firstNameEnabled) {
            System.out.println("FirstName is Enabled");
        } else {
            System.out.println("FirstName is Not Enabled");
        }

    }

    void isSelectedMethod() {
        this.isEnabledMethod();
        WebElement clickCheckBox = cm.driver.findElement(By.id("gender-male"));
        clickCheckBox.click();
        if (clickCheckBox.isSelected()) {
            System.out.println("Is Radio Button is Selected");
        } else {
            System.out.println("Is Radio Button is Not Selected");
        }

        boolean checkNewsletter = cm.driver.findElement(By.id("Newsletter")).isSelected();
        if (checkNewsletter) {
            System.out.println("checkNewsletter is Selected");
        } else {
            System.out.println("checkNewsletter is Not Selected");
        }
    }

    void closeBrowserMethod() {
        this.isSelectedMethod();
        cm.closeBrowser();
    }


    public static void main(String args[]) {
        cm.closeBrowserMethod();
    }
}
