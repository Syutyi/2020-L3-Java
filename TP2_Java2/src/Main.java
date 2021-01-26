import java.util.*;

public class Main {
    public static void exercice1() {
        GenericBoxExo1<Integer> objet1 = new GenericBoxExo1(1, 2, 3);
        GenericBoxExo1<Integer> objet2 = new GenericBoxExo1(2, 2, 3);
        GenericBoxExo1<Integer> objet3 = new GenericBoxExo1(1, 2, 3);
        GenericBoxExo1<Character> objet4 = new GenericBoxExo1<>('a', 'b', 'c');

        System.out.println("Objet 1 :");
        objet1.display();
        System.out.println("Objet 2 :");
        objet2.display();
        objet1.egaux(objet2);
        System.out.println("Objet 1 :");
        objet1.display();
        System.out.println("Objet 3 :");
        objet3.display();
        objet1.egaux(objet3);
        System.out.println("Objet 4 :");
        objet4.display();
    }


    public static void exercice2() {
        boolean ok = false;
        Scanner sc = new Scanner(System.in);
        String motUtil = "";
        int intUtil = 0;
        ArrayList<Integer> listUtil = new ArrayList<>(3);
        int compUtil = 0;
        while (!ok) {
            try {                                // On regarde si ce que l'utilsateur rentre des informations correctes
                System.out.println("Entrez un mot :");
                motUtil = String.valueOf(sc.nextLine());
                System.out.println("Entrez un nombre :");
                intUtil = Integer.parseInt(sc.nextLine());
                System.out.println("Créer une liste de 3 nombres : ");
                System.out.println("Nomnbre 1 :");
                listUtil.add(Integer.parseInt(sc.nextLine()));
                System.out.println("Nombre 2 :");
                listUtil.add(Integer.parseInt(sc.nextLine()));
                System.out.println("Nombre 3 : ");
                listUtil.add(Integer.parseInt(sc.nextLine()));
                System.out.println("Saisir un denier nombre : ");
                compUtil = Integer.parseInt(sc.nextLine());
                ok = true;
            } catch (Exception e) {
                System.out.println("Vous devez saisir des données correctes !");
                sc.nextLine();                  // Pour que les fois où l'utilisateur appuie entrée on n'accède pas aux variables
            }
        }
        GenericBoxExo2<?, ?, ?, ?, ?> objet1 =
                new GenericBoxExo2<String, Integer, ArrayList<Integer>, Integer, Integer>(motUtil, intUtil, listUtil, compUtil);
        objet1.display();
    }

    public static void exercice3()
    {
        System.out.println("Le code ne marchait pas car il s'agissait de deux type d'instances différentes");
        HashMap<PairExo3<String, String>, String> map = new HashMap<PairExo3<String, String>, String>();
        map.put(new PairExo3<String, String>("jean-paul", "sartre"), "mort");
        PairExo3<String, String> paire = new PairExo3<String, String>("elvis", "presley");
        map.put(paire, "vivant");
        map.remove(paire);
        System.out.println(map);
    }

    public static void exercice4()
    {
        NamedPair<String> objet1 = new NamedPair<>("Un nom", "Un prénom","Named Pair");
        NamedPoint objet2 = new NamedPoint(1,4,"Named Point");
        PairExo4<Character> objet3 = new PairExo4<>('a','b');

        System.out.println("Classe Pair :");
        objet3.display();
        System.out.println("Classe Named Pair :");
        objet1.display();
        System.out.println("Classe Named Point :");
        objet2.display();
    }

    public static void exercice5()
    {
        System.out.println("Se référer au code de la classe MyClass, les erreurs ont été enlevés et commentés");
    }

    public static void exercice6()
    {
        List<String> liste1 = Arrays.asList("Chien","Chat");
        List<String> liste2 = Arrays.asList("Pomme","Poire","Fraise","Ananas");
        System.out.println("Liste 1 : " + liste1);
        System.out.println("Liste 2 : " + liste2);
        Exo6 ex = new Exo6();
        ex.copie(liste2,liste1);
        System.out.println("Liste 1 : " + liste1);
        System.out.println("Liste 2 : " + liste2);
        System.out.println("------------------------------------------");
        List<Integer> liste3 = Arrays.asList(1,2);
        List<Integer> liste4 = Arrays.asList(64,65,66,67);
        System.out.println("Liste 1 : " + liste3);
        System.out.println("Liste 2 : " + liste4);
        ex.copie(liste4,liste3);
        System.out.println("Liste 1 : " + liste3);
        System.out.println("Liste 2 : " + liste4);
    }

