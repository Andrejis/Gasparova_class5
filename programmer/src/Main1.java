import Person.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
        ArrayList<Programmer> programatori = new ArrayList<>();
        programatori.add(new Programmer("Ferko", "Znalec", "Avast"));
        programatori.add(new Programmer("Jano", "Holy", "Eset"));
        programatori.add(new Programmer("Karol", "Krajec", null))
        System.out.println("Pocet programatorov je " + programatori.size());
        System.out.println(programatori.get(0).toString());
        programatori.remove(0);
        programatori.clear();

        Dancer d = new Dancer("misa", "hlucha", "najskup");

        ArrayList<Person> osoby = new ArrayList<>();
        osoby.add(p);
        osoby.add(d);
        osoby.add(new Programmer("jullo", "jako", null));


        for (int i = 0; i < osoby.size(); i++) {
            if (osoby.get(i) instanceof Programmer) {
                System.out.println("je to programator");
            }
        }
    }
}