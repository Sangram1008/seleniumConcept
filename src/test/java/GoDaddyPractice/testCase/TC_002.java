package GoDaddyPractice.testCase;

import GoDaddyPractice.pageObjetModel.goDaddyWelcomePage;
import GoDaddyPractice.testBase.baseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002 extends baseClass {

    // Test Case - Open Godaddy.com and Validate Page Title

    goDaddyWelcomePage welComePage;

    private String url = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
    private  String currentUrl = "https://www.godaddy.com/en-in";
    @Test()
    public void  validatePage(){

        welComePage = new goDaddyWelcomePage(driver);

        String getPageTitle = driver.getTitle();
        String getCurrentUrl = driver.getCurrentUrl();

         Assert.assertEquals(getPageTitle,url,"Page Title Does Not Match");
         Assert.assertEquals(getCurrentUrl,currentUrl,"Current Url DoesNot Match");

         driver.getPageSource();

    }
}
