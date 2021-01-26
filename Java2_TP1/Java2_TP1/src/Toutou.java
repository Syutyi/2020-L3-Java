public class Toutou {
    private String nom;
    private int nombrePuces;

    public Toutou(String n, int np)
    {
        if(n == null || np < 0)
            throw new IllegalArgumentException();
        this.nom = n;
        this.nombrePuces = np;
    }

    @Override
    public String toString() {
        return ("Ce chien s'appelle " + this.nom
                + " et il a " + this.nombrePuces
                + " puces");
    }
}