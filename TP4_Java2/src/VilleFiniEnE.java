import java.util.function.Predicate;

public class VilleFiniEnE implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if(s.length() == 0) return false;   // Si la chaîne de caractère est vide, c'est forcément faux
        return s.charAt(s.length()-1) == 'e';
    }
}
