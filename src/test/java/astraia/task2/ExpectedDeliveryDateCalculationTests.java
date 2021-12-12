package astraia.task2;

import astraia.task2.lib.ExpectedDeliveryDateCalculationObject;
import org.junit.Assert;
import org.junit.Test;

public class ExpectedDeliveryDateCalculationTests {

    @Test
    public void EDDCalculationTest() {

        String eddDateToTest;
        String eddDateResult;
        String error_message = "EDD by dates {VALUE} calculated wrong. Correct date is supposed to be {RESULT}.";

        ExpectedDeliveryDateCalculationObject ExpectedDeliveryDateCalculationObject = new ExpectedDeliveryDateCalculationObject();
        ExpectedDeliveryDateCalculationObject.initCRLBoundary(45,84);

        eddDateToTest = "08.11.2020";
        eddDateResult = ExpectedDeliveryDateCalculationObject.calculateEDDByDates(55, "27.04.2020");
        Assert.assertTrue(error_message.replace("{VALUE}", eddDateToTest).replace("{RESULT}", eddDateResult),
                        eddDateResult
                        .equals(eddDateToTest));

        eddDateToTest = "07.07.2020";
        eddDateResult = ExpectedDeliveryDateCalculationObject.calculateEDDByDates(53, "23.12.2019");
                Assert.assertTrue(error_message.replace("{VALUE}", eddDateToTest).replace("{RESULT}", eddDateResult),
                        eddDateResult
                        .equals(eddDateToTest));

        // --- negative scenario --- //
        eddDateToTest = "06.04.2020";
        eddDateResult = ExpectedDeliveryDateCalculationObject.calculateEDDByDates(49, "19.09.2018");
        Assert.assertTrue(error_message.replace("{VALUE}", eddDateToTest).replace("{RESULT}", eddDateResult),
                        eddDateResult
                        .equals(eddDateToTest));

    }
}
