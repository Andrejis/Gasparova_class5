import jdk.nashorn.internal.objects.NativeString;

public class ProsimRobSiDoSvojhoTotoJeMoje {
    public static void main(String[] args) {


  /*      /*
  pole so 100 skrinkami
  boolean (true,false)
  int (0,1)
  String (0,Z)
  ...

        int pocetSkriniek = 100;
        boolean[] skrinky = new boolean[pocetSkriniek];

        for (int skrinka = 0; skrinka < skrinky.length; skrinka++) {
            skrinky[skrinka] = true;
        }
        for (int poradie = 2; poradie < skrinky.length; poradie++) {
        }
        for (int skrinka = 0; skrinka < skrinky.length; skrinka++) {
            System.out.println(skrinky[skrinka]);

            if (skrinka % poradie == 0) {
                skrinky[skrinka] = !skrinky[skrinka];
                System.out.println("Zmena na" + skrinky[skrinka]);

            }
        }

        for (int skrinka = 0; skrinka < skrinky.length; skrinka++) {
            if (skrinky[skrinka]) {
                System.out.println(skrinka);

            }
        }

   /*
public static boolean kontrolaZnakov(String paText){

            for (int i = 0; i < paText.length(); i++) {
                if (paText.charAt(i) == 'x') {
                    pocetX++;
                } else if (paText.toLowerCase(). charAt(i) == '0') {                        kaslem na to
                    pocetO++;
                }
            }

   */


           /* if (pocetX == pocetO) {
                return true;
            } else {
                return false;

            return pocetX == pocetO;

            }
        }
    }

            */


        //pole 10 celych cisel
        //hladany sucet
        //najst ake 2 cisla ktore davaju spolu hladany sucet

        int[] pole = {4, 3, 5, 1, 7, 8, 6, 10, 9, 2};
        int hladanySucet = 12;
        for (int i = 0; i < pole.length; i++)
            System.out.print("porovnavam cislo" + pole[i]
                    + "z pozicie" + i);
             for (int j = 0; j < pole.length; j++) {
                 System.out.print("...s cislom" + pole[j]);
                 if (pole[i] + pole[j] == hladanySucet) {
                System.out.println(pole[i] + "," + pole[j]);

            }
        }
    }
}












