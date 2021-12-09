public class Dancer extends Person {
    private String aGroupName;
    private String aMeno;
    private String aPriezvisko;

    public Dancer(String paMeno, String paPriezvisko, String aGroupName) {
        super(paMeno, paPriezvisko);
        this.aGroupName = aGroupName;
    }

    public String getaGroupName() {
        return aGroupName;
    }

    public void setaGroupName(String aGroupName) {
        this.aGroupName = aGroupName;
    }

    @Override
    public String toString() {
        return super.toString() + " a tancuje v " + this.aGroupName;
    }
}


