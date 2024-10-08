package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationMethod {

    // TC-1
    // Login
    // Search
    // Logout
    // Login
    // Adv Search
    // Logout

    @BeforeMethod
    public void Login() {
        System.out.println("Login");
    }

    @Test(priority = 1)
    public void Search() {
        System.out.println("Search");
    }

    @Test(priority = 2)
    public void AdvSearch() {
        System.out.println("AdvSearch");
    }

    @AfterMethod
    public void LogOut() {
        System.out.println("LogOut");
    }
}
