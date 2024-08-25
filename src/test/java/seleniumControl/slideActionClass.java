package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slideActionClass {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();
        WebElement minSlideValue = driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));

        Actions actions = new Actions(driver);
        System.out.println(minSlideValue.getLocation() + " " + "minSlideValue Current Location"); // (59, 249) minSlideValue Current Location
        System.out.println(minSlideValue.getLocation().getX() + " " + "Current Location of X"); // 59 Current Location of X
        System.out.println(minSlideValue.getLocation().getY() + " " + "Current Location of Y"); // 249 Current Location of Y

        actions.dragAndDropBy(minSlideValue, 100, 0).build().perform();

        WebElement maxSliderValue = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));

        System.out.println(maxSliderValue.getLocation() + " " + "maxSliderValue Current Location"); // (510, 249) maxSliderValue Current Location

        actions.dragAndDropBy(maxSliderValue, -100, 0).build().perform();
    }

    public static void main(String[] args) {
        slideActionClass kc = new slideActionClass();
        kc.openSite();
    }
}
