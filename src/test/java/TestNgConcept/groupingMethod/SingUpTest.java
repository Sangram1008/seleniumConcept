package TestNgConcept.groupingMethod;

import org.testng.annotations.Test;

public class SingUpTest {

    @Test(priority = 1, groups = {"regression"})
    void singUpByEmail() {
        System.out.println("SingUp By Email");
    }

    @Test(priority = 2, groups = {"regression"})
    void singUpByFaceBook() {
        System.out.println("SingUp By FaceBook");
    }

    @Test(priority = 3, groups = {"regression"})
    void singUpByTwitter() {
        System.out.println("SingUp By Twitter");
    }
}
