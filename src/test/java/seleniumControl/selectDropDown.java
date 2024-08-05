package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class selectDropDown {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dropDownCountry = driver.findElement(By.xpath("//*[@id='country']"));
        Select countryValue = new Select(dropDownCountry);

        countryValue.selectByValue("india");

        // Getting all the Option from DropDown

        List<WebElement> list = countryValue.getOptions();
        System.out.println("Country List Size " + " " + list.size());

        // Printing the List Text

        for (WebElement listValue : list) {
            System.out.println("Country List" + " " + listValue.getText());
        }
    }

    public static void main(String[] args) {
        selectDropDown dd = new selectDropDown();
        dd.openSite();
    }
}
