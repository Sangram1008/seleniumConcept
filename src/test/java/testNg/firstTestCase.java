package testNg;

import org.testng.annotations.Test;

public class firstTestCase {

    @Test(priority = 1)
    public void openApp() {
        System.out.println("Open app");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Login");

    }

    @Test(priority = 3)
    public void logOut() {
        System.out.println("Logout");

    }
}
