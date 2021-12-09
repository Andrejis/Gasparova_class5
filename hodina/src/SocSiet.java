import java.util.ArrayList;
import java.util.Random;

public class SocSiet {
    private String aNazov;
    private ArrayList<Pouzivatel> aPouzivatel;
    public SocSiet (String paNazov) {
        this.aNazov = paNazov;
        this.aPouzivatel = new ArrayList<>();
    }
    public String getaNazov () {
        return this.aNazov;
    }
    public void setaNazov (String paNazov) {
        this.aNazov = paNazov;
    }
    public void pridajPouzivatela (Pouzivatel paPouzivatel) {
        aPouzivatel.add(paPouzivatel);
    }
    public void vypisPocetPozivatelov () {
        System.out.println("Socialna siet " + this.aNazov + " ma " + aPouzivatel.size() + " pouzivatelov. ");
    }
    public void vymazPouzivatela (String paLogin) {
        for (int i = 0; i < aPouzivatel.size(); i++) {
            Pouzivatel p = aPouzivatel.get(i);
            if (p.getaLogin().equals(paLogin)) {
                System.out.print("Pouzivatel bol odstraneny: ");
                p.vypisInfo();
                aPouzivatel.remove(i);
                return;
            }
        }
        System.out.println("Taky pouzivatel neexistuje. ");
    }
    public void prihlasenie (String paLogin, String paHeslo) {
        for (int i = 0; i < aPouzivatel.size(); i++) {
            Pouzivatel p = aPouzivatel.get(i);
            if (p.getaLogin().equals(paLogin)) {
                p.getaHeslo().equals(paHeslo);
                System.out.println("Heslo je spravne, ");
            } else {
                System.out.println("Nespravne heslo ");
            }
            return;
        }
        System.out.println("Takyto pouzivatel neexistuje ");
    }


    public void hromadnePridanie (int paPocet) {
        Random r = new Random();
        for (int i = 0; i <= paPocet; i++) {
            int nahodenCislo = r.nextInt();
            Pouzivatel p7 = new Pouzivatel("login" + nahodenCislo,
                    "heslo" + nahodenCislo,
                    "meno" + nahodenCislo,
                    "prezvisko" + nahodenCislo,
                    Pohlavie.NEUVEDENE);
            pridajPouzivatela(p7);
        }
    }
    public void vypisVsetkych () {
        for (int k = 0; k < aPouzivatel.size(); k++) {
            System.out.print(k);
            aPouzivatel.get(k).vypisInfo();

        }
    }


}
