package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxOrderSelect {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    void checkBoxOrder() {

        // Clicking Last three Check box
        // 1 2 3 4 5 6 7
        // 0 1 2 3 4 5 6
        this.openSite();
        List<WebElement> checkBoxLists = driver.findElements(By.xpath("//*[@class='form-check-input'  and @type='checkbox']"));

        for (int i = 4; i < checkBoxLists.size(); i++) {
            checkBoxLists.get(i).click();
        }

        // First Three CheckBox
        for (int i = 0; i < 3; i++) {
            checkBoxLists.get(i).click();
        }

        // Uncheck Check Box
        for (int i = 0; i < 1; i++) {
            checkBoxLists.get(i).click();
        }
    }

    public static void main(String[] args) {
        checkBoxOrderSelect lc = new checkBoxOrderSelect();
        lc.checkBoxOrder();
    }
}
