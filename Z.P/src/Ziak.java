import java.util.ArrayList;

public class Ziak extends Osoba {

    private int aTrieda;
    private ArrayList<Integer> aZnamky;

    public Ziak(String paMeno, int paVek, int paTrieda) {
        super(paMeno, paVek);
        this.aTrieda = paTrieda;
        this.aZnamky = new ArrayList<>();
    }

    public void pridajZnamku( int paZnamky){
        this.aZnamky.add(paZnamky);
    }

    public void vypisVsetkyZnamky(){
        int poradie = 0;
        while(poradie < this.aZnamky.size()){
            System.out.println(this.aZnamky.get(poradie));
            poradie++;
        }
    }

    public int getaTrieda() {
        return aTrieda;
    }

    public void setaTrieda(int paTrieda) {
        this.aTrieda = paTrieda;
    }

    public void neodpisujem(){
        System.out.println("NIKDY neodpisujem :) ");
    }

    @Override
    public void chodDoSkoly() {
        super.chodDoSkoly();
        System.out.println("Idem do triedy" + this.aTrieda);
    }
}
