import com.sun.jdi.DoubleValue;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    private static void Ex1Part1()
    {
        /** définition des fonctions
         * 1. Puissance
         * 2. Conversion en String
         */
        BiFunction<Integer, Integer, Double> puissance = Math::pow;
        Function<Double, String> conversion = (conv) -> "Puissance : " + conv;
        System.out.println("Puissance de 4 par 5 : ");
        System.out.println(Exercice1.puissance_chaine(4,5,puissance,conversion));
        System.out.println("Puissance de 2 par 3 : ");
        System.out.println(Exercice1.puissance_chaine(2,3,puissance,conversion));
        System.out.println("Puissance de 2 par 2 : ");
        System.out.println(Exercice1.puissance_chaine(2,2,puissance,conversion));
    }

    private static void Ex1Part2()
    {
        BiFunction<Integer, Integer, Double> puissance = Math::pow;
        Function<Double, String> conversion1 = (double1) -> "Puissance : " + double1;

        BiFunction<Integer, Integer, Integer> multiplier = (int1, int2) -> int1 * int2;
        Function<Integer, String> conversion2 = (integer1) -> "Multplication : " + integer1;

        BiFunction<String, String, String> concatener = (str1, str2) -> str1 + str2;
        Function<String, Integer> conversion3 = Integer::valueOf;

        System.out.println("Puissance de 4 par 5 : ");
        System.out.println(Exercice1.fonction_convertir(4,5, puissance, conversion1));
        System.out.println("Multiplication de 4 par 5 : ");
        System.out.println(Exercice1.fonction_convertir(4,5, multiplier, conversion2));
        System.out.println("Concaténation : ");
        System.out.println("Valeur : " + Exercice1.fonction_convertir(String.valueOf(2019),String.valueOf(2020), concatener, conversion3));
    }

    private static void Ex2()
    {
        System.out.println("D'une part, la méthode clone est protégée pour les objets et d'autre part, la fonction clone n'est pas définie dans A\n" +
                "De fait, on ne peut pas utiliser la fonction clone ici\n" +
                "On a donc créé une fonction override pour l'implémenter dans A");
    }

    private static void Ex3()
    {
        System.out.println("Il faut que l'objet B soit clonable donc on fait en sorte que B implémente Clonable");
        System.out.println("Run la classe CloneTestB pour tester");
    }

    private static void Ex4()
    {
        System.out.println("Commentaires : ");
        System.out.println("On affiche 666 777 lorsque l'on fait vec2[] = vec1 et vec3[] = vec1 on met l'adresse mémoire de vec1 dans celle des deux autres\n" +
                "C'est à dire que l'on met le pointeur en paramètre et tous les clones auront le même pointeur en paramètre,\n" +
                "Donc une opération sur l'un des clones revient à faire la même pour tous les autres\n" +
                "Voir la suite dans le fichier CloneArrayOfIntV2");
    }

    private static void Ex5()
    {
        System.out.println("Voir fichier TestRecepteur.java");
    }

    public static void main(String[] args) {
        int choixUtilisateur = 0;
        boolean ok;
        Scanner sc = new Scanner(System.in);
        while (choixUtilisateur != 7) {
            System.out.println("\n\nVeuillez faire un choix : " +
                    "\n     1  : Afficher l'exercice 1 Partie 1" +
                    "\n     2  : Afficher l'exercice 1 Partie 2" +
                    "\n     3  : Afficher l'exercice 2" +
                    "\n     4  : Afficher l'exercice 3" +
                    "\n     5  : Afficher l'exercice 4" +
                    "\n     6  : Afficher l'exercice 5" +
                    "\n     7  : Sortir");
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
                    Ex1Part1();
                    break;
                case 2:
                    Ex1Part2();
                    break;
                case 3:
                    Ex2();
                    break;
                case 4:
                    Ex3();
                    break;
                case 5:
                    Ex4();
                    break;
                case 6:
                    Ex5();
                    break;
                case 7:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Erreur, rentez une des 7 propositions");
                    break;
            }
        }
    }
}
