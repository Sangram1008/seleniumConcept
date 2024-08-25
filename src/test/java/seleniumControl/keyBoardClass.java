package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyBoardClass {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        driver.findElement(By.xpath("//*[@name='text1']")).sendKeys("Selenium");

        WebElement copyText2 = driver.findElement(By.xpath("//*[@name='text2']"));

        // ctrl + a = Select the Text
        actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();

        // ctrl + c = Copy Text
        actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();

        // ctrl + tab = Switch to next Tab
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();

        // ctrl + v = Paste the Text
        actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();

    }

    public static void main(String[] ars) {
        keyBoardClass kb = new keyBoardClass();
        kb.openSite();
    }
}