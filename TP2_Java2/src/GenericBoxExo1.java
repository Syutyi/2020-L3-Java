public class GenericBoxExo1<element> {

    // x, y et z d'un même type
    private element x;
    private element y;
    private element z;

    /** Constructeur des
     * @param x de type générique
     * @param y idem
     * @param z idem
     */

    public GenericBoxExo1(element x, element y, element z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /** Getters **/

    public element getX() {
        return this.x;
    }

    public element getY() {
        return this.y;
    }

    public element getZ() {
        return this.z;
    }

    @Override
    public String toString() {
        return "x = " + String.valueOf(this.x) +
                ", y = " + String.valueOf(this.y) +
                ", z = " + String.valueOf(this.z);
    }

    /** Méthode d'affichage **/
    public void display()
    {
        System.out.println(this.toString());
    }

    // Vérification si un objet est égal à un autre
    public boolean equals(Object o)
    {
        if(o instanceof GenericBoxExo1)
        {
            return (x.equals(((GenericBoxExo1<element>)o).x) && y.equals(((GenericBoxExo1<element>)o).y)
                && z.equals(((GenericBoxExo1<element>)o).z));
        }
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
