import com.sun.javaws.IconUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ucitel extends Osoba {

    private String aTitul;
    private Enum aPredmet;

    public Ucitel(String paMeno, int paVek, String paTitul, Enum paPredmet) {
        super(paMeno, paVek);
        this.aTitul = paTitul;
        this.aPredmet = paPredmet;
    }

    public String getaTitul() {
        return aTitul;
    }

    public void setaTitul(String paTitul) {
        this.aTitul = paTitul;
    }

    public Enum getaPredmet() {
        return aPredmet;
    }

    public void setaPredmet(Enum paPredmet) {
        this.aPredmet = paPredmet;
    }

    public void ucim(){
        System.out.println("Ucim :) ");
    }

    @Override
    public void chodDoSkoly() {
        super.chodDoSkoly();
        System.out.println("Idem do zborovne.");
    }
}
