package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webTable {

    WebDriver driver = new ChromeDriver();

    public void openSite() {
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Total Number of Rows tr
        List<WebElement> trValue = driver.findElements(By.xpath("//*[@name='BookTable']//tr"));
        System.out.println(trValue.size());

        // Total Number of Column th
        List<WebElement> thValue = driver.findElements(By.xpath("//*[@name='BookTable']//th"));
        System.out.println(thValue.size());

        WebElement name = driver.findElement(By.xpath("//*[@name='BookTable']//tr[5]"));
        System.out.println(name.getText()); // => Master In Selenium Mukesh Selenium 3000

        WebElement nameValue = driver.findElement(By.xpath("//*[@name='BookTable']//tr[5]//td[1]"));
        System.out.println(nameValue.getText()); // => Master In Selenium

        // Reading all the value form table
        for (int r = 2; r < trValue.size(); r++) {
            for (int c = 1; c < thValue.size(); c++) {
                WebElement value = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + r + "]//td[" + c + "]"));
                System.out.println(value.getText());
            }
        }

        //  Print the book whose author is mukesh
        for (int r = 2; r < trValue.size(); r++) {
            String value = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
        //  System.out.println("Author Name" + " " + value);
            if (value.equals("Mukesh")) {
                String bookName = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
                System.out.println("bookName" + " " + bookName);
            }
        }

        // Printing the All Price of book

        int totalBookPrice = 0;

        for (int i = 2; i <= trValue.size(); i++) {

            String bookPriceValue = driver.findElement(By.xpath("//*[@name='BookTable']//tr[" + i + "]//td[4]")).getText();
            totalBookPrice = totalBookPrice + Integer.parseInt(bookPriceValue);
            System.out.println("bookPriceValue" + " " + bookPriceValue);
            System.out.println("totalBookPrice " + " " + totalBookPrice);
        }
    }

    public static void main(String[] args) {
        webTable wt = new webTable();
        wt.openSite();
    }
}
