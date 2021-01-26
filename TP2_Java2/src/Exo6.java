import java.util.List;

public class Exo6 {

    public static <T> void copie(List<? super T> listeCopie, List<? extends T> listeSource)
    {
        for(int i = 0; i < listeSource.size(); i++)
        {
            listeCopie.set(i, listeSource.get(i));
        }
    }
}
