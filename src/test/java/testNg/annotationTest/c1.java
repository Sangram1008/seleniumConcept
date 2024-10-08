package testNg.annotationTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {

    @Test
    public void abc() {
        System.out.println("In C1 abc ");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("In C1 beforeTest abc");
    }
}
