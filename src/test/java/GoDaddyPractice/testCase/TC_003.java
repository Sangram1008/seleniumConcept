package GoDaddyPractice.testCase;

import GoDaddyPractice.pageObjetModel.goDaddyWelcomePage;
import GoDaddyPractice.testBase.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_003 extends baseClass {

    // Test Case - Automate the first menu link of godaddy.com with Selenium.

    String pageTitle = "Search & Buy Available Domains - Register a Domain with GoDaddy";
    goDaddyWelcomePage welComePage;
    @Test()
    public void automateFirstMenu() {
        welComePage = new goDaddyWelcomePage(driver);


        WebElement element = driver.findElement(By.xpath("//*[@class='pl-f1aylcmx']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        if(element.isDisplayed()){
            welComePage.allMenuList("Domains");

            welComePage.panelList("Search for Domain Names");

            String getCurrentTittle = driver.getTitle();
            System.out.println("getCurrentTittle : " + getCurrentTittle);

            Assert.assertEquals(getCurrentTittle,pageTitle,"Page Title Is Not Matched");
        }
    }
}
