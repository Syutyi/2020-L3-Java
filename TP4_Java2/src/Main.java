import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final ArrayList<String> VILLES = new ArrayList<>() {{
        add("Paris");
        add("Ain");
        add("Lille");
        add("Montpellier");
        add("Lyon");
        add("Laval");
        add("Marseille");
    }};

    private static void part1Ex1()
    {
        ArrayList<String> listExercice1 = new ArrayList<>();
        listExercice1.add("Nom1");
        listExercice1.add("Nom2");
        listExercice1.add("Nom3");
        listExercice1.add("Nom4");
        listExercice1.forEach(System.out::println);
    }

    private static void part1Ex2Question1(){
        System.out.println("\nVilles commençant en L : ");
        VILLES.stream().filter(new VilleEnL()).forEach(System.out::println);
        System.out.println("\nVilles terminant en E : ");
        VILLES.stream().filter(new VilleFiniEnE()).forEach(System.out::println);
        System.out.println("\nToutes les villes : ");
        VILLES.stream().filter(new VilleTout()).forEach(System.out::println);
        System.out.println("\nAucune ville : ");
        VILLES.stream().filter(new VilleAucune()).forEach(System.out::println);
        System.out.println("\nVilles plus long que 3 : ");
        VILLES.stream().filter(new VillePlusQue3()).forEach(System.out::println);
    }

    private static void part1Ex2Question2(){
        System.out.println("\nVilles de longueur 5 : ");
        VILLES.stream().filter(new VilleEnL()).filter(new VilleLogueur5()).forEach(System.out::println);
    }

    private static void part1Ex2Question3(){
        List<String> villesCopie = VILLES.stream().filter(new VillePlusQue3())
                .collect(Collectors.toList());
        System.out.println("\nListe originale : ");
        VILLES.forEach(System.out::println);
        System.out.println("\nCopie créée avec les plus que 3 : ");
        villesCopie.forEach(System.out::println);
    }

    // Access à des classes internes (pour ne pas surcharger le projet)
    private static void part1Ex3SingletonA()
    {
        System.out.println("\nSINGLETON A : ");
        Singletons.SingletonA sA1 = Singletons.SingletonA.instance();
        Singletons.SingletonA sA2 = Singletons.SingletonA.instance();
        sA1.setDonnee(1);
        System.out.println("Donnée dans le 1er singleton : " +sA1.getDonnee());
        System.out.println("Donnée dans le 2e singleton : " + sA2.getDonnee());
    }

    private static void part1Ex3SingletonB()
    {
        System.out.println("\nSINGLETON B : ");
        Singletons.SingletonB sB1 = Singletons.SingletonB.instance;
        Singletons.SingletonB sB2 = Singletons.SingletonB.instance;
        sB1.setDonnee(2);
        System.out.println("Donnée dans le 1er singleton : " +sB1.getDonnee());
        System.out.println("Donnée dans le 2e singleton : " + sB2.getDonnee());
    }

    private static void part1Ex3SingletonC()
    {
        System.out.println("\nSINGLETON C :");
        Singletons.SingletonC sC1 = Singletons.SingletonC.instance();
        Singletons.SingletonC sC2 = Singletons.SingletonC.instance();
        sC1.setDonnee(3);
        System.out.println("Donnée dans le 1er singleton : " +sC1.getDonnee());
        System.out.println("Donnée dans le 2e singleton : " + sC2.getDonnee());
    }

    private static void part1Ex3SingletonD()
    {
        System.out.println("\nSINGLETON D :");
        Singletons.SingletonD sD1 = Singletons.SingletonD.getInstance();
        Singletons.SingletonD sD2 = Singletons.SingletonD.getInstance();
        sD1.setDonnee(4);
        System.out.println("Donnée dans le 1er singleton : " + sD1.getDonnee());
        System.out.println("Donnée dans le 2e singleton : " + sD2.getDonnee());
    }

    private static void part2Ex1()
    {
        System.out.println("\n----------------------------Véhicules--------------------------");
        Vehicule v1 = new Vehicule(3.5,94800,"Modèle 1","Efrei Paris");
        System.out.println("\n");
        System.out.println(v1);
        Vehicule v2 = new Vehicule(4.0,75000,"Modèle 2","Efrei Paris");
        System.out.println(v2);
        v1.faireLePlein();
        v2.faireLePlein();
        System.out.println("\n");
        System.out.println(v1);
        System.out.println(v2);
        v1.rouler(300);
        v2.rouler(45);
        System.out.println("\n");
        System.out.println(v1);
        System.out.println(v2);
        v1.rouler(1000);
        v1.faireLePlein();
        v2.faireLePlein();
        v2.rouler(100);
        v1.mettreDeLessence(6);
        System.out.println("\n");
        System.out.println(v1);
        System.out.println(v2);
        v2.mettreDeLessence(400);
        v1.mettreDeLessence(16);
        v2.rouler(65);
        System.out.println("\n");
        System.out.println(v1);
        System.out.println(v2);
    }

    public static void main(String[] args) {

        int choixUtilisateur = 0;
        boolean ok;
        Scanner sc = new Scanner(System.in);
        while (choixUtilisateur != 6) {
            System.out.println("\n\nVeuillez faire un choix : " +
                    "\n     1  : Afficher l'exercice 1 Partie 1" +
                    "\n     2  : Afficher l'exercice 2 Question 1 Partie 1" +
                    "\n     3  : Afficher l'exercice 2 Question 2 Partie 1" +
                    "\n     4  : Afficher l'exercice 2 Question 3 Partie 1" +
                    "\n     5  : Afficher l'exercice 3 Singleton A Partie 1" +
                    "\n     6  : Afficher l'exercice 3 Singleton B Partie 1" +
                    "\n     7  : Afficher l'exercice 3 Singleton C Partie 1" +
                    "\n     8  : Afficher l'exercice 3 Singleton D Partie 1" +
                    "\n     9  : Afficher l'exercice 1 Partie 2" +
                    "\n     10 : Sortir" );
            ok = false;
            while (!ok)                  // Gestion des exceptions
            {
                try {                                // On regarde si ce que l'utilsateur rentre un nombre
                    System.out.print("Entrez un nombre entier : ");
                    choixUtilisateur = Integer.parseInt(sc.nextLine());
                    ok = true;                       // On a rentré un nombre
                } catch (Exception e) {
                    System.out.println("Vous devez saisir un nombre !");
                }
            }
            switch (choixUtilisateur) {
                case 1:
                    part1Ex1();
                    break;
                case 2:
                    part1Ex2Question1();
                    break;
                case 3:
                    part1Ex2Question2();
                    break;
                case 4:
                    part1Ex2Question3();
                    break;
                case 5:
                    part1Ex3SingletonA();
                    break;
                case 6:
                    part1Ex3SingletonB();
                    break;
                case 7:
                    part1Ex3SingletonC();
                    break;
                case 8:
                    part1Ex3SingletonD();
                    break;
                case 9 :
                    part2Ex1();
                case 10:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Erreur, rentez une des 6 propositions");
                    break;
            }
        }
    }
}
