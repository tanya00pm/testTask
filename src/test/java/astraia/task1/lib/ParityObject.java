package astraia.task1.lib;

import astraia.task1.lib.HistoryDataTrimosomyRiskFormObject;
import org.junit.Assert;

public class ParityObject extends HistoryDataTrimosomyRiskFormObject {

    private Integer
            DELIVERIES_AT_AFTER_37W,
            LAST_DELIVERY_GA_24W,
            INTERVAL_LAST_PREGNANCY,
            GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W;

    public ParityObject() {
    }

    public ParityObject(Integer DELIVERIES_AT_AFTER_37W, Integer LAST_DELIVERY_GA_24W,
                        Integer INTERVAL_LAST_PREGNANCY,Integer GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W) {
        this.DELIVERIES_AT_AFTER_37W = DELIVERIES_AT_AFTER_37W;
        this.LAST_DELIVERY_GA_24W = LAST_DELIVERY_GA_24W;
        this.INTERVAL_LAST_PREGNANCY = INTERVAL_LAST_PREGNANCY;
        this.GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W = GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W;

    }
    public void assertMandatoryFields()
    {
        String error_message = "'{FLD_NAME}' field is mandatory.";

        Assert.assertNotNull(error_message.replace("{FLD_NAME}",
                        "'Deliveries at or after 37 weeks'"),
                DELIVERIES_AT_AFTER_37W.equals(""));
        Assert.assertFalse(error_message.replace("{FLD_NAME}",
                        "'Deliveries at or after 37 weeks'"),
                DELIVERIES_AT_AFTER_37W.equals(""));


        Assert.assertNotNull(error_message.replace("{FLD_NAME}",
                        "'Interval from last pregnancy'"),
                INTERVAL_LAST_PREGNANCY.equals(""));
        Assert.assertFalse(error_message.replace("{FLD_NAME}",
                        "'Interval from last pregnancy'"),
                INTERVAL_LAST_PREGNANCY.equals(""));


        Assert.assertNotNull(error_message.replace("{FLD_NAME}",
                        "'Gestation at delivery of last pregnancy >= 24w'"),
                GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W.equals(""));
        Assert.assertFalse(error_message.replace("{FLD_NAME}",
                        "'Gestation at delivery of last pregnancy >= 24w'"),
                GESTATION_AT_DELIVERY_LAST_PREGNANCY_24W.equals(""));

    }
}
