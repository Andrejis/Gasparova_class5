public class Riaditel extends Osoba {

    private String aPohlavie;

    public Riaditel(String paMeno, int paVek, String paPohlavie) {
        super(paMeno, paVek);
        this.aPohlavie = paPohlavie;
    }

    public String getaPohlavie() {
        return aPohlavie;
    }

    public void setaPohlavie(String paPohlavie) {
        this.aPohlavie = paPohlavie;
    }

    public void prijimamUcitelov(){
        System.out.println("Prijimam novych ucitelov na skole :) ");
    }

    @Override
    public void chodDoSkoly() {
        System.out.println("Idem do riaditelne.");
    }
}
