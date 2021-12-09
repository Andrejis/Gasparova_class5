public class person {
    private String aMeno;
    private String aPriezvisko;
    private Povolanie aPovolanie;
    private boolean Walk;
    private boolean Stop;

    public person(String paMeno, String paPriezvisko, Povolanie paPovolanie) {
        this.aMeno = paMeno;
        this.aPriezvisko = paPriezvisko;
        this.aPovolanie = paPovolanie;
    }

    public person () {
        this.aMeno = "Steve";
        this.aPriezvisko = "Jones";
        this.aPovolanie = Povolanie.PROGRAMATOR;
    }


    public void setMeno(String paMeno) {
        this.aMeno = paMeno;
    }
    public String getMeno() {
        return this.aMeno;
    }
    public void setPriezvisko(String paPriezvisko) {
        this.aMeno = paPriezvisko;
    }
    public String getaPriezvisko() {
        return this.aPriezvisko;
    }

    public void walk() {
        System.out.println("walking");
    }

    public void stop() {
        System.out.println("stoping");
    }

    public void vypisInfo () {
        System.out.println(this.aMeno + " " + this.aPriezvisko + " je" + this.aPovolanie);
    }

}
