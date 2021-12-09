public class Clovek {


    private int aMeno;
    private String aPriezvisko;
    private boolean aTypVozidla;

    Clovek(int aMeno, String aPriezvisko, boolean aTypVozidla) {
        this.aMeno = paMeno;
        this.aPriezvisko = paPriezvisko;
        this.aTypVozidla = paTypVozidla;

        this.aMeno = "Jozef";
        this.aPriezvisko = "Malo";
        this.aTypVozidla = AUTO;


        public int  getaMeno(){
         return this.aMeno;
}
        public static void setaMeno(int paMeno){
       this.aMeno = paMeno;
}
        public String getaPriezvisko(){
        return this.aPriezvisko;
}
        public static void setaPriezvisko(String paPriezvisko){
            this.aPriezvisko = paPriezvisko;
}

        public boolean  getaTypVozidla(){
        return this.paTypVozidla;
}
        public static void setaTypVozidla(boolean paTypVozidla){
            this.aTypVozidla = paTypVozidla;
}
        System.out.println("vola sa" + paMeno + " " + paPriezvisko);
        System.out.println("typ vozidla je" + paTypVozidla);