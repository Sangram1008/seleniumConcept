package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class datePicker2 {

    WebDriver driver = new ChromeDriver();

    static Month convertToMonth(String monthName) {

        HashMap<String, Month> monthMap = new HashMap<>();

        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month validMonth = monthMap.get(monthName);

        if (validMonth == null) {
            System.out.println("Invalid month name");
        }
        return validMonth;
    }

    void openSite() {
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//*[@class='icon_calendar']")).click();

        WebElement yearElement = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearElement);
        selectYear.selectByValue("1998");

        while (true) {

            String currentMonthText = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
            String targetMonth = "February";
            Month targetMonthValue = convertToMonth(targetMonth);
            Month currentMonthValue = convertToMonth(currentMonthText);

            // Compare Month
            int comparisonResult = targetMonthValue.compareTo(currentMonthValue);

            if (comparisonResult < 0) {
                // The target month is in the past
                driver.findElement(By.xpath("//*[text()='Prev']")).click();
            } else if (comparisonResult > 0) {
                // The target month is in the future
                driver.findElement(By.xpath("//*[text()='Next']")).click();
            } else {
                break;
            }
        }

        List<WebElement> date = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));

        for (WebElement x : date) {

            System.out.println(x.getText() + "date");
            if (x.getText().equals("13")){
                x.click();
            }
        }
    }

    public static void main(String[] args) {
        datePicker2 dp = new datePicker2();
        dp.openSite();
    }
}
