
    public class Hrac {
        private String aMeno;
        private Moznosti aPoslednaMoznost;
        private int aPocetVyhier;


        public Hrac(String paMeno) {
            this.aMeno = paMeno;
            this.aPocetVyhier++;
        }

        public void setMeno(String paMeno) {
            this.aMeno = paMeno;
        }

        public String getMeno() {
            return this.aMeno;
        }

public int getaPocetVyhier() {
            return this.aPocetVyhier;
}

        public Moznosti getPoslednaMoznost() {
            return this.aPoslednaMoznost;
        }

        public void setPoslednaMoznost(Moznosti paMoznosti) {

            this.aPoslednaMoznost = paMoznosti;
        }

        public void vypisInfo() {
            System.out.println(this.aMeno + ": " + this.aPoslednaMoznost);
        }

        public void porovnaj(Hrac paDruhyHrac) {
            System.out.println();
            System.out.println("**********************");
            System.out.println(this.aMeno + ": " + this.aPoslednaMoznost);
            System.out.println(paDruhyHrac.getMeno() + ":" + paDruhyHrac.getPoslednaMoznost());


            switch (aPoslednaMoznost) {
                case KAMEN:
                    switch (paDruhyHrac.getPoslednaMoznost()) { // možnosť 2.hráča
                        case KAMEN:
                            System.out.println("REMÍZA");
                            break;
                        case PAPIER:
                            System.out.println("Vyhral hráč " + paDruhyHrac.getMeno());
                            this.aPocetVyhier++;
                            break;
                        case NOZNICE:
                            System.out.println("Vyhral hráč " + this.aMeno);
                            break;
                    }
                    break;
                case PAPIER:
                    switch (paDruhyHrac.getPoslednaMoznost()) { // možnosť 2.hráča
                        case KAMEN:
                            System.out.println("Vyhral hráč " + this.aMeno);
                            break;
                        case PAPIER:
                            System.out.println("REMÍZA");
                            break;
                        case NOZNICE:
                            System.out.println("Vyhral hráč " + paDruhyHrac.getMeno());
                            break;
                    }
                    break;
                case NOZNICE:
                    switch (paDruhyHrac.getPoslednaMoznost()) { // možnosť 2.hráča
                        case KAMEN:
                            System.out.println("Vyhral hráč " + paDruhyHrac.getMeno());
                            break;
                        case PAPIER:
                            System.out.println("Vyhral hráč " + this.aMeno);
                            break;
                        case NOZNICE:
                            System.out.println("REMÍZA");
                            break;
                    }
                    break;
            }
        }
    }

















