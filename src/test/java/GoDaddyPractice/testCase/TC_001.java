package GoDaddyPractice.testCase;

import GoDaddyPractice.pageObjetModel.goDaddyWelcomePage;
import GoDaddyPractice.testBase.baseClass;
import org.testng.annotations.Test;

public class TC_001 extends baseClass {

    //2. Test Case - Open Godaddy.com and Print its Page title.

    goDaddyWelcomePage welComePage;

    @Test()
    public void openGodaddyAndMaxBrowser(){

        welComePage = new goDaddyWelcomePage(driver);

        String getPageTitle = driver.getTitle();

        String getPageUrl =  driver.getCurrentUrl();

        System.out.println("Get the Title of the page : " + getPageTitle);
        System.out.println("Get the URL of the current page : " + getPageUrl );
    }

}
