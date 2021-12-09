import java.util.Scanner;

public class pisomka<stlpec, riadok> {

    public static void main(String[] args) {

    }

        //01 (2 body)
        //Vytvorte jednorozmerné pole a uložte doň 10 ľubovoľných čísel.
        //Vypíšte všetky tieto čísla pod seba a ku každému číslu vypíšte, či je párne alebo nepárne.
        // BONUS (1 bod): čísla nenapíšte ručne, ale vygenerujte ich náhodne.
        //-----------------------------------

        int[] pole = (1 ,3 ,5 ,6 ,8 ,9 ,0 ,4 ,2 ,10 );

        for (int i = 0; i < pole.length; i++) {
        System.out.println(pole[i]);
        if (pole[i] % 2 == 0) {
            System.out.println("parne");
        } else {
            System.out.println("neparne");
        }



       //02 (2 body)
       // Vytvorte dvojrozmerné pole s veľkosťou 5 x 5.
       // Do pola uložte tieto čísla:
        //1 1 1 1 1
       // 2 2 2 2 2
       // 3 3 3 3 3
       // 4 4 4 4 4
       // 5 5 5 5 5
       // (Pomôžte si cyklom, nevkladajte ich ručne :) )
       // Následne vypíšte celé pole.
       // -----------------------------------


    int [][] DvojrozmernePole = new DvojrozmernePole [5][5];

        for (int riadok = 0; riadok <= 5; riadok++) {
        System.out.println();
        for(int stlpec =0; stlpec < 5; stlpec++) {
          DvojrozmernePole 1[riadok] = "1";
          DvojrozmernePole 2[riadok] = "2";
          DvojrozmernePole 3 [riadok] = "3" ;
          DvojrozmernePole 4[riadok] = "4" ;
            System.out.print(DvojrozmernePole[riadok][stlpec]);
        }
        System.out.println();



       // 03 (2 body)
       // Vytvorte metódu na overenie veľkosti čísla.
        //Vstupný parameter: celé číslo
       // Metóda vypíše, či je číslo väčšie ako 100, menšie ako 100 alebo rovné 100.

        -----------------------------------
        Scanner sc = new Scanner(System.in);
     System.out.print("Zadaj cislo:");
     int cislo = Integer.parseInt(sc.nextLine());

     if (cislo > 100 ) {
         System.out.println("Cislo je vacsie ako 100.");
     } else if (cislo <) {
         System.out.println("Cislo je mensie ako 100");
     } else {
         System.out.println("Cislo je rovne 100");





        /*04 (2 body)
        Vytvorte metódu pre súčet 2 desatinných čísel
        Vstupné parametre: 2 desatinné čísla
        Metóda vypíše "celý príklad súčtu".
        Napr.: 3.21 + 4.11 = 5.32
        -----------------------------------

        */

        public static void sucet (int pacislo1, int pacislo2) {
        int sucet = pacislo1 + pacislo2;
        System.out.println("Sucet je" + " " + sucet);
        }


        /*05 (1 bod)
        Overte v maine vaše metódy z 3. a 4. úlohy a zavolajte ich pre ľubovoľné čísla.



