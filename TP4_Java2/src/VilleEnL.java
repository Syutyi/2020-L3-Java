import java.util.function.Predicate;

public class VilleEnL implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if(s.length() == 0) return false;   // Si la chaîne de caractère est vide, c'est forcément faux
        return s.charAt(0) == 'L';
    }
}
