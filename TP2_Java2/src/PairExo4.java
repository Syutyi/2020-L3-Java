public class PairExo4 <T> {
    private T x;
    private T y;

    public PairExo4 (T first, T second) {
        x = first ; y = second ;
    }
    public void display () {
        System.out.println("Pair : (" + x + "," + y + ")");
    }
}
