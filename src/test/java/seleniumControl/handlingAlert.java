package seleniumControl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlert {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    void clickAlert() {
        this.openSite();

        // 1) Normal Alert
        try {
            driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        } catch (Exception e) {
            System.out.println("Error");
            e.getMessage();
        }

        Alert myAlert = driver.switchTo().alert();

        // I am a JS Alert Alert Text
        System.out.println(myAlert.getText() + " " + "Alert Text ");

        myAlert.accept();

        // 2) Alert With Ok And Cancel
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();

        Alert alertClick = driver.switchTo().alert();

        // I am a JS Confirm Alert Text
        System.out.println(alertClick.getText() + " " + "Alert Text ");
        alertClick.dismiss();

        // 3) Click Alert Prompt
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Sangram");

        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));

        // You entered: Sangram Result Text
        System.out.println(resultText.getText() + " " + "Result Text");


    }

    public static void main(String[] args) {
        handlingAlert hl = new handlingAlert();
        hl.clickAlert();
    }
}
