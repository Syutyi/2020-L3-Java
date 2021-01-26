public class Vehicule {
    private String vehicType;
    private String vehicNom;
    private Moteur moteurType;

    // Constructeur auquel on rentre 2 entrées
    public Vehicule(String vehicType, String vehicNom) {
        this.vehicType = vehicType;
        this.vehicNom = vehicNom;
        if(vehicType.equals("4WD")&&vehicNom.equals("Crysler"))
            this.moteurType = new Moteur("Grand");
        else
            this.moteurType = new Moteur("Petit");
    }

    // Classe interne "Porte"
    static class Porte {
        private int portePassager;
        private int coffre;

        public Porte(int p, int c) {
            portePassager = p;
            coffre = c;
        }

        // Setters
        public void setCoffre(int coffre) {
            this.coffre = coffre;
        }

        public void setPortePassager(int portePassager) {
            this.portePassager = portePassager;
        }

        // Getters
        public int getCoffre() {
            return this.coffre;
        }

        public int getPortePassager() {
            return portePassager;
        }

        public int getTotalPortes() {
            return this.getCoffre()+this.getPortePassager();
        }

        @Override
        public String toString() {
            return "Ce véhicule a " + this.getTotalPortes()
                    + " portes";
        }
    }


    // Setters
    public void setVehicType(String vehicType) {
        this.vehicType = vehicType;
    }

    public void setVehicNom(String vehicNom) {
        this.vehicNom = vehicNom;
    }

    public void setMoteurType(Moteur moteurType) {
        this.moteurType = moteurType;
    }

    // Getters
    public String getVehicNom() {
        return this.vehicNom;
    }

    public String getVehicType() {
        return this.vehicType;
    }

    public Moteur getMoteurType() {
        return this.moteurType;
    }

    @Override
    public String toString() {
        return "Ce véhicule est de type "+ this.vehicType
                + ", il s'appelle " + this.vehicNom
                +  " et il a un " + this.moteurType.getMoteurType().toLowerCase()
                + " moteur";
    }

}
