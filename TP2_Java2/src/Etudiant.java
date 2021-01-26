import java.util.TreeSet;

public class Etudiant  implements Comparable <Etudiant> {
    private Integer numeroEtudiant  = 0;
    private double noteProjet = 0.0;
    private double noteDE = 0.0;
    private double noteTP = 0.0;
    private Double moyenne = 0.0;

    public Etudiant(int numeroEtudiant, double noteProjet, double noteDE, double noteTP) {
        this.numeroEtudiant = numeroEtudiant;
        this.noteProjet = noteProjet;
        this.noteDE = noteDE;
        this.noteTP = noteTP;
        this.moyenne = (noteProjet * 3 + noteDE * 2 + noteTP * 2) / 7;
    }


    @Override
    public int compareTo(Etudiant o) {
        return (this.moyenne - o.moyenne == 0) ? numeroEtudiant.compareTo(o.numeroEtudiant) : (int) (this.moyenne - o.moyenne);
    }

    public static Etudiant meilleurEtudiant(TreeSet<Etudiant> etudiants) {
        Etudiant meilleurEtudiant = null;
        Double meilleurTP = 0.0;

        // On parcours la liste des étudiants
        for(Etudiant etudiant : etudiants) {
            if(etudiant.noteTP > meilleurTP) {
                meilleurTP = etudiant.noteTP;
                meilleurEtudiant = etudiant;
            }
        }
        return meilleurEtudiant;
    }

    @Override
    public String toString() {
        return ("Etudiant numéro " + this.numeroEtudiant +", note de TP de " + this.noteTP + ", note de DE de " + ", note de Projet de "+
                this.noteProjet + " et de moyenne "+ this.moyenne);
    }
}
