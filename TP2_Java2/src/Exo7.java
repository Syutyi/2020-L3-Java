import java.util.Collection;
import java.util.Random;
public class Exo7 {
     public static <T> T retourneAleatoire(T a, T b) {
         Random rand = new Random();
         if(rand.nextInt() % 2 == 0)                    // Aléatoire, 2 choix possibles
             return a;
         return b;
        }

     public static <T> T getRandomInList(Collection<T> a, Collection<T> b, int position) {
         Collection<T> collection = retourneAleatoire(a, b);    // Aléatoire entre les listes a et b
         if(position >= collection.size())                      // Si position supérieure à la taille de la liste, pour éviter
             position = collection.size() - 1;                  // overflow, on prend le dernier élément
         return ( (T[])collection.toArray() )[position];
        }
}
