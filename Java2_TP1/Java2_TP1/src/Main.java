import javax.swing.*;
import java.util.*;
import java.util.Scanner;                       // Permet l'importation du module Scanner avec les objets Scanner
import java.lang.Double;

public class Main {                             // classe principale qui nous permettra d'exécuter le code

    /** Partie 1 Exercice 1
     *  Classe Scanner qui retourne le nombre entré
     */
    public static void part1Exercice1() {
        Scanner sc = new Scanner(System.in);
        int nbrUtilisateur = 0;                 // Le nombre que l'utilisateur rentre
        boolean ok = false;                     // Pour catch toutes les exceptions
        System.out.println("Bonjour !");
        while(!ok)
        {
            try{                                // On regarde si ce que l'utilsateur rentre un nombre
                System.out.println("Entrez un nombre entier :");
                nbrUtilisateur = Integer.parseInt(sc.nextLine());
               ok = true;                       // On a rentré un nombre
            }
            catch(Exception e) {
                System.out.println("Vous devez saisir un nombre !");
            }
        }
        System.out.println("Vous avez rentré "+nbrUtilisateur);

    }

    /** Partie 1 Exercice 2
     *  Moyenne Olympique
     */
    public static void part1Exercice2() {
        double note = 0;
        ArrayList<Double> notes = new ArrayList<Double>();  // Tableau contenant les notes rentrées de l'élève
        System.out.println("Bonjour");
        boolean ok;
        Scanner sc = new Scanner(System.in);

        // Entrées utilisateur

        while(note != -1) {     // Permet de rentrer des notes jusqu'à ce que l'utilisateur rentre -1
            ok = false;         // Vérification pour chaque note rentrée
            while(!ok)
            {
                System.out.println("Rentrez un nombre, '-1' dans le cas où vous voulez sortir :");
                if(sc.hasNextDouble())  // Vérifie que le nombre rentré est bien un double
                {
                    note = sc.nextDouble();
                    ok =true;
                    notes.add(note);            // On ajoute les valeurs au tableau
                }
                else
                {
                    System.out.println("Erreur, veuillez rentrer un nombre");
                }
                sc.nextLine();          // Obligatoire sinon boucle infinie
            }
            // System.out.println("Vous avez rentré "+note);   // Permet à l'utilisateur de voir ce qu'il a rentré (non mandatoire)

        }

        // Tri du tableau
        notes.remove((double) -1);      // On ne prend pas -1 en compte
        Collections.sort(notes);

        // Valeurs
        int nbrElement = notes.size() - 2;  // Si on ne tient pas compte du maximum et du minimum
        double somme = 0;
        if(nbrElement>0)
        {
            for (int i = 1; i < notes.size()-1; i++) {
                somme =+ notes.get(i);      // On additionne les notes entre elles
            }
        }
        else if (nbrElement == 0)           // Dans le cas où l'utilisateur n'aurait rentré que 2 valeurs
        {
            somme = notes.get(0)+notes.get(1);
            nbrElement = 2;
        }
        else if (nbrElement == -1)      // 1 seule valeur
        {
            somme = notes.get(0);
            nbrElement = 1;
        }
        else
        {
            return;
        }

        // Calcul de la moyenne olympique
        double moyenne = somme / nbrElement;
        System.out.println("Votre moyenne olympique est de "+moyenne);
    }

    /** Partie 2 Exercice 1
     *  Classes internes
     */
    public static void part2Exercice1() {
        Vehicule vehicule1 = new Vehicule("4WD", "Crysler");
        System.out.println(vehicule1);
        Vehicule vehicule2 = new Vehicule("1WD", "Crysler");
        System.out.println(vehicule2);
        Vehicule vehicule3 = new Vehicule("4WD", "DésoléPasD'Inspiration");
        System.out.println(vehicule3);
        Vehicule vehicule4 = new Vehicule("PasInspirée", "DésoléPasD'Inspiration");
        System.out.println(vehicule4);
        Vehicule.Porte vehiculeInconnu = new Vehicule.Porte(4, 1);
        System.out.println(vehiculeInconnu);
    }

    /** Partie 3 Exercice 1
     *  Exceptions avec les entreprises
     */
    public static void part3Exercice1() {
        ArrayList<Entreprise> entreprises = new ArrayList<Entreprise>(); // Tableau contenant toutes les entreprises
        entreprises.add(new Entreprise("FORD", 200000,999999999,
                "Construction automobile"));
        entreprises.add(new EntrepriseSecrete("CIA",999999999,22000));
        entreprises.add(new EntrepriseSecrete("Spectre",12345678,30000));
        entreprises.add(new EntrepriseSansProfit("CroixRouge", 1000000,"Aides Humanitaires"));
        entreprises.add(new Entreprise("Microsoft", 130000,1000000000,
                "Développement d'outils informatiques"));
        entreprises.add(new Entreprise("EFREI", 500,500000,
                "Former des ingénieurs"));
        Entreprise.afficherEntreprises(entreprises);    // Afficher entreprises

    }

    /** Partie 3 Exercice 2
     *  Exceptions Toutou
     */
    public static void part3Exercice2(){
        try {
            Toutou milou = new Toutou("Milou", 4);
            System.out.println(milou.toString()+"\n");
        } catch(IllegalArgumentException e) {
            System.out.println("Nom ou nombre de puces erroné(s)");
        }
        try {
            Toutou medor = new Toutou("medor", -11);
            System.out.println(medor.toString());
        } catch(IllegalArgumentException e) {
            System.out.println("Nom ou nombre de puces erroné(s)");
        }
    }

    public static void main(String[] args) {
        String choix;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n-----------------------------------------------------------------------------------\n");
            System.out.println("Faites votre choix d'exercice (sans espace, juste le numéro) : " +
                    "\n1. Partie 1 Exercice 1 : Classe Scanner" +
                    "\n2. Partie 1 Exercice 2 : Moyenne Olympique" +
                    "\n3. Partie 2 Exercice 1 : Classe interne avec les Véhicules" +
                    "\n4. Partie 3 Exercice 1 : Exceptions avec les Entreprises" +
                    "\n5. Partie 3 Exercice 2 : Exceptions avec la classe Toutou" +
                    "\n6. Stop");
            choix = scanner.nextLine();
            System.out.println("Vous avez choisi l'option " + choix);
            /**
             * La partie qui va suivre est comme un switch
             * Tant que l'utilisateur ne sélectionne pas 6, le menu continuera à se lancer
             */
            if(choix.equals("1")) { part1Exercice1(); }
            else if(choix.equals("2")) { part1Exercice2(); }
            else if(choix.equals("3")) { part2Exercice1(); }
            else if(choix.equals("4")) { part3Exercice1(); }
            else if(choix.equals("5")) { part3Exercice2(); }
            else if(choix.equals("6")) { System.out.println("Au revoir !"); }
            else {System.out.println("Erreur, veuillez sélectionner une des options proposées");}
        }while(!choix.equals("6"));
    }
}


