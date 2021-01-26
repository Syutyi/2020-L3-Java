import java.util.function.Predicate;

public class VillePlusQue3 implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.length() > 3;
    }
}
