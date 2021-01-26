import java.util.ArrayList;

public class Entreprise {
    private int nbrEmployes;
    private double capital;
    private String nom;
    private String mission;

    public String mission() throws SecretMissionException {
        return this.mission;
    }

    public double capital() throws NonProfitException {
        return this.capital;
    }


    class SecretMissionException extends Exception {
        // ...
        /**
         * Classes internes qui n'ont
         * ni fonctions particulières
         */
    }

    class NonProfitException extends Exception {
        // ...
        /**
         * ni attribut en particulier
         */
    }

    public Entreprise(String nom, int nbrEmployes, double capital, String mission) {
        this.nom = nom;
        this.nbrEmployes = nbrEmployes;
        this.mission = mission;
        this.capital = capital;
    }

    public static void afficherEntreprises(ArrayList<Entreprise> entreprises) {
        for(int i = 0; i < entreprises.size(); i++) {
            try {
                System.out.println("\n---------------------------------------------------------------------\n");
                System.out.println("Entreprise "+(i+1));
                System.out.println("Nom : "+entreprises.get(i).nom);
                System.out.println("Employés : "+entreprises.get(i).nbrEmployes);
                System.out.println("Mission :"+entreprises.get(i).mission());       // On regarde si exception
            } catch(SecretMissionException e) {
                System.out.println("Mission : La mission est secrete");
            }
            try
            {
                System.out.println("Capital : "+entreprises.get(i).capital()+"$");       // On regarde si elle fait du profit
            } catch(NonProfitException e) {
                System.out.println("Capital : Pas de profit");
            }
        }
    }
}
