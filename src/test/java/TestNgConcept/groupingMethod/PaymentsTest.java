package TestNgConcept.groupingMethod;

import org.testng.annotations.Test;

public class PaymentsTest {

    @Test(priority = 1, groups = {"sanity", "regression"})
    void paymentInRS() {
        System.out.println("Payments In Rs");
    }

    @Test(priority = 2, groups = {"sanity", "regression"})
    void paymentInDollars() {
        System.out.println("Payments In Dollars");
    }
}
