public class Vehicule implements Comparable<Vehicule> {

    private int numeroImmatriculation;
    private double jauge = 0.0;
    private double consommationKm = 0;
    private Compteur compteurKm = new Compteur();

    private final static double CAPACITE = 50.0;
    private static int REGISTRE = 0;

    // Méthode de constructeur avec pour paramètre la consommation
    public Vehicule(double consommationKm)
    {
        this.numeroImmatriculation = REGISTRE;
        this.consommationKm = consommationKm;
        REGISTRE++;                             // Le type int peut être modifié sans que cela affecte d'autres choses
    }

    /** METHODE DE LECTURE DES ATTRIBUTS D'INSTANCE **/

    public Compteur getCompteurKm() {
        return compteurKm;
    }

    public static double getCAPACITE() {
        return CAPACITE;
    }

    public double getConsommationKm() {
        return consommationKm;
    }

    public double getJauge() {
        return jauge;
    }

    public int getNumeroImmatriculation() {
        return numeroImmatriculation;
    }

    public static int getREGISTRE() {
        return REGISTRE;
    }

    public void mettreDeLessence(double essence) {
        if(essence < 0) return;                         // On ne peut pas mettre de l'essence négative
        if(this.jauge + essence > CAPACITE) {
            System.out.println("Votre réservoir a une capacité insuffisante pour mettre "+essence+" d'essence");
            return;
        }
        this.jauge += essence;                          // Cas sans exception
    }

    public void faireLePlein() {
        this.jauge = CAPACITE;                          // La jauge va la capacité maximale
    }

    public double rouler(double distanceParcourue) {
        if(distanceParcourue < 0) return 0;
        if(distanceParcourue > this.jauge/this.consommationKm) distanceParcourue = this.jauge/this.consommationKm;
        // Pour avoir la distance maximale parcourue, il faut la jauge actuelle divisée par la consommation en kilomètre
        // On ne peut l'exécéder
        this.compteurKm.add((int)distanceParcourue);
        this.jauge -= distanceParcourue * consommationKm;        // Produit en croix distance = conso/consoKm => conso = distance * consoKm
        System.out.println("Le véhicule "+this.numeroImmatriculation+" a parcouru "+distanceParcourue);
        return distanceParcourue;
    }

    public String toString() {
        return "Véhicule " + this.numeroImmatriculation + " : "+ this.compteurKm.toString()
                +"; jauge = " + this.jauge +"\n";
    }

    @Override
    public int compareTo(Vehicule o) {                          // Comparer les véhicules selon leur numéro immatriulation
        return ( (this.numeroImmatriculation == o.numeroImmatriculation) ? 0 :
                ( (numeroImmatriculation < o.numeroImmatriculation) ? -1 : 1 ) );
    }
}
