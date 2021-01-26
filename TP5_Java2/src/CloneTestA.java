public class CloneTestA {
    public static void main(String args[]) throws CloneNotSupportedException
    {
        A obj1 = new A(37);
        A obj2 = (A)obj1.clone();
    }
}

// D'une part, la méthode clone est protégée pour les objets et d'autre part, la fonction clone n'est pas définie dans A
// De fait, on ne peut pas utiliser la fonction clone ici
// On a