import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicule implements Comparable<Vehicule> {

    private int numeroImmatriculation;
    private double jauge = 0.0;
    private double consommationKm = 0;
    private Compteur compteurKm = new Compteur();
    private Info_auto caracteristique;

    private final static double CAPACITE = 50.0;
    private static int REGISTRE = 0;

    // Méthode de constructeur avec pour paramètre la consommation
    Vehicule(double consommationKm, int serie, String modele, String marque)
    {
        this.numeroImmatriculation = REGISTRE;
        this.consommationKm = consommationKm;
        REGISTRE++;                             // Le type int peut être modifié sans que cela affecte d'autres choses
        this.caracteristique = new Info_auto(serie,modele,marque);
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

    public int getSerie() {
        return this.caracteristique.getSerie();
    }

    public String getModele() {
        return this.caracteristique.getModele();
    }

    public String getMarque() {
        return this.caracteristique.getMarque();
    }

    public Date getDateCirculation() {
        return this.caracteristique.getDateCirculation();
    }

    public String getDateInProperFormat()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'à ' HH:mm:ss z");
        return formatter.format(this.caracteristique.getDateCirculation());
    }

    public static int getREGISTRE() {
        return REGISTRE;
    }

    void mettreDeLessence(double essence) {
        if(essence < 0) return;                         // On ne peut pas mettre de l'essence négative
        if(this.jauge + essence > CAPACITE) {
            System.out.println("Votre réservoir a une capacité insuffisante pour mettre "+essence+" d'essence");
            return;
        }
        this.jauge += essence;                          // Cas sans exception
    }

    void faireLePlein() {
        this.jauge = CAPACITE;                          // La jauge va la capacité maximale
    }

    double rouler(double distanceParcourue) {
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
                +"; jauge = " + this.jauge +
                this.caracteristique.toString();
    }

    @Override
    public int compareTo(Vehicule o) {                          // Comparer les véhicules selon leur numéro immatriulation
        return ( (this.numeroImmatriculation == o.numeroImmatriculation) ? 0 :
                ( (numeroImmatriculation < o.numeroImmatriculation) ? -1 : 1 ) );
    }
}

