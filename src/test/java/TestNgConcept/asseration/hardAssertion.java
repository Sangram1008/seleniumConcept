package TestNgConcept.asseration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertion {

    @Test
    public void hard() {
        int a = 10;
        int b = 10;
        Assert.assertEquals(a, b);

        String c = "San";
        String d = "San";

        Assert.assertEquals(c, d);

         Assert.assertEquals("San", 123);

        //  Assert.assertEquals("123", 123);

//        Assert.assertNotEquals("555", 555); // Pass
//        Assert.assertNotEquals("555", 123); // Pass

        System.out.println("=-----------");
    }
}
