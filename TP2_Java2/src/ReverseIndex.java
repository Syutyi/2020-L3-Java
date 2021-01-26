import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReverseIndex extends TreeMap<Integer, TreeSet<String>> {   // Chercher par page

    public ReverseIndex(Index index) {
        if(index.isEmpty()) {
            System.out.println("L'index est vide");
            return;
        }

        // Rentrer tous les mots dans le nouveau tableau
        for(Map.Entry<String, TreeSet<Integer>> e : index.entrySet()) {
            for(Integer page : e.getValue()) {
                this.add(page, e.getKey());
            }
        }
    }

    private void add(Integer page, String key) {
        TreeSet<String> words = new TreeSet<String>();
        words.add(key);
        this.put(page, words);
    }


    public TreeSet<String> search(int page) {
        if(this.containsKey(page)) {                // Si on trouve la page, on retourne le contenu de la page
            return this.get(page);
        }
        return null;
    }

    public void display() {
        // V�rification d'existance d'�l�ments
        if(!this.isEmpty()) {
            // Parcours des mots
            for(Map.Entry<Integer, TreeSet<String>> elmt : this.entrySet()) {
                System.out.print("P.");
                System.out.print(elmt.getKey());
                System.out.print(" :");

                // Parcours des pages
                for(String word : elmt.getValue()) {
                    System.out.print(" \"");
                    System.out.print(word);
                    System.out.print("\"");
                }
                System.out.println();
            }
        } else System.out.println("L'index est vide.");
    }
}

