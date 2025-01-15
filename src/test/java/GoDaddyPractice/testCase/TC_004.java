package GoDaddyPractice.testCase;

import GoDaddyPractice.pageObjetModel.goDaddyWelcomePage;
import GoDaddyPractice.testBase.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TC_004 extends baseClass {

    goDaddyWelcomePage welComePage;

    @Test()
    public void addToCartDomain() {
        welComePage = new goDaddyWelcomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        welComePage.allMenuList("goDaddyWelcomePage");
        welComePage.panelList("Search for Domain Names");
        welComePage.searchByValue("xyz");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        welComePage.clickSearchButton();


        // Getting the Value from the Search from Bar By Attribute
        String searchValue = welComePage.searchDomain.getAttribute("value");

        // Storing the badgeElement in List so that will help us to go in else part if not present
        List<WebElement> badgeElement = driver.findElements(By.xpath("//*[@data-cy='dbsV2-badge']"));

        if (!badgeElement.isEmpty() && badgeElement.get(0).isDisplayed()) {
            WebElement disabledCard = driver.findElement(By.xpath("//span[@dir='ltr' and @class='domain-name font-weight-bold']"));
            String domainNameDisplayed = removeDotCom(disabledCard.getText());
            Assert.assertEquals(domainNameDisplayed, searchValue, "Domain Name in Search and Card DoesNot Match");
        } else {
            String domainNameOnCard = welComePage.getDomainText();
            String domainNameDisplayed = removeDotCom(domainNameOnCard);
            Assert.assertEquals(domainNameDisplayed, searchValue, "Search Value and Domain Name DoesNot Match");
        }
    }
}
