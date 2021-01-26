import java.util.Comparator;

public class ComparateurEx4 {
    static final Comparator<Vehicule> ORDRE_TOTAL = new Comparator<Vehicule>() {
        public int compare(Vehicule o1, Vehicule o2) {
            return ( (o1.getCompteurKm().getTotalisateur() == o2.getCompteurKm().getTotalisateur()) ?
                    0 : ( (o1.getCompteurKm().getTotalisateur() < o2.getCompteurKm().getTotalisateur()) ?
                    -1 : 1 ) );
        }
    };

    static final Comparator<Vehicule> ORDRE_JAUGE= new Comparator<Vehicule>() {
        public int compare(Vehicule o1, Vehicule o2) {
            return ( (o1.getJauge() == o2.getJauge()) ? 0 : ( (o1.getJauge() < o2.getJauge()) ? -1 : 1 ) );
        }
    };
}
