import java.util.function.Predicate;

public class VilleLogueur5 implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.length() == 5;
    }
}
