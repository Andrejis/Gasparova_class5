public class Auto {
    private String aZnacka;
    private String aRokvyroby;
    private String aTrubi;

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

    public Auto (String paZnacka, String paRokVyroby) {
        this.aZnacka = "BMW";
        this.aRokvyroby = "2015";
    }

    public void setTrubi() {
        System.out.println("tuuut tuuut");
    }
}
