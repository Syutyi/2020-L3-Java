import java.util.Arrays;

public class CloneArrayOfIntV2
{
    public static void main(String args[])
    {
        // Array étant clonable, on peut utiliser clone()
        int vec1[] = new int[]{1, 2, 3};
        int vec2[] = vec1.clone();          // vect2 = 1 2 3 (copie profonde)
        vec1[0] = 666;
        int vec3[] = vec1.clone();          // vect3 = 666 2 3
        vec1[1] = 777;
        // 666 777 3
        System.out.println(vec1[0] + " " + vec1[1] + " " + vec1[2]);
        //  1 2 3
        System.out.println(vec2[0] + " " + vec2[1] + " " + vec2[2]);
        //  666 2 3
        System.out.println(vec3[0] + " " + vec3[1] + " " + vec3[2]);
    }
}
