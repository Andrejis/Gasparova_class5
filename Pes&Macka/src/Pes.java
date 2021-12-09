public class Pes extends Zviera {
    private String aAMenoMajitela;

    private String aMeno;
    private String VydajZvuk;
    private String kracaj;

    public pes (String paMeno, String paMenoMajitela) {
        hugo (paMeno)

    }


    public String getaMeno() {
        return aMeno;
    }
    public void setaMeno(String aMeno) {
        this.aMeno = aMeno;
    }

    public void vydajZvuk() {
        System.out.println("mnau");
    }
}

}