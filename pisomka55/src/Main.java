import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pouzivatel p = new Pouzivatel();

        ArrayList<Pouzivatel> Pouzivatelia = new ArrayList<>();

        Pouzivatelia.add(p1); //0
        Pouzivatelia.add(p2); //1
        Pouzivatelia.add(p3); //2

        Pouzivatel p1 = new Pouzivatel("jozef", 55, "jozik55");
        Pouzivatel p2 = new Pouzivatel("Nikola", 20,"niki22");
        Pouzivatel p3 = new Pouzivatel("Stano", 38,"stanulo65");

        p2.getaNick ();

        Pouzivatelia.remove(1);

        p1.setaVek(28);

        Pouzivatelia.clear();

        Pouzivatelia.add(new Admin());
        Pouzivatelia.add(new Admin());

    }
}
