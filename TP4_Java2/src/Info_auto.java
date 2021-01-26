import java.text.SimpleDateFormat;
import java.util.Date;

public class Info_auto {
    private int serie;
    private String modele;
    private String marque;
    private Date dateCirculation = new Date();

    Info_auto(int serie, String modele, String marque) {
        this.serie = serie;
        this.modele = modele;
        this.marque = marque;
        this.dateCirculation.setTime(System.currentTimeMillis());
    }

    int getSerie() { return serie; }
    String getModele() { return modele; }
    String getMarque() { return marque; }
    Date getDateCirculation() { return this.dateCirculation; }

    public String toString() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        return "\nNuméro de série : " + this.serie
                + "\nModèle : " + this.modele
                + "\nMarque : " + this.marque
                + "\nDate de mise en ciruculation " + formatter.format(this.dateCirculation);
    }
}
