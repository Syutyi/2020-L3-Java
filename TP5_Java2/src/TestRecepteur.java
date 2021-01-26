import java.io.IOException;

public class TestRecepteur {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // CHAINES
        Chaine chaine1 = new Chaine(1,"TF1",10911,'V');
        Chaine chaine2 = new Chaine(2,"France 2",19012,'H');
        Chaine chaine3 = new Chaine(3, "France 3", 19013, 'V');
        Chaine chaine4 = new Chaine(4, "France 4", 19014, 'H');
        Chaine chaine5 = new Chaine(5, "France 5", 19015, 'V');
        Chaine chaine6 = new Chaine(6, "M6", 19016, 'H');

        Recepteur recepteurChaine1 = new Recepteur("Recepteur1");

        recepteurChaine1.addChaine(chaine1);
        recepteurChaine1.addChaine(chaine2);
        recepteurChaine1.addChaine(chaine3);
        recepteurChaine1.addChaine(chaine4);
        recepteurChaine1.addChaine(chaine5);
        recepteurChaine1.addChaine(chaine6);

        System.out.println("Recepteur 1 : ");
        System.out.println(recepteurChaine1.toString());

        recepteurChaine1.serialiserRecepteur();

        Recepteur recepteurChaine2 = new Recepteur("Recepteur2");

        recepteurChaine1.deserialiserRecepteur("Recepteur1.txt", recepteurChaine2);

        System.out.println("\nRecepteur 2 :");
        System.out.println(recepteurChaine2.toString());    // Sérialisation dans Recepteur 2
    }
}
