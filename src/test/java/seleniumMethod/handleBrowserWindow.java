package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class handleBrowserWindow {

    // static handleBrowserWindow hbw = new handleBrowserWindow();
    WebDriver driver = new ChromeDriver();

    void openSite() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement abc = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));

        abc.click();

        Set<String> windowId = driver.getWindowHandles();

        List<String> windowList = new ArrayList<>(windowId);

//        String firstPage = windowList.get(0);
//        String secondPage = windowList.get(1);
//        System.out.println("WindowList" + " " + windowId);
//
//        driver.switchTo().window(firstPage);
//        System.out.println("FirstPage Title" + driver.getTitle());
//
//        driver.switchTo().window(secondPage);
//        System.out.println("SecondPage Title" + driver.getTitle());


        for (String winId : windowId) {
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println(title);
            if (title.equals("OrangeHRM")) {
                System.out.println("Current Url" + driver.getCurrentUrl());
            } else if (title.equals("Human Resources Management Software | OrangeHRM")) {
                System.out.println("Current Url" + driver.getCurrentUrl());
            }
        }
    }


    public static void main(String[] args) {
        handleBrowserWindow hbw = new handleBrowserWindow();
        hbw.openSite();
    }
}
