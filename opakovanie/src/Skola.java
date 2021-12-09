public class Skola {

    // nazov
    // adresa
    // rok vzniku
    // pocet ziakov

    //konstruktor, gettery, settety, toString
    // PridajNovychZiakov (parameter kolkoaZiakov) + kontrola na zaporne cisla


    protected String aNazov;
    protected String aAdresa;
    protected int aRokVzniku;
    protected int aPocetZiakov;

    public Skola(String aNazov, String aAdresa, int aRokVzniku, int aPocetZiakov) {
        this.aNazov = aNazov;
        this.aAdresa = aAdresa;
        this.aRokVzniku = aRokVzniku;
        this.aPocetZiakov = aPocetZiakov;
    }

    public Skola(String ssosza, String aAdresa, String s) {
    }

    public String getaNazov() {
        return aNazov;
    }

    public int getaPocetZiakov() {
        return aPocetZiakov;
    }

    public int getaRokVzniku() {
        return aRokVzniku;
    }

    public String getaAdresa() {
        return aAdresa;
    }

    public void setaAdresa(String aAdresa) {
        this.aAdresa = aAdresa;
    }

    public void setaNazov(String aNazov) {
        this.aNazov = aNazov;
    }

    public void setaPocetZiakov(int aPocetZiakov) {
        this.aPocetZiakov = aPocetZiakov;
    }

    public void setaRokVzniku(int aRokVzniku) {
        this.aRokVzniku = aRokVzniku;
    }

    @Override
    public String toString() {
        return "Skola{" +
                "aNazov='" + aNazov + '\'' +
                ", aAdresa='" + aAdresa + '\'' +
                ", aPocetZiakov=" + aPocetZiakov +
                '}';

        //arrayList skol
        // pridat 3 skoly s lubovolnymi hodnotami
        // zmente poslednej skole nazov
        //pridajte prvej skole 50 ziakov
        // vzpiste info p kazdej skole
        // vymazte poslednu skolu
        // vypiste pocet skol
        // vymazte vsestky skoly


    }

    public void setNazovSkoly(String neznama_skola) {
    }

    public void pridajNovychZiakov(int i) {
    }
}


