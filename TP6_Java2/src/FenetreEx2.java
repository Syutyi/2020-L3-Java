import javax.swing.*;
import java.awt.*;


public class FenetreEx2 {
    private FenetreEx2(){
        // Paramètres d'affichage
        JFrame fenetre = new JFrame("Membres de club de sport");
        fenetre.setLayout(new GridBagLayout());
        fenetre.setSize(700,500);
        fenetre.setLocationRelativeTo(null);


        // Box contenant le contenu
        JPanel contenu = new JPanel();
        contenu.setLayout(new BoxLayout(contenu, BoxLayout.PAGE_AXIS));

        // Box contenant les champs de remplissage
        JPanel remplir = new JPanel();
        remplir.setLayout(new BoxLayout(remplir, BoxLayout.LINE_AXIS));

        // Box contenant les champs de textes et sexe
        JPanel texte = new JPanel();
        texte.setLayout(new BoxLayout(texte, BoxLayout.PAGE_AXIS));

        // Box contenant les champs à choix
        JPanel choix = new JPanel();
        choix.setLayout(new BoxLayout(choix, BoxLayout.PAGE_AXIS));

        // Box contenant le nom
        JPanel nomBox = new JPanel();
        nomBox.setLayout(new BoxLayout(nomBox, BoxLayout.LINE_AXIS));

        // Box contenant le prénom
        JPanel prenomBox = new JPanel();
        prenomBox.setLayout(new BoxLayout(prenomBox, BoxLayout.LINE_AXIS));

        // Box contenant la naissance
        JPanel naissanceBox = new JPanel();
        naissanceBox.setLayout(new BoxLayout(naissanceBox, BoxLayout.LINE_AXIS));

        // Box contenant l'adresse
        JPanel adresseBox = new JPanel();
        adresseBox.setLayout(new BoxLayout(adresseBox, BoxLayout.LINE_AXIS));

        // Box contenant le sexe
        JPanel genderBox = new JPanel();
        genderBox.setLayout(new BoxLayout(genderBox, BoxLayout.LINE_AXIS));

        // Box contenant le champ langues
        JPanel champLangues = new JPanel();
        champLangues.setLayout(new BoxLayout(champLangues, BoxLayout.LINE_AXIS));

        // Box contenant les langues
        JPanel langues = new JPanel();
        langues.setLayout(new BoxLayout(langues, BoxLayout.PAGE_AXIS));

        // Box contenant la catégorie
        JPanel catBox = new JPanel();
        catBox.setLayout(new BoxLayout(catBox, BoxLayout.LINE_AXIS));

        // Box contenant les sports
        JPanel sportBox = new JPanel();
        sportBox .setLayout(new BoxLayout(sportBox, BoxLayout.LINE_AXIS));

        // Box contenant les boutons
        JPanel buttonBox = new JPanel();
        buttonBox.setLayout(new BoxLayout(buttonBox, BoxLayout.LINE_AXIS));

        /** CREATION DU CONTENU COMPLET DE LA PAGE **/

        // Création des fields
        JTextField txtNom = new JTextField(30);
        JTextField txtPrenom= new JTextField(30);
        JTextField txtNaissance = new JTextField(30);
        JTextArea txtAdresse = new JTextArea(3,30);

        // Création de la sélection du sexe
        JRadioButton sexe1 = new JRadioButton("Homme");
        JRadioButton sexe2 = new JRadioButton("Femme");
        ButtonGroup groupSexe = new ButtonGroup();
        groupSexe.add(sexe1);
        groupSexe.add(sexe2);

        // Boutons de langues
        JCheckBox arabe = new JCheckBox("Arabe");
        JCheckBox francais = new JCheckBox("Français");
        JCheckBox anglais = new JCheckBox("Anglais");
        JCheckBox italien = new JCheckBox("Italien");

        // Boutons en bas
        JButton prec = new JButton("<< Précédent");
        JButton suiv = new JButton("Suivant >>");
        JButton ok = new JButton("Valider");
        JButton cancel = new JButton("Annuler");


        // Création de leur Label
        JLabel lblNom = new JLabel(     " Nom           : ", JLabel.LEFT);
        lblNom.setLabelFor(txtNom);
        nomBox.add(lblNom);
        nomBox.add(txtNom);

        JLabel lblPrenom = new JLabel(  " Prénom     : ", JLabel.LEFT);
        lblPrenom.setLabelFor(txtPrenom);
        prenomBox.add(lblPrenom);
        prenomBox.add(txtPrenom);

        JLabel lblNaissance = new JLabel(" Naissance : ", JLabel.LEFT);
        lblPrenom.setLabelFor(txtNaissance);
        naissanceBox.add(lblNaissance);
        naissanceBox.add(txtNaissance);

        JLabel lblAdresse = new JLabel(" Adresse     : ", JLabel.LEFT);
        lblAdresse.setLabelFor(txtAdresse);
        adresseBox.add(lblAdresse);
        adresseBox.add(txtAdresse);

        JLabel lblSexe = new JLabel(    " Sexe        : ", JLabel.LEFT);
        lblSexe.setLabelFor(genderBox);
        genderBox.add(lblSexe);
        genderBox.add(Box.createHorizontalStrut(70));
        genderBox.add(sexe1);
        genderBox.add(Box.createHorizontalStrut(50));
        genderBox.add(sexe2);

        JLabel lblLangues= new JLabel("Langues : ", JLabel.LEFT);
        lblLangues.setLabelFor(langues);
        langues.add(arabe);
        langues.add(francais);
        langues.add(anglais);
        langues.add(italien);

        // Ajout dans la partie des langues
        champLangues.add(lblLangues);
        champLangues.add(langues);

        String[] categorieStrings = { "Jeune", "Retraité", "Professionnel"};
        JComboBox categorieList = new JComboBox(categorieStrings);
        JLabel lblCategorie = new JLabel("Catégorie : ", JLabel.LEFT);
        lblCategorie.setLabelFor(catBox);
        catBox.add(lblCategorie);
        catBox.add(categorieList);

        String[] sportStrings = { "Tennis", "Volley", "Basket", "Handball", "Football"};
        JList sportList = new JList(sportStrings);
        JLabel lblSports = new JLabel("Sports : ", JLabel.LEFT);
        lblSports.setLabelFor(sportList);
        sportBox.add(Box.createHorizontalStrut(70));
        sportBox.add(lblSports);
        sportBox.add(sportList);

        buttonBox.add(prec);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(suiv);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(ok);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(cancel);

        // ajout dans la partie gauche de la page
        texte.add(nomBox);
        texte.add(Box.createVerticalStrut(50));
        texte.add(prenomBox);
        texte.add(Box.createVerticalStrut(50));
        texte.add(naissanceBox);
        texte.add(Box.createVerticalStrut(50));
        texte.add(adresseBox);
        texte.add(Box.createVerticalStrut(50));
        texte.add(genderBox);

        // Ajout dans la partie droite
        choix.add(champLangues);
        choix.add(Box.createVerticalStrut(70));
        choix.add(catBox);
        choix.add(Box.createVerticalStrut(70));
        choix.add(sportBox);

        // Ajout dans la partie hors bouton
        remplir.add(texte);
        remplir.add(Box.createHorizontalStrut(100));
        remplir.add(choix);

        // Ajout sur la page
        contenu.add(remplir);
        contenu.add(Box.createVerticalStrut(50));
        contenu.add(buttonBox);

        // Ajout à la fenêtre
        fenetre.getContentPane().add(contenu, new GridBagConstraints());

        // Paramètres d'afichage
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FenetreEx2 f = new FenetreEx2();

    }
}
