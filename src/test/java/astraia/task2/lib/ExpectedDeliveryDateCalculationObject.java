package astraia.task2.lib;

import astraia.task2.lib.StatisticEntityObject;
import org.junit.Assert;
import java.util.ArrayList;

public class ExpectedDeliveryDateCalculationObject {

    private Integer CRL_MIN,
                    CRL_MAX;

    private ArrayList<StatisticEntityObject> table;

    public ExpectedDeliveryDateCalculationObject() {

        table = new ArrayList();

        table.add(0, new StatisticEntityObject("27.04.2020", 55, "08.11.2020"));
        table.add(1, new StatisticEntityObject("13.05.2017", 61, "21.11.2017"));
        table.add(2, new StatisticEntityObject("05.03.2020", 47, "21.09.2020"));
        table.add(3, new StatisticEntityObject("19.09.2018", 49, "06.04.2019"));
        table.add(4, new StatisticEntityObject("23.12.2019", 53, "07.07.2020"));
    }


    public void initCRLBoundary(Integer min_value, Integer max_value)
    {
        this.CRL_MIN = min_value;
        this.CRL_MAX = max_value;
    }

    private void assertCRLBoundary(Integer crlValue)
    {
        Assert.assertTrue("CRL value " + crlValue +
                        " is out of boundary ("+CRL_MIN.toString()+"," +CRL_MAX.toString()+").",
                crlValue >= CRL_MIN  && crlValue <= CRL_MAX );
    }

    public String calculateEDDByDates(Integer crlValue, String ultrasoundDate)
    {
        // Crown-Rump Length value validation
        assertCRLBoundary(crlValue);

        // --- calculation formula stub --- //
        for (StatisticEntityObject t: table
        ) {
            if(crlValue.equals(t.getCRL()) && ultrasoundDate.equals(t.getULTRASOUND_DATE())) {
                return t.getEDD();}
        }
        // --------------------------- //

        return null;
    }
}
