public class Pouzivatel {

    protected String aMeno;
    protected int aVek;
    protected String aNick;
    protected String prihlasSa;


    public Pouzivatel(String aMeno, int aVek, String aNick) {
        this.aMeno = aMeno;
    }



    public String getaMeno() {
        return aMeno;
    }

    public String getaNick() {
        return aNick;
    }

    public int getaVek() {
        return aVek;
    }


    public void setaMeno(String aMeno) {
        this.aMeno = aMeno;
    }

    public void setaNick(String aNick) {
        this.aNick = aNick;
    }

    public void setaVek(int aVek) {
        this.aVek = aVek;
    }

    public void prihlasSa (String prihlasSa) {
        System.out.println("Prihlasujem sa");

    }


    @Override
    public String toString() {
        return "Pouzivatel{" +
                "aMeno='" + aMeno + '\'' +
                ", aVek=" + aVek +
                ", aNick='" + aNick + '\'' +
                '}';
    }


    public void setaZablokovany(boolean aZablokovany) {

    }
}
