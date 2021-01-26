public class A {
    private int x;
    public A(int i)
    {
        x = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
