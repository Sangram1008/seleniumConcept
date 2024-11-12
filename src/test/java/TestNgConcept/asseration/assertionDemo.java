package TestNgConcept.asseration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionDemo {

    @Test
    public void testTitle() {

        String exp_Title = "OpenCart";
        String act_Title = "OpenCar";

        if (exp_Title.equals(act_Title)) {
            Assert.assertTrue(true);
        } else {
            System.out.println("Title is notMatched");
            Assert.assertTrue(true);
        }
        Assert.assertEquals(exp_Title, act_Title);
    }
}
