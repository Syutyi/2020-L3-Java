public class NamedPoint extends PairExo4<Integer> {
    private String name;

    /**
     * Cosntructeur
     * @param first comme pour namedPair
     * @param second comme pour namedPair
     * @param name paramètre propre à cette classe, c'est à dire qu'il diffère de celui de NamedPair
     */
    public NamedPoint(int first, int second, String name) {
        super(first, second);
        this.name = name;
    }

    public void display() {
        super.display();
        System.out.println(name);
    }
}
