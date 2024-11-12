package TestNgConcept.dependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency {

    @Test(priority = 1)
    public void open() {
        System.out.println("Open App");
        Assert.assertTrue(true);
    }

    @Test(priority = 2, dependsOnMethods = {"open"})
    public void login() {
        System.out.println("LogIn");
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login"})
    public void search() {
        System.out.println("Search");
        Assert.assertTrue(false);
    }

    @Test(priority = 4, dependsOnMethods = {"login", "search"})
    public void advSearch() {
        System.out.println("advSearch");
        Assert.assertTrue(true);
    }

    @Test(priority = 5, dependsOnMethods = {"login"})
    public void logout() {
        System.out.println("LogOut");
        Assert.assertTrue(true);
    }
}
