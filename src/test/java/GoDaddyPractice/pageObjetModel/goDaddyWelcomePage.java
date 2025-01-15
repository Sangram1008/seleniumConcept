package GoDaddyPractice.pageObjetModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class goDaddyWelcomePage extends BasePage {

    public goDaddyWelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='pl-f1aylcmx']")
    List<WebElement> menuItem;

    @FindBy(xpath = "//*[@class='pl-prkaso']")
    List<WebElement> domainNameList;

    @FindBy(xpath = "//*[@class='ux-text-entry-field']")
    public WebElement searchDomain;

    @FindBy(xpath = "//*[@data-testid='domain-search-box-button']")
    WebElement searchButton;

    @FindBy(xpath = "//*[@class='lh-reset']")
    WebElement domainText;


    public void allMenuList(String s) {

        for (WebElement element : menuItem) {
            if (element.equals(s)) {
                element.click();
            }
        }
    }

    public void panelList(String s) {

        for (WebElement element : domainNameList) {
            if (element.equals(s)) {
                element.click();
            }
        }
    }

    public void searchByValue(String searchText) {
        searchDomain.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getDomainText() {
        return domainText.getText();
    }
}
