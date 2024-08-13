package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class tableWithPagination {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.manage().window().maximize();

        driver.get("https://letcode.in/advancedtable");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String tableRecord = driver.findElement(By.xpath("//*[@role='status']")).getText();

        System.out.println("tableRecord" + " " + tableRecord);

        List<WebElement> pageValue = driver.findElements(By.xpath("//*[@id='advancedtable_paginate']/span"));

        WebElement isPaginationDisplayed = driver.findElement(By.id("advancedtable_paginate"));
        for (WebElement x : pageValue) {
            System.out.println("PageValue" + " " + x.getText());
            if (isPaginationDisplayed.isDisplayed()) {
                x.click();
            }
        }
    }

    public static void main(String[] args) {
        tableWithPagination tw = new tableWithPagination();
        tw.openSite();
    }
}
