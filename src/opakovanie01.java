import java.util.Scanner;

public class opakovanie01 {
    private static int i;

    public static <scanner> void main(String[] args) {

             /* Scanner sc = new Scanner(System.in);
            int cislo = Integer.parseInt(sc.nextLine());

            //01. Napíšte program, ktorý vyhodnotí, či je zadané číslo z konzoly z rozmedzia 20 až 30 Ak do rozmedzia patrí, tak vypíšte, že tam patrí
            //Ak do rozmedzia nepatrí, tak sa vypíše, či je nad rozmedzím, alebo pod.

            if (cislo >= 20 && cislo <= 30) {
                System.out.println("Cislo" + cislo + "patri do <20, 30>");
            } else if (cislo < 20) {
                System.out.println("Cislo" + cislo + "je pod intervalom.");
             } else {
                System.out.println("Cislo" + cislo + "je nad intervalom.");
             }

            //02. vypíšte čísla od 1 po 1000 a ku každému vypíšte, či je párne alebo nepárne.

             for (int i = 1; i <= 1000; i++) {

            System.out.print(i);
            if (i % 2 == 0) {
                System.out.println("je parne");
            } else {
                System.out.println("je neparne");
            }

            //03. Pomocou cyklu FOR vypíšte nasledovné znaky
            //00
            //-11-
            //--22--
            //---33---
            //----44----
            //-----55-----
            //------66------
            //-------77-------
            //--------88--------
            //---------99---------

            String pomlcky = "";
            for (int i = 0; i < 10; i++) ;
            System.out.println(pomlcky + i + "" + i + pomlcky);
            pomlcky = pomlcky + "-";

            //04. Pomocou cyklu WHILE vypíšte nasledovné riadky:
            //číslo 1
            //číslo 2
            //číslo 3
            //číslo 4
            //číslo 5

            int cislo3 = 1;
            while (cislo3 <= 5) {
                System.out.println("cislo" + cislo3);
                cislo3 = cislo3 + 1;
            }

            // 05. Vytvorte dvojrozmerné pole s veľkosťou 5 x 5, ktoré bude v sebe uchovávať hodnoty typu String.
            // Naplňte všetky políčka textom "Prázdne".
            // Následne uložte 3 ľubovoľné slová na tieto pozície:
            // 1. riadok, 4. stĺpec
            // 0. riadok, 2. stĺpec
            // 3. riadok, 0. stĺpec
            // Vypíšte všetky hodnoty tohto poľa tak, aby každý riadok pola bol vypísaný v novom riadku.

            String[][] poleStringov = new String[5][5];
            for (int riadok = 0; riadok <= 4; riadok++) {
                for (int stlpec = 0; stlpec < 5; stlpec++) {
                    poleStringov[riadok][stlpec] = "prazdne";
                    System.out.print(poleStringov[riadok][stlpec]);
                }
            }

            // 06. Vytvorte metódu na súčet 2 čísel (a+b)
            //Vypíšte výsledok súčtu 5+6. (Nepoužívajte znamienko + ale vašu vytvorenú metódu)

            sucet(5, 6);

                System.out.println(sucetBezVypisu(4, 2));

                String text = "Ahoj";
                vypis("Este 45 minut", 10);
                vypis(text,5);
            }

            private static void vypis(String s, int i) {

            }

            public static void sucet ( int paCislo1, int paCislo2){
                int sucet = paCislo1 + paCislo2;
                System.out.println("Sucet je " + sucet);
            }
                 public static int sucetBezVypisu ( int paCislo1, int paCislo2) {
                     return paCislo1 + paCislo2;
            }


            //07. Vytvorte metódu, do ktorej zadáte reťazec (String) a číslo, koľkokrát pod seba sa má vypísať daný reťazec.


            //08. Vytvorte metódu, do ktorej zadáte reťazec (String) a metóda ho vypíše. Ak sa však v reťazci nachádzajú písmená a (malé/veľké), nevypíše ich.
            //Napr.: Zadám "ahoj, ako sa mas?" a metóda vypíše: hoj, ko s ms?

            public static void vypisBezA(String paText) {
                for (int i = 0; i < paText.length(); i++) {
                    if (paText.charAt(i) != 'a') {
                        System.out.println(paText.charAt(i));

             */

            //09. Vytvorte jednorozmerné pole a naplňte ho 10 ľubovoľnými číslami.
            //Postupne do riadkov vypíšte každé z týchto čísel a vypíšte aj informáciu, či je číslo (ne)párne a či je deliteľné číslom 3.
            //Takže napr. pre pole {5, 3, 9, 4} by bol výpis nasledovný:

            //5 - nepárne - nie je deliteľné 3
            //3 - nepárne - je deliteľné 3
            //9 - nepárne - je deliteľné 3
            //4 - párne - nie je deliteľné 3

            int[] pole = {4,3,5,6,1,7,8,6,10,9};
            for (int i = 0; i < pole.length; i++)
                System.out.print(pole[i]);

                if (pole[i] % 2 == 0) {
                    System.out.print("parne");
                } else {
                    System.out.print("neparne");
                }
                if (pole[i] % 3 == 0) {
                    System.out.print("je delitelne 3");
                } else {
                    System.out.print("nie je delitelne 3");
                }
                    System.out.println();


                }
            }







