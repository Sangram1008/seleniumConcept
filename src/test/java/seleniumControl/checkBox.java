package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBox {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    void selectSingleCheckBox() {
        this.openSite();
        driver.findElement(By.id("sunday")).click();
        driver.close();
    }

    void selectAllCheckBox() {
        this.openSite();
        List<WebElement> checkBoxLists = driver.findElements(By.xpath("//*[@class='form-check-input'  and @type='checkbox']"));

        for (int i = 0; i < checkBoxLists.size(); i++) {
            checkBoxLists.get(i).click();
        }
    }

    public static void main(String[] args) {
        checkBox cb = new checkBox();
        cb.selectAllCheckBox();
    }
}
