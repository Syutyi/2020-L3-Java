import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Random;

public class FenetreEx3 extends JFrame{
    // Valeur recherchée
    private int valeurCachee = 0;

    // Contenu de la page
    private JPanel contenu = new JPanel();
    private static JPanel ligneInteractive = new JPanel();
    private int contenuClique = 0;


    // Entier aléatoire
    private int generateRandomInt(){
        Random rd = new Random();
        this.valeurCachee = rd.nextInt(9) + 1;
        return this.valeurCachee;
    }

    // Qu'est ce que l'on clique
    private void setContenuClique(int contenuClique) {
        this.contenuClique = contenuClique;
    }

    private FenetreEx3() {
        this.setTitle("DEVINETTE");
        this.setLayout(new GridBagLayout());
        // Contenu de la page
        this.contenu.setLayout(new BoxLayout(contenu, BoxLayout.PAGE_AXIS));

        // Taille et position de la fenêtre
        this.setSize(700,200);
        this.setLocationRelativeTo(null);

        // Affichera tous les boutons de 1 à 9
        JPanel ligneBoutons = new JPanel();
        ligneBoutons.setLayout(new BoxLayout(ligneBoutons, BoxLayout.LINE_AXIS));

        // Ajout des boutons au contenu
        this.getContentPane().add(this.contenu, new GridBagConstraints());
        this.contenu.add(ligneBoutons);

        // Création de boutons
        JButton bouton1 = new JButton("1");
        JButton bouton2 = new JButton("2");
        JButton bouton3 = new JButton("3");
        JButton bouton4 = new JButton("4");
        JButton bouton5 = new JButton("5");
        JButton bouton6 = new JButton("6");
        JButton bouton7 = new JButton("7");
        JButton bouton8 = new JButton("8");
        JButton bouton9 = new JButton("9");

        // Un seul choix possible
        ButtonGroup choix = new ButtonGroup();
        choix.add(bouton1);
        choix.add(bouton2);
        choix.add(bouton3);
        choix.add(bouton4);
        choix.add(bouton5);
        choix.add(bouton6);
        choix.add(bouton7);
        choix.add(bouton8);
        choix.add(bouton9);

        /*
          AJOUT A LA FENETRE
         */

        // Ajout à la box Horizontale
        ligneBoutons.add(bouton1);
        bouton1.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton2);
        bouton2.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton3);
        bouton3.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton4);
        bouton4.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton5);
        bouton5.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton6);
        bouton6.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton7);
        bouton7.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton8);
        bouton8.setBackground(Color.PINK);
        ligneBoutons.add(Box.createHorizontalStrut(10));
        ligneBoutons.add(bouton9);
        bouton9.setBackground(Color.PINK);

        // Paramètres d'afichage
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Lorsque l'on clique sur des boutons, on interagit avec le jeu
        bouton1.addActionListener(e -> {
            setContenuClique(1);
            afficheReponse(1==valeurCachee);
        });
        bouton2.addActionListener(e -> {
            setContenuClique(2);
            afficheReponse(2==valeurCachee);
        });
        bouton3.addActionListener(e -> {
                setContenuClique(3);
                afficheReponse(3==valeurCachee);
        });
        bouton4.addActionListener(e -> {
                setContenuClique(4);
                afficheReponse(4==valeurCachee);
        });
        bouton5.addActionListener(e -> {
                setContenuClique(5);
                afficheReponse(5==valeurCachee);
        });
        bouton6.addActionListener(e -> {
                setContenuClique(6);
                afficheReponse(6==valeurCachee);
        });
        bouton7.addActionListener(e -> {
                setContenuClique(7);
                afficheReponse(7==valeurCachee);
        });
        bouton8.addActionListener(e -> {
                setContenuClique(8);
                afficheReponse(8==valeurCachee);
        });
        bouton9.addActionListener(e -> {
                setContenuClique(9);
                afficheReponse(9==valeurCachee);
        });

    }

    // Retourne la valeur cachée
    private int getValeurCachee() {
        return valeurCachee;
    }

    // Le jeu
    private static void jouer(){
        // Ajout des boutons au contenu
        FenetreEx3 fenetre = new FenetreEx3();
        int valeur = fenetre.generateRandomInt();
        fenetre.contenuClique = 0;

        // Formattage pour l'entrée utilisateur
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(9);
        formatter.setAllowsInvalid(false);

        // Enlever les boutons rejouer, la réponse etc
        ligneInteractive.removeAll();
        ligneInteractive.setLayout(new BoxLayout(ligneInteractive, BoxLayout.LINE_AXIS));

        // Bouton valider et champ de texte
        JButton valider = new JButton("Valider");
        JTextField reponse = new JFormattedTextField(formatter);
        valider.setBackground(Color.YELLOW);
        ligneInteractive.add(valider);
        ligneInteractive.add(Box.createHorizontalStrut(10));
        ligneInteractive.add(reponse);
        fenetre.contenu.add(Box.createVerticalStrut(50));
        fenetre.contenu.add(ligneInteractive);

        // Fenetre visible
        fenetre.setVisible(true);

        // Lorsque on clique sur valider, pareil pour les boutons, on affiche la réponse
        valider.addActionListener(e -> {
            // Fermer la fenêtre de jeu
            fenetre.setVisible(false);
            fenetre.afficheReponse(Integer.parseInt(reponse.getText())==valeur);
        });
    }

    // Fonction d'affichage de la réponse
    private void afficheReponse(boolean bonneValeur)
    {
        // Création du contenu particulier
        JButton rejouer = new JButton("Répéter");
        JLabel gagner = new JLabel("        Bravo vous avez trouvé "+getValeurCachee()+"        ");
        JLabel perdu = new JLabel("        Désolé, la valeur attendue était "+getValeurCachee()+"        ");

        // On enlève ce qui est propre à jouer
        ligneInteractive.removeAll();
        ligneInteractive.setLayout(new BoxLayout(ligneInteractive, BoxLayout.LINE_AXIS));
        rejouer.setBackground(Color.YELLOW);
        ligneInteractive.add(rejouer);

        // Si l'utilisateur a deviné le nombre, il gagne
        if (bonneValeur){ ligneInteractive.add(gagner); }
        // Sinon afficher le nombre en question
        else {ligneInteractive.add(perdu);}

        // Fenetre visible
        setVisible(true);

        // Si l'utilisateur veut rejouer, on relance le jeu
        rejouer.addActionListener(e -> {
            // Fermer la fenêtre de réponse
            setVisible(false);
            jouer();
        });
    }


    public static void main(String[] args) {
        jouer();
    }
}
