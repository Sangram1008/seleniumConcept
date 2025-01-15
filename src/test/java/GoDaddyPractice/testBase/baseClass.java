package GoDaddyPractice.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {

    public static WebDriver driver;

    @BeforeClass
    public void initializeDriver(){
        driver =  new ChromeDriver();
        driver.get(" https://www.godaddy.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static String removeDotCom(String s){
       return s.replace(".com","");
    }
}
