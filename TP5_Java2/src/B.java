public class B implements Cloneable {     // Il faut que l'objet B soit clonable donc on fait en sorte que B implémente Clonable
    private int x;
    public B(int i){
        x = i;
    }
    public Object clone()
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new InternalError(e.toString());
        }
    }
    public int getX() {
        return x;
    }
}
