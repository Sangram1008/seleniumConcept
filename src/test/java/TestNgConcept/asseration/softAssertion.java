package TestNgConcept.asseration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {

    @Test
    public void soft() {
        SoftAssert as = new SoftAssert();
        as.assertEquals(1, 1);
        as.assertEquals("San", "Dan");

        System.out.println("=-----------");

        as.assertAll();
    }
}
