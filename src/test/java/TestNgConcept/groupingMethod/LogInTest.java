package TestNgConcept.groupingMethod;

import org.testng.annotations.Test;

public class LogInTest {

    @Test(priority = 1, groups = {"sanity"})
    void loginEmail() {
        System.out.println("login By Email");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginByFaceBook() {
        System.out.println("login By FaceBook");
    }

    @Test(priority = 3, groups = {"sanity"})
    void loginByTwitter() {
        System.out.println("login By FaceBook");
    }
}
