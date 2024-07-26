package phptravelsDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumBasic.FirstTestCase;

import java.time.Duration;

public class phpTravels extends FirstTestCase {

    static phpTravels ls = new phpTravels();

    void openWebSite() {
        ls.openUrl("https://phptravels.com/demo/");
        ls.driver.manage().window().maximize();
    }

    void demoRequestFormDetails() {
        this.openWebSite();

        // Locator used for this is By Id
        // isDisplayed() returns true or false if Present
        boolean checkIfNavBarPresent = ls.driver.findElement(By.id("mynavbar")).isDisplayed();
        if (checkIfNavBarPresent) {
            System.out.println("NavBar Is Present");
        } else {
            System.out.println("NavBar Is Not Present");
        }

        // Locator used for this By Name and sendKeys use to send the value
        ls.driver.findElement(By.name("first_name")).sendKeys("John");
        ls.driver.findElement(By.name("last_name")).sendKeys("Snow");

        // Select is Class and by creating the Object of Select class and pass the CountryCode Id
        Select countrySelect = new Select(ls.driver.findElement(By.id("country_id")));

        // And by CountryCode Dropdown value we will select value
        countrySelect.selectByValue("99");

        ls.driver.findElement(By.name("whatsapp")).sendKeys("7038901111");
        ls.driver.findElement(By.name("business_name")).sendKeys("John Business Hub");
        ls.driver.findElement(By.name("email")).sendKeys("s3yjTLnVSwaT@tempsmtp.com");
        this.addTotalNumber();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button.btn_loading")));

        // Ensure the submit button is clickable
        WebElement clickSubmit = wait.until(ExpectedConditions.elementToBeClickable(By.id("demo")));

        // Scroll into view if necessary
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickSubmit);

        // Click the submit button
        try {
            clickSubmit.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            // Fallback: use JavaScript to click the button
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickSubmit);
            WebElement loader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn_loading")));
            wait.until(ExpectedConditions.invisibilityOf(loader));
        }
        this.checkSubmitSuccessful();
    }

    void addTotalNumber() {
        // Getting the Count of numb1 and numb1
        // getText() will help to get the text of numb1 and numb2
        String firstNumber = ls.driver.findElement(By.id("numb1")).getText();
        String secondNumber = ls.driver.findElement(By.id("numb2")).getText();

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        // Getting the totalCount of numb1 and numb1
        // Converting the String into Integer to get the value of Total Count
        Integer totalCount = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        System.out.println(totalCount);

        // Locator used for this is By id and sending the value to the number
        // value is total count and converted to toString() from Integer
        ls.driver.findElement(By.id("number")).sendKeys(totalCount.toString());
    }

    void checkSubmitSuccessful() {
        try {
            // WebDriverWait is a Class and wait for the 10 Second
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Will locate by Xpath the ThankYou Element
            WebElement thankYouMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"completed\"]")));

            // Will check the is thankYouMessage Displayed
            if (thankYouMessage.isDisplayed()) {
                System.out.println("The 'Thank you!' message is displayed.");
            } else {
                System.out.println("Submit Text does not match 'Thank you!'.");
            }
        } catch (Exception e) {
            System.out.println("The 'Thank you!' message is not found within the timeout period.");
        }
    }

    void close() {
        this.demoRequestFormDetails();
        ls.closeBrowser();
    }

    public static void main(String[] args) {
        ls.close();
    }
}
