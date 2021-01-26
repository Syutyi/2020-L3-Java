public class CloneTestB
{
    public static void main(String args[]) throws CloneNotSupportedException {
        B obj1 = new B(37);
        System.out.println("Objet 1 : " + obj1.getX());
        B obj2 = (B) obj1.clone();  // Il faut que l'objet B soit clonable donc on fait en sorte que B implémente Clonable
        System.out.println("Objet 2 : " + obj2.getX());
    }
}
