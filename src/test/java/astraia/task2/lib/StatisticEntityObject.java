package astraia.task2.lib;

public class StatisticEntityObject {

    private Integer CRL;
    private String ULTRASOUND_DATE;
    private String EDD;

    public StatisticEntityObject(String ultrasoundDate, Integer crl, String edd) {
        this.ULTRASOUND_DATE = ultrasoundDate;
        this.CRL = crl;
        this.EDD = edd;
    }

    public Integer getCRL() {
        return CRL;
    }

    public String getULTRASOUND_DATE() {
        return ULTRASOUND_DATE;
    }

    public String getEDD() {
        return EDD;
    }
}
