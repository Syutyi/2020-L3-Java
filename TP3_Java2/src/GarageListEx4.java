import java.util.*;

public class GarageListEx4 implements Collection<Vehicule>, Iterable<Vehicule> {

    protected ArrayList<Vehicule> listeVehicules;
    public GarageListEx4() {
        this.listeVehicules = new ArrayList<Vehicule>();
    }

    public void triImmatriculation() {
        Collections.sort(listeVehicules);
    }
    public void triTotalisateur() {
        Collections.sort(listeVehicules,ComparateurEx4.ORDRE_TOTAL);
    }
    public void triJauge() {
        Collections.sort(listeVehicules,ComparateurEx4.ORDRE_JAUGE);
    }
    @Override
    public String toString() {
        String chaine = "[";
        int compteur = 0;
        for (Vehicule vehicule : this.listeVehicules) {
            chaine += vehicule.toString();
            if (compteur != this.listeVehicules.size() - 1) chaine += ", ";
            compteur++;
        }
        chaine += "]";
        return chaine;
    }

    public List<Vehicule> getList() {
        return this.listeVehicules;
    }

    @Override
    public int size() {
        return this.listeVehicules.size();
    }

    @Override
    public boolean isEmpty() {
        return this.listeVehicules.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.listeVehicules.contains(o);
    }

    @Override
    public Iterator<Vehicule> iterator() {
        return this.listeVehicules.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.listeVehicules.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.listeVehicules.toArray(a);
    }

    @Override
    public boolean add(Vehicule vehicule) {
        return this.listeVehicules.add(vehicule);
    }

    @Override
    public boolean remove(Object o) {
        return this.listeVehicules.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.listeVehicules.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Vehicule> c) {
        return this.listeVehicules.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.listeVehicules.retainAll(c);
    }

    @Override
    public void clear() {
        this.listeVehicules.clear();
    }
}
