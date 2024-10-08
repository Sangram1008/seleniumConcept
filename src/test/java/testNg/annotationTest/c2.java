package testNg.annotationTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {

    @Test
    public void xyz() {
        System.out.println("In C2 xyz");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("In c2 afterTest");
    }
}
