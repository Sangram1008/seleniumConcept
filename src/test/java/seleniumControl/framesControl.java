package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesControl {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.get("https://ui.vision/demo/webtest/frames/");
    }

    void frameMethod() {
        this.openSite();

        // Passed as WebElement Switch to Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("Sangram");

        // Switching to Frame2
        driver.switchTo().defaultContent();
        WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("Selenium");

        // Switching to Frame3
        driver.switchTo().defaultContent();
        WebElement frame3 = driver.findElement(By.xpath("//*[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("Java");

        // Switching to inner Frame of Frame3
        // By Using Index
        driver.switchTo().frame(0);

        try {
            driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
        } catch (Exception e) {
            e.getMessage();
            System.out.println(e.getMessage());
        }
        driver.switchTo().defaultContent();
    }

    public static void main(String[] args) {
        framesControl fc = new framesControl();
        fc.frameMethod();
    }
}
