package astraia.task1.lib;

import org.junit.Assert;

public class HistoryDataTrimosomyRiskFormObject {

    private String
            RACIAL_ORIGIN,
            SMOKING_IN_PREGNANCY,
            DIABETES_MELLITUS,
            CHRONIC_HYPERTENSION,
            SYSTEMIC_LUPUS_ERYTHEMATOSUS,
            ANTIPHOSPHOLIPID_SYNDROME,
            FAMILY_HISTORY_PE,
            CONCEPTION,
            DATES,
            EDD_BY_DATES;

    private String[] FETUS = {
            "trisomy 21",
            "trisomy 18",
            "trisomy 13",
            "other"
    };

    private Integer
            SPONTANEOUS_DELIVERES_BTW_16_30_WEEKS,
            MATERNAL_WEIGHT,
            HEIGHT;

    private Integer
            PARITY,
            DELIVERIES_AT_AFTER_37W,
            LAST_DELIVERY_GA_24W,
            INTERVAL_LAST_PREGNANCY,
            GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W;


    public HistoryDataTrimosomyRiskFormObject() {
    }

    public void initInput(String racial_origin, Integer parity, Integer spontaneous_deliver_btw_16_30,
                          Integer maternal_weight, Integer height, String smoking_in_pregnancy,
                          String diabetes_mellitus, String chronic_hypertension, String lupus_erythematosus,
                          String antiphos_syndrome, String family_history_pe, String conception, String dates,
                          String edd_by_dates)
    {
        RACIAL_ORIGIN = racial_origin;
        PARITY = parity;
        SPONTANEOUS_DELIVERES_BTW_16_30_WEEKS = spontaneous_deliver_btw_16_30;
        MATERNAL_WEIGHT = maternal_weight;
        HEIGHT = height;
        SMOKING_IN_PREGNANCY = smoking_in_pregnancy;
        DIABETES_MELLITUS = diabetes_mellitus;
        CHRONIC_HYPERTENSION = chronic_hypertension;
        SYSTEMIC_LUPUS_ERYTHEMATOSUS = lupus_erythematosus;
        ANTIPHOSPHOLIPID_SYNDROME = antiphos_syndrome;
        FAMILY_HISTORY_PE = family_history_pe;
        CONCEPTION = conception;
        DATES = dates;
        EDD_BY_DATES = edd_by_dates;
    }

    public void clearInput()
    {
        RACIAL_ORIGIN = "";
        PARITY = 0;
        SPONTANEOUS_DELIVERES_BTW_16_30_WEEKS = 0;
        MATERNAL_WEIGHT = 0;
        HEIGHT = 0;
        SMOKING_IN_PREGNANCY = "";
        DIABETES_MELLITUS = "";
        CHRONIC_HYPERTENSION = "";
        SYSTEMIC_LUPUS_ERYTHEMATOSUS = "";
        ANTIPHOSPHOLIPID_SYNDROME = "";
        FAMILY_HISTORY_PE = "";
        CONCEPTION = "";
        DATES = "";
        EDD_BY_DATES = "";
    }

    public void assertMandatoryFields()
    {
        String error_message = "'{FLD_NAME}' field is mandatory.";
        Assert.assertNotNull(error_message.replace("{FLD_NAME}", "Racial origin"),
                RACIAL_ORIGIN);
        Assert.assertFalse(error_message.replace("{FLD_NAME}", "Racial origin"),
                RACIAL_ORIGIN.equals(""));
    }

    public void assertParityFieldsNotVisible()
    {
        Assert.assertNull("'Deliveries at or after 37 weeks' field seems to be visible.",
                DELIVERIES_AT_AFTER_37W);

        Assert.assertNull("'Date of last delivery (GA >= 24w)' field seems to be visible.",
                LAST_DELIVERY_GA_24W);

        Assert.assertNull("'Interval from last pregnancy' field seems to be visible.",
                INTERVAL_LAST_PREGNANCY);

        Assert.assertNull("'Gestation at delivery of last pregnancy >= 24w' field seems to be visible.",
                GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W);
    }

    public void assertParityFieldsVisible()
    {
        Assert.assertNotNull("'Deliveries at or after 37 weeks' field seems to be not visible.",
                DELIVERIES_AT_AFTER_37W);

        Assert.assertNotNull("'Date of last delivery (GA >= 24w)' field seems to be not visible.",
                LAST_DELIVERY_GA_24W);

        Assert.assertNotNull("'Interval from last pregnancy' field seems to be not visible.",
                INTERVAL_LAST_PREGNANCY);

        Assert.assertNotNull("'Gestation at delivery of last pregnancy >= 24w' field seems to be not visible.",
                GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W);
    }

    public Integer getPARITY() {
        return PARITY;
    }

    public void setDELIVERIES_AT_AFTER_37W(Integer DELIVERIES_AT_AFTER_37W) {
        this.DELIVERIES_AT_AFTER_37W = DELIVERIES_AT_AFTER_37W;
    }

    public Integer getDELIVERIES_AT_AFTER_37W() {
        return DELIVERIES_AT_AFTER_37W;
    }

    public void setLAST_DELIVERY_GA_24W(Integer LAST_DELIVERY_GA_24W) {
        this.LAST_DELIVERY_GA_24W = LAST_DELIVERY_GA_24W;
    }

    public Integer getLAST_DELIVERY_GA_24W() {
        return LAST_DELIVERY_GA_24W;
    }

    public void setINTERVAL_LAST_PREGNANCY(Integer INTERVAL_LAST_PREGNANCY) {
        this.INTERVAL_LAST_PREGNANCY = INTERVAL_LAST_PREGNANCY;
    }

    public Integer getINTERVAL_LAST_PREGNANCY() {
        return INTERVAL_LAST_PREGNANCY;
    }

    public void setGESTATION_AT_DELIVERY_LAST_PREGNANCY_24W(Integer GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W) {
        this.GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W = GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W;
    }

    public Integer getGESTATION_AT_DELIVERY_LAST_PREGNANCY_24W() {
        return GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W;
    }
}
