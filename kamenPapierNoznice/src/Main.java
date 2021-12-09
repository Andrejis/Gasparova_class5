import com.sun.javafx.geom.Curve;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Curve sc;

    public static void main(String[] args) {
        Hrac hrac1 = new Hrac("Simona");
        Hrac hrac2 = new Hrac("Fero");

        Scanner ec = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Zadaj svoje meno:");
        String meno = sc.next();
        Hrac hrac = new Hrac(meno);
        Hrac hracPC = new Hrac("PC");


        while (true) {
            System.out.println("Vyber si; ");
            System.out.println("k (kamen), P (papier), N (noznice)");
            String moznost = sc.next();
            int moznostPC = r.nextInt(3);
            System.out.println(moznostPC);
            Moznosti mojaMoznost;
            hrac.setPoslednaMoznost(mojaMoznost);


            switch (mojaMoznost) {
                case "K":
                    hrac.setPoslednaMoznost(Moznosti.KAMEN);
                    break;
                case "P":
                    hrac.setPoslednaMoznost(Moznosti.PAPIER);
                    break;
                case "N":
                    hrac.setPoslednaMoznost(Moznosti.NOZNICE);
                    break;
                default:
                    System.out.println("Taka moznost neexistuje.");
            }

            switch (moznostPC) {
                case 1:
                    hrac.setPoslednaMoznost(Moznosti.KAMEN);
                    break;
                case 2:
                    hrac.setPoslednaMoznost(Moznosti.PAPIER);
                    break;
                case 3:
                    hrac.setPoslednaMoznost(Moznosti.NOZNICE);
                    break;
        }

        hrac.porovnaj(hracPC);
            System.out.println("Pocet tvojich vyhier: " + hrac.getPocetVyhier());
    }
}

