public class Osoba {

    private String aMeno;
    private int aVek;

    Osoba (String paMeno, int paVek){
        this.aMeno = paMeno;
        this.aVek = paVek;
    }

    public String getaMeno() {
        return aMeno;
    }

    public void setaMeno(String paMeno) {
        this.aMeno = paMeno;
    }

    public int getaVek() {
        return aVek;
    }

    public void setaVek(int paVek) {
        this.aVek = paVek;
    }

    public void jem (){
        System.out.println("Papam :) ");
    }

    public void chodDoSkoly(){
        System.out.println("Idem do skoly.");
    }
}
