import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class GarageSet implements Collection<Vehicule>, Iterable<Vehicule> {
    TreeSet<Vehicule> setVehicules;

    // Tri d'un Treeset avec le comparateur
    public GarageSet(ComparateurTotalisateur comparateurTotalisateur) {
        if(comparateurTotalisateur == null) this.setVehicules =  new TreeSet<Vehicule>();
        setVehicules = new TreeSet<Vehicule>(comparateurTotalisateur);
    }

    public String toString() {
        String chaine = "[";
        int compteur = 0;
        for (Vehicule vehicule : this.setVehicules) {
            chaine += vehicule.toString();
            if (compteur != this.setVehicules.size() - 1) chaine += ", ";
            compteur++;
        }
        chaine += "]";
        return chaine;
    }

    @Override
    public int size() {
        return this.setVehicules.size();
    }

    @Override
    public boolean isEmpty() {
        return this.setVehicules.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Vehicule> iterator() {
        return this.setVehicules.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.setVehicules.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.setVehicules.toArray(a);
    }

    @Override
    public boolean add(Vehicule vehicule) {
        return this.setVehicules.add(vehicule);
    }

    @Override
    public boolean remove(Object o) {
        return this.setVehicules.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.setVehicules.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Vehicule> c) {
        return this.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.setVehicules.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.setVehicules.retainAll(c);
    }

    @Override
    public void clear() {
        this.setVehicules.clear();
    }
}
