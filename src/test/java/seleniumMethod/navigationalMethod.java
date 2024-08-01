package seleniumMethod;

public class navigationalMethod extends seleniumBasic.FirstTestCase {

    static navigationalMethod nm = new navigationalMethod();

    void navigateToMethod() {

        nm.driver.navigate().to("https://demo.nopcommerce.com/");
        nm.driver.navigate().to("https://phptravels.com/demo/");

        nm.driver.navigate().back();
        System.out.println("URL after navigating back" + " " + nm.driver.getCurrentUrl());

        nm.driver.navigate().forward();
        System.out.println("URL after navigating forward" + " " + nm.driver.getCurrentUrl());

        nm.driver.navigate().refresh();
        nm.closeBrowser();
    }

    public static void main(String[] args) {
        nm.navigateToMethod();
    }
}
