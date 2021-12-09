public class Admin extends Pouzivatel {

    private String aMail;

    Admin = new Admin;

    public Admin (String aMeno, int aVek, String aNick, String aMail) {
        super (String aMeno, int aVek, String aNick) {
        this.aMail = aMail;

         }
    }
        public String getaMail() {
            return aMail;
        }

        public void setaMail(String aMail) {
            this.aMail = aMail;
        }

    @Override
    public String toString() {
        return "Admin{" +
                "aMail='" + aMail + '\'' +
                '}';
    }

    public void prihlasSa (String prihlasSa) {
        System.out.println("Prihlasujem sa ako Admin");

    }

    public void spravujPortal (String spravujPortal) {
        System.out.println("Spravujem portal");

    }

    public void zablokujPouzivatela(Pouzivatel paPouzivatel) {
        paPouzivatel.setaZablokovany(true);

    }


    public void prihlasSa() {
        super.prihlasSa();
        System.out.println("ako admin");
    }

    public void zablokujPouzivatela()
}


