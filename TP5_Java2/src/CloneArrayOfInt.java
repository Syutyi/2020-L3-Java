public class CloneArrayOfInt
{
    public static void main(String args[])
    {
        int vec1[] = new int[]{1, 2, 3};
        int vec2[] = vec1;
        vec1[0] = 666;
        int vec3[] = vec1;
        vec1[1] = 777;
        System.out.println(vec1[0] + " " + vec1[1] + " " + vec1[2]);
        System.out.println(vec2[0] + " " + vec2[1] + " " + vec2[2]);
        System.out.println(vec3[0] + " " + vec3[1] + " " + vec3[2]);
    }
    // On affiche 666 777 lorsque l'on fait vec2[] = vec1 et vec3[] = vec1 on met l'adresse mémoire de vec1 dans celle des deux autres
    // C'est à dire que l'on met le pointeur en paramètre et tous les clones auront le même pointeur en paramètre,
    // Donc une opération sur l'un des clones revient à faire la même pour tous les autres
}
