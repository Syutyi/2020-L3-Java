public class NamedPair<T> extends PairExo4<T> {
    private String name;

    /**
     * Cosntructeur
     * @param first issu de la classe mère
     * @param second idem
     * @param name attribut propre à la classe fille
     */
    public NamedPair(T first, T second, String name) {
        super(first, second);                               // Héritage de la classe mère
        this.name = name;
    }

    public void display() {
        super.display();                                    // Affichage de la classe mère
        System.out.println("Nom :" + name);
    }
}
