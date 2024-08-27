package seleniumControl;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollPage {

    WebDriver driver = new ChromeDriver();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    void scrollPageMethod() {
        driver.get("https://www.facebook.com/reg/");
        driver.manage().window().maximize();

        // 1) Scroll using pixel number
        // js.executeScript("window.scrollBy(0,1500)", "");
        // System.out.println(js.executeScript("return window.pageYOffset;"));

        // 2) Scroll till the Page Element is Visible
        // WebElement showSubmit = driver.findElement(By.xpath("//*[@name='websubmit']"));
        // js.executeScript("arguments[0].scrollIntoView();", showSubmit);

        // 3) Scroll to Page End
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        // 4) Scroll up to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

    public static void main(String[] args) {
        scrollPage sp = new scrollPage();
        sp.scrollPageMethod();
    }
}
