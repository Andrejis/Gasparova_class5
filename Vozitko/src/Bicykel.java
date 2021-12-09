public class Bicykel {
    private String aZnacka;
    private String aRokvyroby;
    private String aVrzga;

    public String getaZnacka() {
        return aZnacka;
    }
    public void setaZnacka(String aZnacka) {
        this.aZnacka = aZnacka;
    }


    public String getaRokvyroby() {
        return aRokvyroby;
    }
    public void setaRokvyroby(String aRokvyroby) {
        this.aRokvyroby = aRokvyroby;
    }

    public Bicykel (String paZnacka, String paRokVyroby) {
        this.aZnacka = "KTM";
        this.aRokvyroby = "2017";
    }

    public void setVrzga() {
        System.out.println("vzzzz vzzzz");
    }
}
