import java.util.*;

public class Index extends TreeMap<String, TreeSet<Integer>> {      // doublons possibles donc MAP, le nom nous sert de clé
    public void add(Integer numeroPage, String mot) {

        TreeSet<Integer> pages = new TreeSet<>();                   // Pages uniques donc un TreeSet convient
        // Ajout de la page dans le Set
        pages.add(numeroPage);                                      // On ajoute la page aux pages de l'index

        // Ajout du set dans l'index
        this.put(mot, pages);                                       // On peut ainsi rentrer le mot dans la page souhaitée
    }


    public void display() {
        if(this.isEmpty()) {
            System.out.println("L'index est vide, rééssayez.");
            return;
        }
        // Parcours de l'index complet
        for(Map.Entry<String, TreeSet<Integer>> e : this.entrySet()) {
            System.out.print(e.getKey()+" : ");

            // Parcours des pages
        for(Integer page : e.getValue()) {
            System.out.print("page : "+page);
        }
        System.out.println();
        }
    }


    public TreeSet<Integer> search(String word) {
        if(this.containsKey(word)) {                                // On recherche le mot
            return this.get(word);
        }

        return null;
    }
    public void remove(String word) {
        this.remove(word);
    }

}