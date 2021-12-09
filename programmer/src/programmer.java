public class Programmer extends Person{
    private String aMenoFirmy;
    private String aMeno;
    private String aPriezvisko;

    public Programmer (String paMeno, String paPriezvisko, String paMenoFirmy) {
        super (paMeno, paPriezvisko);
        this.aMenoFirmy = paMenoFirmy;
    }

    public String getaMenoFirmy() {
        return aMenoFirmy;
    }

    public void setaMenoFirmy(String aMenoFirmy) {
        this.aMenoFirmy = aMenoFirmy;
    }

    public void programuj (String paProgram, String paJazyk) {
        System.out.println("Programujem " + paProgram + " v " + paJazyk);
    }

    @Override
    public String toString() {
       String vypis = super toString();
       if (this.aCompanyName == null) {
           vypis += "nepracujete v ziadnej firme";
       }else {
           vypis += " a pracuje  v" + this.aCompanyName;
       }
       return vypis;
       }
    }
}
