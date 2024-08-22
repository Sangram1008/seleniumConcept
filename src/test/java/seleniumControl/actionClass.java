package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class actionClass {

    WebDriver driver = new ChromeDriver();

    void mouseHover() {
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        WebElement deskTop = driver.findElement(By.xpath("//*[text()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions action = new Actions(driver);

        // Mouse Hover
        action.moveToElement(deskTop).moveToElement(mac).click().build().perform();
        // action.moveToElement(deskTop).moveToElement(mac).click().perform(); ---> Can also work with perform()
    }

    void rightClick() {
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement rightClick = driver.findElement(By.xpath("//*[text()='right click me']"));

        Actions actions = new Actions(driver);

        actions.contextClick(rightClick).build().perform();
        driver.findElement(By.xpath("//*[text()='Copy']")).click();
        driver.switchTo().alert().accept();
    }

    void doubleClick() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement doubleClick = driver.findElement(By.xpath("//*[@id='authentication']/button"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClick).build().perform();

        driver.switchTo().alert().accept();
    }

    void dragDropDown() {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement sourceValue = driver.findElement(By.xpath("//*[@id='credit2']"));
        WebElement destinationValue = driver.findElement(By.xpath("//*[@id='shoppingCart1']/div"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(sourceValue, destinationValue).build().perform();
    }

    public static void main(String args[]) {

        actionClass ac = new actionClass();
        ac.mouseHover();
        ac.rightClick();
        ac.doubleClick();
        ac.dragDropDown();
    }
}
