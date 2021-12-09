import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Skola> skoly = new ArrayList<>();
        skoly.add(new Skola("SSOSZA", "Salazianska 18", "2020"));
        Skola s = new Skola("gymnazium", "komenskeho", "1970");
        skoly.add(s);
        skoly.add(new Skola("FRI", "zilina", "1985"));
        skoly.get(skoly.size() - 1).setNazovSkoly("neznama skola");
        skoly.get(0).pridajNovychZiakov(50);

        skoly.add(new Biling("bilingvalne gymnazium", "nadrazna 82", 1992, 802, Jazyk.ANGLICKY, "certifikat 2003"));

        skoly.add(new Biling("jazykove gymnazium", "javornikova 4", 1989, 534, Jazyk.ANGLICKY, "certifikat 2015"));
    }

//znova napisat vsetky skoly zo zoznamu
    // poslat spravu vypisCertifikat iba tym skolam, ktore su bilingvalne (pouzit instanceof)


    for (int i = 0; i < skoly.size(); i++) {
        System.out.println(skoly.get(i).toString());
        if (skoly.get(i) instanceof Biling) {
            Biling
}
}
}
