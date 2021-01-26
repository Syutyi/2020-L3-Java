import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GarageEx5 extends GarageListEx4 {
    public GarageEx5()
    {
        super();
    }
    public void resetPartiel() {
        super.listeVehicules = ( (ArrayList<Vehicule>)super.listeVehicules.stream().map(new Function<Vehicule, Vehicule>() {
            @Override
            public Vehicule apply(Vehicule v) {
                v.getCompteurKm().resetPartiel();
                return v;
            }
        }).collect(Collectors.toList()) );
    }
    public void pleinOk() {
        super.listeVehicules = ( (ArrayList<Vehicule>)super.listeVehicules.stream().map(new Function<Vehicule, Vehicule>() {
            @Override
            public Vehicule apply(Vehicule v) {
                if(v.getJauge() < 10) v.faireLePlein();
                return v;
            }
        }).collect(Collectors.toList()) );
    }
}
