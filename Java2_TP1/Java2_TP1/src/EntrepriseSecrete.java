public class EntrepriseSecrete extends Entreprise {
    public EntrepriseSecrete(String nom, double capital, int nbrEmployes) {
        super(nom,nbrEmployes,capital,"Indéfini");
    }
    public String mission() throws SecretMissionException {
        throw new SecretMissionException();
    }
}