    public static void exercice7()
    {
        /** Les interfaces filles principales de la classe Collection sont
         * Les Lists
         * Les Set
         * Les Map**/
        Exo7 ex = new Exo7();

        Collection<String> collectionList1 = new ArrayList<String>();
        collectionList1 = Arrays.asList("Abricot","Banane","Cerise","Datte");
        Collection<String> collectionList2 = new ArrayList<String>();
        collectionList2 = Arrays.asList("Abeille","Bourdon","Cigale");
        System.out.println("Liste 1 : " + collectionList1);
        System.out.println("Liste 2 : " + collectionList2);
        System.out.println(ex.getRandomInList(collectionList1,collectionList2,2));

        Collection<Integer> collectionList3 = new HashSet<>();
        collectionList3 = Arrays.asList(1,2,3,4,5,6,7);
        Collection<Integer> collectionList4 = new HashSet<>();
        collectionList4 = Arrays.asList(10,11,12,13,14);
        System.out.println("Liste 1 : " + collectionList3);
        System.out.println("Liste 2 : " + collectionList4);
        System.out.println(ex.getRandomInList(collectionList3,collectionList3,3));

        Collection<Integer> collectionList5 = new ArrayDeque<>();
        collectionList5 = Arrays.asList(2,4,6,8,10);
        Collection<Integer> collectionList6 = new ArrayDeque<>();
        collectionList6 = Arrays.asList(1,3,5,7,9,11);
        System.out.println("Liste 1 : " + collectionList5);
        System.out.println("Liste 2 : " + collectionList6);
        System.out.println(ex.getRandomInList(collectionList5,collectionList6,4));
    }

    public static void exercice8()
    {
        Etudiant etudiant1 = new Etudiant(20170000,14.5,16,17);
        Etudiant etudiant2 = new Etudiant(20170001, 18, 3,2);
        TreeSet<Etudiant> etudiants = new TreeSet<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        Etudiant meilleurEtudiant = Etudiant.meilleurEtudiant(etudiants);
        System.out.println("Etudiant 1 : " + etudiant1.toString());
        System.out.println("Etudiant 2 : " + etudiant2.toString());
        System.out.println("Le meilleur étudiant aux TP est "+meilleurEtudiant);
    }

    public static void exercice9()
    {
        boolean continuer = true;
        Index index = new Index();
        Scanner sc = new Scanner(System.in);
        while(continuer) {
            System.out.println("Choisissez votre action :");
            System.out.println("1. Ajouter");
            System.out.println("2. Afficher les mots");
            System.out.println("3. Supprimer");
            System.out.println("4. Chercher");
            System.out.println("5. Quitter");
            String mot = "";
            int choix = sc.nextInt();
            int page = 0;
            switch(choix) {
                case 1:
                    System.out.println("Votre mot :");
                    mot = sc.next();
                    System.out.println("Page souhaitée :");
                    page = sc.nextInt();
                    index.add(page,mot);
                    System.out.println("Votre mot a été ajouté");
                    break;
                case 2:
                    index.display();
                    break;
                case 3:
                    System.out.println("Entrez le mot :");
                    mot = sc.next();
                    index.remove(mot);
                    System.out.println("Votre mot a été supprimé !");
                    break;
                case 4:
                    System.out.println("Entrez le mot :");
                    mot = sc.next();
                    Set<Integer> pages = index.search(mot);
                    if(pages == null) System.out.println("Le mot n'est pas dans l'index");
                    else System.out.println(pages);
                    break;
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Erreur de choix!");
                    break;
            }
        }
    }

    public static void exercice10()
    {
        boolean continuer = true;
        Index index = new Index();
        Scanner sc = new Scanner(System.in);
        while(continuer) {
            System.out.println("Choisissez votre action :");
            System.out.println("1. Ajouter");
            System.out.println("2. Afficher les mots");
            System.out.println("3. Supprimer");
            System.out.println("4. Chercher");
            System.out.println("5. Quitter");
            String mot = "";
            int choix = sc.nextInt();
            int page = 0;
            switch(choix) {
                case 1:
                    System.out.println("Votre mot :");
                    mot = sc.next();
                    System.out.println("Page souhaitée :");
                    page = sc.nextInt();
                    index.add(page,mot);
                    System.out.println("Votre mot a été ajouté");
                    break;
                case 2:
                    index.display();
                    break;
                case 3:
                    System.out.println("Entrez le mot :");
                    mot = sc.next();
                    index.remove(mot);
                    System.out.println("Votre mot a été supprimé !");
                    break;
                case 4:
                    System.out.println("Entrez le mot :");
                    mot = sc.next();
                    Set<Integer> pages = index.search(mot);
                    if(pages == null) System.out.println("Le mot n'est pas dans l'index");
                    else System.out.println(pages);
                    break;
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Erreur de choix!");
                    break;
            }
        }
        ReverseIndex inverse = new ReverseIndex(index);
        System.out.println("Votre index inversé :");
        inverse.display();
        continuer = true;
        while(continuer) {
            System.out.println("Choisissez votre action :");
            System.out.println("1. Afficher les mots");
            System.out.println("2. Chercher");
            System.out.println("3. Quitter");
            String mot = "";
            int choix = sc.nextInt();
            int page = 0;
            switch(choix) {
                case 1:
                    inverse.display();
                    break;
                case 2:
                    System.out.println("Entrez la page :");
                    page = sc.nextInt();
                    TreeSet<String> motPage= inverse.search(page);
                    if(motPage == null) System.out.println("La page n'existe pas");
                    else System.out.println(motPage);
                    break;
                case 3:
                    continuer = false;
                    break;
                default:
                    System.out.println("Erreur de choix!");
                    break;
            }
        }
    }


    public static void main(String[] args) {
        //exercice1();
        //exercice2();
        //exercice3();
        //exercice4();
        //exercice5();
        //exercice6();
        //exercice7();
        //exercice8();
        //exercice9();
        exercice10();
        System.out.println("Hello");
    }
}
