import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pouzivatel p = new Pouzivatel();
        System.out.println(p.getaMeno());
        p.vypisInfo();

        /*
        ArrayList<Integer> cisla = new ArrayList<>();
        cisla.add(20);
        System.out.println(cisla.size());
        System.out.println("Na pozicii 0 je " + cisla.get(0));
        cisla.remove(0);
        System.out.println(cisla.size());
        */


        SocSiet siet = new SocSiet("Facebook");
        Pouzivatel p2 = new Pouzivatel("mrkva3", "heslo2", "Jozek", "Mrkva", Pohlavie.MUZ);
        Pouzivatel p3 = new Pouzivatel("skap", "heslo3", "Micho", "Veduci", Pohlavie.MUZ);
        Pouzivatel p4 = new Pouzivatel("sef", "heslo4", "Zuzka", "Nasa", Pohlavie.ZENA);

        siet.pridajPouzivatela(p2);
        siet.pridajPouzivatela(p3);
        siet.pridajPouzivatela(p4);
        siet.pridajPouzivatela(p);
        siet.vypisPocetPozivatelov();
        siet.vymazPouzivatela("skap");


        // arraylist Stringov
        // pridajte 3 lubovolne slova
        // vymazte 2. slovo
        // vypiste prve slovo

        // npr.: ArrayList<Integer> zoznam = new ArrayList<Integer>();

       /* ArrayList<String> zoznam = new ArrayList<String>();
        zoznam.add("pondelok");
        zoznam.add("havo");
        zoznam.add("kvet");
        zoznam.remove(1);
        System.out.println(zoznam.get(0));
        System.out.println(zoznam.size());


        */
        while (true) {
            System.out.println("SOCIALNA SIET:" + siet.getaNazov());
            System.out.println("[1] prihlasenie");
            System.out.println("[2] registracia");
            System.out.println("[3] odstrananie pouzivatela");
            System.out.println("[4] vypis poctu pouzivatelov");
            System.out.println("[5] hromadne pridanie");
            System.out.println("[6] info o vsetkych");

            Scanner sc = new Scanner(System.in);
            int moznost = sc.nextInt();
            switch (moznost) {
                case 1:
                    //prihlasnie
                    System.out.println("zadaj log: ");
                    String login = sc.nextLine();
                    System.out.println("zadaj heslo: ");
                    String heslo = sc.nextLine();
                    siet.prihlasenie(login, heslo);
                    break;


                case 2:
                    //registracia (pridajpouzivatela)
                    //login, heslo, meno, priezvisko, pohlavie
                    System.out.println("zadaj log: ");
                    String login2 = sc.nextLine();
                    System.out.println("zadaj heslo: ");
                    String heslo2 = sc.nextLine();
                    System.out.println("zadaj mneno: ");
                    String meno2 = sc.nextLine();
                    System.out.println("zadaj preizvisko: ");
                    String priezvisko2 = sc.nextLine();
                    System.out.println("zadaj pohlavie: ");
                    siet.prihlasenie(login2, heslo2);

                    break;
                case 3:
                    //odstranenie
                    System.out.print("Zadaj login: ");
                    String login3 = sc.nextLine();
                    siet.vymazPouzivatela(login3);
                    break;
                case 4:
                    //vypis
                    siet.vypisPocetPozivatelov();
                    break;
                case 5:
                    System.out.println("Kolko pouzivatelov chcete: ");
                    int pocet = sc.nextInt();
                    siet.hromadnePridanie(pocet);
                    break;
                case 6:
                    siet.vypisVsetkych();
                    break;
            }
        }
    }
}
