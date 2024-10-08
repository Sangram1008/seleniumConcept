package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationClass {

    // TC-2
    // Login
    // Search
    // Adv Search
    // Logout

    @BeforeClass
    public void Login() {
        System.out.println("BeforeClass Login");
    }

    @Test(priority = 1)
    public void Search() {
        System.out.println("Search");
    }

    @Test(priority = 2)
    public void AdvSearch() {
        System.out.println("AdvSearch");
    }

    @AfterClass
    public void LogOut() {
        System.out.println("AfterClass LogOut");
    }
}
