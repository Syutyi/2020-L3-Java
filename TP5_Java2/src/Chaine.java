import java.io.Serializable;

public class Chaine implements Serializable {
    private int numero;
    private String nom;
    private int frequence;
    private char polarite;

    // Constructeur
    public Chaine(int numero, String nom, int frequence, char polarite) {
        this.numero = numero;
        this.nom = nom;
        this.frequence = frequence;
        this.polarite = polarite;
    }
    /*
     * Getters/Setters
     */
    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public int getFrequence() {
        return frequence;
    }

    public char getPolarite() {
        return polarite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }

    public void setPolarite(char polarite) {
        this.polarite = polarite;
    }

    @Override
    public String toString() {
        return "Chaine = [" + numero + ";" + nom + ";" + frequence + ";" + polarite
                + "]\n";
    }
}
