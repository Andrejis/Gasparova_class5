public class programovanie1 {
  /* 01.Vytvorte metódu, ktorá overí a vypíše, či je Jožko hladný.
    Vstupné parametre: boolean malTrening, int pocetRozkov
    Jožkovi stačí zjesť aspoň 3 rožky, ak nemal tréning.
    Po tréningu je však viac hladný, a tak potrebuje zjesť aspoň 5 rožkov.

    Výpisy môžu byť nasledovné:
            "Jožko je hladný, pretože mal tréning a potrebuje viac rožkov."
            "Jožko nie je hladný, aj keď mal tréning."
            ...

    Otestujte metódu pre tieto 4 situácie:
            1) mal tréning, zjedol 6 rožkov
    2) mal tréning, zjedol 4 rožky
    3) nemal tréning, zjedol 2 rožky
    3) nemal tréning, zjedol 3 rožky

    */

    public static void jeJozkoHladny(boolean paTrening, int paPocetRozkov) {
        if (!paTrening && paPocetRozkov >= 3) {
            System.out.println("Jozko nie je hladny");
        } else if (!paTrening && paPocetRozkov < 3) {
            System.out.println("jozko je hladny")
        }
    }


}
