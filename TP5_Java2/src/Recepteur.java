import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class Recepteur {
    private String nom;
    private Vector<Chaine> vecteurChaine = new Vector<Chaine>(); // Vecteurs de chaines de télé

    // Constructeur avec nom
    public Recepteur(String nom)
    {
        this.nom = nom;
    }

    // Ajout de chaine au vecteur
    public void addChaine(Chaine chaine) {
        this.vecteurChaine.add(chaine);
    }

    // Afficher toutes les chaines du récepteur
    public void afficheChaine()
    {
        this.vecteurChaine.forEach(System.out::println);
    }

    // Supprimer une chaine
    public void suppChaine(Chaine chaine) {
        this.vecteurChaine.remove(chaine);
    }

    // Serialisation
    public void serialiserRecepteur() throws IOException {
        String nomfile = this.nom + ".txt";
        File fichier = new File(nomfile);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier));
        oos.writeObject(this.vecteurChaine);
        oos.flush();
        oos.close();
    }

    // Déserialisation
    public void deserialiserRecepteur(String filename, Recepteur recepteur) throws IOException, ClassNotFoundException {

        File fichier = new File(filename);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier));
        @SuppressWarnings("unchecked")
        Vector<Chaine> tableauChaine = (Vector<Chaine>) ois.readObject(); // Conversion
        recepteur.setVecteurChaine(tableauChaine);
        ois.close();
    }

    // Setter
    public void setVecteurChaine(Vector<Chaine> vecteurChaine) {
        this.vecteurChaine = vecteurChaine;
    }

    @Override
    public String toString() {
        String str ="[ " + this.nom + " : \n";
        for(Chaine chaine : vecteurChaine){ str += chaine.toString() ; }
        str += " ]";
        return str;
    }
}
