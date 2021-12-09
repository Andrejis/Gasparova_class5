import java.util.Random;

public class Tura {
    public static void main(String[] args) {
        Turista t1 = new Turista("Jozo");
        Turista t2 = new Turista("Fero");
        Turista t3 = new Turista("Milo");

        Random rKroky = new Random();
        for (int i = 1; i < 100; i++) {
            System.out.println(hodkockov());
        }
    }

    public static int hodkockov() {
        Random r = new Random();
        return r.nextInt(6) + 1;


        while (t1.getaPrejdenaVzdialenost() <= 2500 && t2.getaPrejdenaVzdialenost() <= 2500 && t3.getaPrejdenaVzdiallenost() <= 2500) {
            switch (hodkockov()) {
                case 1:
                case 2:
                    Turista t1;
                    Random rKroky;
                    t1.pridajKroky(rKroky.nextInt(28 + 1 - 15) + 15);
                    break;
                case 3:
                case 4:
                    Turista t2;
                    t2.pridajKroky(rKroky.nextInt(34 + 1 - 22) + 22);
                    break;
                case 5:
                case 6:
                    Turista t3;
                    t3.pridajKroky(rKroky.nextInt(46 + 1 - 31) + 34);
                    break;
            }

            if (t1.getPrejdenaVzdialenost() >= 2500) {
                System.out.println("Vyhral" + t1.getaMeno());
            } else if {
                (t2.getPrejdenaVzdielnesot() >= 2500) {
                    System.out.println("Vyhral" + t2.getaMeno());
                }else{
                    System.out.println("Vyhral " + t3.getaMeno());
                }
            }
        }
    }
}