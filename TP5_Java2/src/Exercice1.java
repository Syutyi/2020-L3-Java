import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercice1 {
    /**
     *
     * @param int1  premier entier
     * @param int2  deuxième entier
     * @param f1    1re fonction appliquée => devient double
     * @param f2    2e fonction appliquée => devient String
     * @return      Le résultat des deux fonctions
     */
    public static String puissance_chaine(int int1, int int2, BiFunction<Integer, Integer, Double> f1, Function<Double, String> f2) {
        String resultat = f1.andThen(f2).apply(int1, int2);
        return resultat;
    }

    public static <T, U, V, W> W fonction_convertir (T x, U y, BiFunction<T, U, V> f1, Function<V, W> f2) {
        W resultat = f1.andThen(f2).apply(x, y);
        return resultat;
    }

}
