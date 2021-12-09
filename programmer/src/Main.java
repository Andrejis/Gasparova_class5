import sun.dc.path.PathError;

import java.util.ArrayList;

public class Main {



    ic class Main {
        public static void main (String[] args) {
            Person p = Person ("Jozo", "Hluchy");
            System.out.println(p);

            ArrayList<Programmer> programatori = new ArrayList<>();
            programatori.add(new Programmer("Ferko", "Hlavny", "firma1"));
            programatori.add(new Programmer("Dusko", "milz", "firma2"));
            programatori.add(new Programmer("fulu", "haha", null));

            System.out.println("pocet programatorov je" + programatori.size());
            System.out.println(programatori.get(0).toString());
            programatori.remove(0);
            programatori.clear();

            Dancer d = new Dancer("misa", "hlucha", "najskup");

            ArrayList<Person> osoby = new ArrayList<>();
            osoby.add(p);
            osoby.add(d);

        }
    }
}
