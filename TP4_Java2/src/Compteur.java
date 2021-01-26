public class Compteur {

    // Attributs de classe
    private int totalisateur;
    private int partiel;

    private final static int CONSTANTE_CLASSE = 1000;

    // Constructeur sans paramètre
    Compteur() {
        this.partiel = 0;
        this.totalisateur = 0;
    }

    // Méthodes publiques d'accès en lecture
    public int getTotalisateur() {
        return totalisateur;
    }
    public int getPartiel() {
        return partiel;
    }

    private void resetPartiel() {
        this.partiel = 0;
    }

    // Méthode d'écriture
    public void setPartiel(int partiel) {
        this.partiel = partiel;
    }

    void add(int nbKm) {
        if((this.partiel + nbKm) > CONSTANTE_CLASSE) resetPartiel(); // Remise à 0 si on atteint 1000
        partiel += nbKm;
        totalisateur += nbKm;
    }


    public String toString() {
        return "compteur = [ Totalisateur = " + this.totalisateur
                + " | Partiel = " + this.partiel + " ];";
    }
}

