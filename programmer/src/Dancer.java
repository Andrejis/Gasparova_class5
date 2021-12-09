public class Dancer extends Person{
    private String aMenoSkupiny;
    private String aMeno;
    private String aPriezvisko;

    public Dancer (String paMeno, String paPriezvisko, String paMenoSkupiny) {
        super (paMeno, paPriezvisko);
        this.aMenoSkupiny = paMenoSkupiny;
    }

    public String getaMenoSkupiny() {
        return aMenoSkupiny;
    }

    public void setaMenoSkupiny(String aMenoSkupiny) {
        this.aMenoSkupiny = aMenoSkupiny;
    }

    public void tancuj (String paOtocka, String paSkok) {
        System.out.println("Tancujem " + paOtocka+ " v " + paSkok);
    }

    @Override
    public String toString() {
        return super.toString() + " a pracuje v " + this.aMenoSkupiny;
    }
}

