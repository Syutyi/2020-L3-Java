import java.util.function.Predicate;

public class VilleAucune implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return false;                       // Aucune ville affichée
    }
}
