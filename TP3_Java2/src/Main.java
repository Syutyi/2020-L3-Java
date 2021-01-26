import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void ex1()
    {
        System.out.println("\n----------------- EXRCICE 1 -----------------\n");
        Compteur compteurTest = new Compteur();
        System.out.println(compteurTest);

        compteurTest.add(200);
        System.out.println(compteurTest);

        compteurTest.add(300);
        System.out.println(compteurTest);

        compteurTest.resetPartiel();
        System.out.println(compteurTest);

        compteurTest.add(150);
        System.out.println(compteurTest);
    }

    public static void ex2()
    {
        System.out.println("\n----------------- EXRCICE 2 -----------------\n");
        Vehicule vehicule1 = new Vehicule(0.053);   // Valeur obtenue par calcul
        System.out.println(vehicule1);
        vehicule1.rouler(300);
        vehicule1.faireLePlein();
        System.out.println(vehicule1);
        vehicule1.rouler(300);
        System.out.println(vehicule1);
        vehicule1.rouler(1000);
        vehicule1.faireLePlein();
        System.out.println(vehicule1);
        vehicule1.rouler(200);
        System.out.println(vehicule1);
        vehicule1.rouler(540.188679);
        System.out.println(vehicule1);
        vehicule1.faireLePlein();
        System.out.println(vehicule1);
        vehicule1.rouler(260);
        System.out.println(vehicule1);
        vehicule1.mettreDeLessence(6);
        System.out.println(vehicule1);
        vehicule1.mettreDeLessence(16);
        System.out.println(vehicule1);
        Vehicule vehicule2 = new Vehicule(0.053);   // Valeur obtenue par calcul
        System.out.println(vehicule2);
    }

    public static void ex3()
    {
        System.out.println("\n----------------- EXRCICE 3 -----------------\n");
        System.out.println("######## TESTS DU GARAGE Collection: List ########");
        Vehicule v0 = new Vehicule(0.053);
        Vehicule v1 = new Vehicule(0.053);
        Vehicule v2 = new Vehicule(0.053);
        Vehicule v3 = new Vehicule(0.053);
        Vehicule v4 = new Vehicule(0.053);
        GarageList garagelist = new GarageList();
        garagelist.add(v0);
        garagelist.add(v1);
        garagelist.add(v2);
        garagelist.add(v3);
        garagelist.add(v4);
        System.out.println(garagelist);
        v0.faireLePlein();
        v1.faireLePlein();
        v2.faireLePlein();
        v3.faireLePlein();
        v4.faireLePlein();
        v0.rouler(481);
        v1.rouler(342);
        v2.rouler(167);
        v3.rouler(757);
        v4.rouler(57);
        System.out.println(garagelist);
        v0.mettreDeLessence(79);
        v1.mettreDeLessence(61);
        v2.mettreDeLessence(93);
        v3.mettreDeLessence(55);
        v4.mettreDeLessence(65);
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon le compteur km totalisateur ##");
        Collections.sort(garagelist.getList(), new ComparateurTotalisateur());
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon le no immatriculation ##");
        Collections.sort(garagelist.getList());
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("######## TESTS DU GARAGE Collection: Set ########");
        Vehicule v5 = new Vehicule(0.053);
        Vehicule v6 = new Vehicule(0.053);
        Vehicule v7 = new Vehicule(0.053);
        Vehicule v8 = new Vehicule(0.053);
        Vehicule v9 = new Vehicule(0.053);
        GarageSet garageset = new GarageSet(null);
        garageset.add(v5);
        garageset.add(v6);
        garageset.add(v7);
        garageset.add(v8);
        garageset.add(v9);
        System.out.println(garageset);
        v5.faireLePlein();
        v6.faireLePlein();
        v7.faireLePlein();
        v8.faireLePlein();
        v9.faireLePlein();
        v5.rouler(481);
        v6.rouler(342);
        v7.rouler(167);
        v8.rouler(757);
        v9.rouler(57);
        System.out.println(garageset);
        v5.mettreDeLessence(79);
        v6.mettreDeLessence(61);
        v7.mettreDeLessence(93);
        v8.mettreDeLessence(55);
        v9.mettreDeLessence(65);
        System.out.println("\n");
        System.out.println(garageset);
        System.out.println("\n");
        System.out.println("## Tri selon le compteur km totalisateur ##");
        GarageSet garagesettri = new GarageSet(new ComparateurTotalisateur());
        garagesettri.add(v5);
        garagesettri.add(v6);
        garagesettri.add(v7);
        garagesettri.add(v8);
        garagesettri.add(v9);
        System.out.println(garagesettri);
        System.out.println("\n");
        System.out.println("## Tri selon le no immatriculation ##");
        System.out.println(garageset);
    }

    public static void ex4()
    {
        System.out.println("\n----------------- EXRCICE 4 -----------------\n");
        System.out.println("######## TESTS DU GARAGE Collection: List ########");
        Vehicule v0 = new Vehicule(0.053);
        Vehicule v1 = new Vehicule(0.053);
        Vehicule v2 = new Vehicule(0.053);
        Vehicule v3 = new Vehicule(0.053);
        Vehicule v4 = new Vehicule(0.053);
        GarageListEx4 garagelist = new GarageListEx4();
        garagelist.add(v0);
        garagelist.add(v1);
        garagelist.add(v2);
        garagelist.add(v3);
        garagelist.add(v4);
        System.out.println(garagelist);
        v0.faireLePlein();
        v1.faireLePlein();
        v2.faireLePlein();
        v3.faireLePlein();
        v4.faireLePlein();
        v0.rouler(481);
        v1.rouler(342);
        v2.rouler(167);
        v3.rouler(757);
        v4.rouler(57);
        System.out.println(garagelist);
        v0.mettreDeLessence(79);
        v1.mettreDeLessence(61);
        v2.mettreDeLessence(93);
        v3.mettreDeLessence(55);
        v4.mettreDeLessence(65);
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon le compteur km totalisateur ##");
        garagelist.triTotalisateur();
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon le no immatriculation ##");
        garagelist.triImmatriculation();
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon la jauge ##");
        garagelist.triJauge();
        System.out.println(garagelist);
        System.out.println("\n");

        System.out.println("######## TESTS DU GARAGE Collection: Set ########");
        Vehicule v5 = new Vehicule(0.053);
        Vehicule v6 = new Vehicule(0.053);
        Vehicule v7 = new Vehicule(0.053);
        Vehicule v8 = new Vehicule(0.053);
        Vehicule v9 = new Vehicule(0.053);
        GarageSetEx4 garageset = new GarageSetEx4(null);
        garageset.add(v5);
        garageset.add(v6);
        garageset.add(v7);
        garageset.add(v8);
        garageset.add(v9);
        System.out.println(garageset);
        v5.faireLePlein();
        v6.faireLePlein();
        v7.faireLePlein();
        v8.faireLePlein();
        v9.faireLePlein();
        v5.rouler(481);
        v6.rouler(342);
        v7.rouler(167);
        v8.rouler(757);
        v9.rouler(57);
        System.out.println(garageset);
        v5.mettreDeLessence(79);
        v6.mettreDeLessence(61);
        v7.mettreDeLessence(93);
        v8.mettreDeLessence(55);
        v9.mettreDeLessence(65);
        System.out.println("\n");
        System.out.println(garageset);
        System.out.println("\n");
        System.out.println("## Tri selon le compteur km totalisateur ##");
        garageset.triTotalisateur();
        System.out.println(garageset);
        System.out.println("\n");
        System.out.println("## Tri selon le no immatriculation ##");
        garageset.triImmatriculation();
        System.out.println(garageset);
        System.out.println("\n");
        System.out.println("## Tri selon la jauge ##");
        garageset.triJauge();
        System.out.println(garageset);
    }

    public static void ex5()
    {
        System.out.println("\n----------------- EXRCICE 5 -----------------\n");
        System.out.println("######## TESTS DU GARAGE Collection: List ########");
        Vehicule v0 = new Vehicule(0.053);
        Vehicule v1 = new Vehicule(0.053);
        Vehicule v2 = new Vehicule(0.053);
        Vehicule v3 = new Vehicule(0.053);
        Vehicule v4 = new Vehicule(0.053);
        GarageEx5 garagelist = new GarageEx5();
        garagelist.add(v0);
        garagelist.add(v1);
        garagelist.add(v2);
        garagelist.add(v3);
        garagelist.add(v4);
        System.out.println(garagelist);
        v0.faireLePlein();
        v1.faireLePlein();
        v2.faireLePlein();
        v3.faireLePlein();
        v4.faireLePlein();
        v0.rouler(481);
        v1.rouler(342);
        v2.rouler(167);
        v3.rouler(757);
        v4.rouler(57);
        System.out.println(garagelist);
        v0.mettreDeLessence(79);
        v1.mettreDeLessence(61);
        v2.mettreDeLessence(93);
        v3.mettreDeLessence(55);
        v4.mettreDeLessence(65);
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon le compteur km totalisateur ##");
        garagelist.triTotalisateur();
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon le no immatriculation ##");
        garagelist.triImmatriculation();
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Tri selon la jauge ##");
        garagelist.triJauge();
        System.out.println(garagelist);
        System.out.println("\n");
        System.out.println("## Remise à 0 du compteur partiel ##");
        garagelist.resetPartiel();
        System.out.println(garagelist);
        System.out.println("## Vérification du plein si inférieur à 10 ##");
        garagelist.pleinOk();
        System.out.println(garagelist);
    }

    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
        int choixUtilisateur = 0;
        boolean ok;
        Scanner sc = new Scanner(System.in);
        while (choixUtilisateur != 6)
        {
            System.out.println("\n\nVeuillez faire un choix : " +
                    "\n     1. Afficher l'exercice 1" +
                    "\n     2. Afficher l'exercice 2" +
                    "\n     3. Afficher l'exercice 3" +
                    "\n     4. Afficher l'exercice 4" +
                    "\n     5. Afficher l'exercice 5" +
                    "\n     6. Sortir");
            ok = false;
            while(!ok)                  // Gestion des exceptions
            {
                try{                                // On regarde si ce que l'utilsateur rentre un nombre
                    System.out.print("Entrez un nombre entier : ");
                    choixUtilisateur = Integer.parseInt(sc.nextLine());
                    ok = true;                       // On a rentré un nombre
                }
                catch(Exception e) {
                    System.out.println("Vous devez saisir un nombre !");
                }
            }
            switch (choixUtilisateur)
            {
                case 1 :
                    ex1();
                    break;
                case 2 :
                    ex2();
                    break;
                case 3 :
                    ex3();
                    break;
                case 4 :
                    ex4();
                    break;
                case 5 :
                    ex5();
                    break;
                case 6 :
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Erreur, rentez une des 6 propositions");
                    break;
            }
        }
    }
}
