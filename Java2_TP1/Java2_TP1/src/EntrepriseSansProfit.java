public class EntrepriseSansProfit extends Entreprise {
    public EntrepriseSansProfit(String nom, int nbrEmployes, String mission) {
        super(nom,nbrEmployes,0.0,mission);
    }
    public double capital() throws NonProfitException {
        throw new NonProfitException();
    }
}

