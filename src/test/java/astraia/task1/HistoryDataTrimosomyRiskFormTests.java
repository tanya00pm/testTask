package astraia.task1;

import astraia.task1.lib.HistoryDataTrimosomyRiskFormObject;
import astraia.task1.lib.ParityObject;
import org.junit.Assert;
import org.junit.Test;


public class HistoryDataTrimosomyRiskFormTests {

    @Test
    public void mandatoryFieldsNoParityTest() {

        HistoryDataTrimosomyRiskFormObject mainFormObject = new HistoryDataTrimosomyRiskFormObject();

        // -- init input data from UI
        mainFormObject.initInput(
                "Rus",
                0,
                 0,
                65,
                170,
                "yes",
                "no",
                "no",
                "no",
                "yes",
                "no",
                "conception1",
                "23.12.2019",
                "07.07.2020"
        );
        // --------------------

        // checking the mandatory fields on main form
        mainFormObject.assertMandatoryFields();


        Assert.assertFalse("'Parity' value should not be given.",
                mainFormObject.getPARITY() > 0);

        // checking that Parity fields (Parity is null) are not visible
        mainFormObject.assertParityFieldsNotVisible();

    }

    @Test
    public void mandatoryFieldsWithParityTest() {

        HistoryDataTrimosomyRiskFormObject mainFormObject = new HistoryDataTrimosomyRiskFormObject();

        // -- init input data from UI
        mainFormObject.initInput(
                "Rus",
                1,
                0,
                70,
                165,
                "no",
                "no",
                "no",
                "no",
                "no",
                "no",
                "conception2",
                "23.12.2019",
                "07.07.2020"
        );
        mainFormObject.setDELIVERIES_AT_AFTER_37W(1);
        mainFormObject.setLAST_DELIVERY_GA_24W(0);
        mainFormObject.setINTERVAL_LAST_PREGNANCY(6);
        mainFormObject.setGESTATION_AT_DELIVERY_LAST_PREGNANCY_24W(2);
        // --------------

        // checking the mandatory (green) fields on main form
        mainFormObject.assertMandatoryFields();

        Assert.assertNotNull("'Parity' value is null.",
                mainFormObject.getPARITY());

        Assert.assertTrue("Parity value should be > 0",
                mainFormObject.getPARITY() > 0);

        // checking the visible fields when Parity > 0
        mainFormObject.assertParityFieldsVisible();

        ParityObject ParityObject = new ParityObject(
                mainFormObject.getDELIVERIES_AT_AFTER_37W(),
                mainFormObject.getLAST_DELIVERY_GA_24W(),
                mainFormObject.getINTERVAL_LAST_PREGNANCY(),
                mainFormObject.getGESTATION_AT_DELIVERY_LAST_PREGNANCY_24W()
        );

        // checking the mandatory (green) fields when Parity > 0
        ParityObject.assertMandatoryFields();
    }
}
