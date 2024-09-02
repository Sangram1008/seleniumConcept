package seleniumControl;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class captureScreenShot {

    WebDriver driver = new ChromeDriver();

    void openSite() {

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 1) Full Page ScreenShot
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File("src/test/java/screenShots/fullPage.png");

        // Copy sourceFile to targetFile
        sourceFile.renameTo(targetFile);

        // ===========================================================

        // 2) Specific Area of Page ScreenShot
        WebElement logoScreenShot = driver.findElement(By.xpath("//*[@class='_16ZfEv']"));

        File logoSourceFile = logoScreenShot.getScreenshotAs(OutputType.FILE);
        File logoTargetFile = new File("src/test/java/screenShots/logo.png");
        logoSourceFile.renameTo(logoTargetFile);


        // ===========================================================

        // 3) WebElement ScreenShot

        WebElement logInScreenShot = driver.findElement(By.xpath("//*[@class='_1Us3XD']"));
        File loginSourceFile = logInScreenShot.getScreenshotAs(OutputType.FILE);
        File loginTargerFile = new File("src/test/java/screenShots/loin.png");
        loginSourceFile.renameTo(loginTargerFile);

        driver.quit();

    }

    public static void main(String args[]) {
        captureScreenShot css = new captureScreenShot();
        css.openSite();
    }
}
