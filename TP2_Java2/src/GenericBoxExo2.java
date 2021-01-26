public class GenericBoxExo2
        <Nonum extends String, Num extends Number,
                Iter extends Iterable<element>,
                Comp extends Comparable<element>, element> {

    // x, y et z d'un même type
    private Nonum x;
    private Num y;
    private Iter z;
    private Comp w;

    /** Constructeur des
     * @param x de type non numérique
     * @param y numérique
     * @param z itérable
     * @param w comparable
     */

    public GenericBoxExo2(Nonum x, Num y, Iter z, Comp w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    /** Getters **/

    public Nonum getX() {
        return this.x;
    }

    public Num getY() {
        return this.y;
    }

    public Iter getZ() {
        return this.z;
    }

    public Comp getW() {
        return this.w;
    }

    @Override
    public String toString() {
        return "x = " + String.valueOf(this.x) +
                ", y = " + String.valueOf(this.y) +
                ", z = " + String.valueOf(this.z) +
                ", w = " + String.valueOf(this.w);
    }

    /** Méthode d'affichage **/
    public void display()
    {
        System.out.println(this.toString());
    }

    // Vérification si un objet est égal à un autre
    public boolean equals(Object o)
    {
        if(o instanceof GenericBoxExo2)
        {
            return (x.equals(((GenericBoxExo2<Nonum,Num,Iter,Comp,element>)o).x) &&
                    y.equals(((GenericBoxExo2<Nonum,Num,Iter,Comp,element>)o).y) &&
                    z.equals(((GenericBoxExo2<Nonum,Num,Iter,Comp,element>)o).z) &&
                    w.equals(((GenericBoxExo2<Nonum,Num,Iter,Comp,element>)o).w));
        }
        System.out.println("Respectez les paramètres !");
        return false;
    }

    public void egaux(Object o2)
    {
        if (this.equals(o2))
        {
            System.out.println("Les objets sont égaux !");
        }
        else
        {
            System.out.println("Les objets sont différents !");
        }
    }

}
