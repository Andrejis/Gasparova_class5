import java.util.Random;

public class Turista {
    private String aMeno;
    private int aPrejdenaVzdialenost;

    public Turista(String paMeno) {
        this.aMeno = paMeno;
        this.aPrejdenaVzdialenost = 0;
    }


    public void setaMeno(String aMeno) {
        this.aMeno = aMeno;
    }

    public String getaMeno() {
        return aMeno;
    }

    public void setaPrejdenaVzdialenost(int aPrejdenaVzdialenost) {
        this.aPrejdenaVzdialenost = aPrejdenaVzdialenost;
    }

    public int getaPrejdenaVzdialenost() {
        return aPrejdenaVzdialenost;
    }

    public void pridajKroky(int paKolko) {
        this.aPrejdenaVzdialenost += paKolko;
        System.out.println(paKolko);
        System.out.println(this.toString());
    }

    public void vygenerujVzdialnesot(int paOd, int paDo) {
        Random r = new Random();
    }

    @Override
    public String toString() {
        return "Turista " + this.aMeno + "presiel" + this.getaPrejdenaVzdialenost() + "m";


    }

}
