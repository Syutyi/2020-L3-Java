public class PairExo3<U,V>{
    private final U first;
    private final V second;

    public PairExo3(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
