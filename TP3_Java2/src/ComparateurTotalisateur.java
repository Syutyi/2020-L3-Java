import java.util.Comparator;

/** Classe écrite pour pouvoir comparer les véhicules selon leur totalisateur**/
public class ComparateurTotalisateur implements Comparator<Vehicule> {
@Override
    public int compare(Vehicule v1, Vehicule v2) {
         return ( (v1.getCompteurKm().getTotalisateur() == v2.getCompteurKm().getTotalisateur()) ?
                 0 : ( (v1.getCompteurKm().getTotalisateur() < v2.getCompteurKm().getTotalisateur()) ?
                 -1 : 1 ) );
        }
    }
