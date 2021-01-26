import javax.swing.*;
import java.awt.*;

public class FenetreEx5 {
    String pseudo;
    int points = 0;

    static int Heures=0;
    static int Minutes=0;
    static int Secondes=0;
    static int Milisecondes=0;

    private JLabel heures = new JLabel("00: ");
    private JLabel minutes = new JLabel("00: ");
    private JLabel secondes = new JLabel("00: ");
    private JLabel milisecondes = new JLabel("00: ");

    static boolean state = true;

    private void StartChrono(){

        Thread t = new Thread(){
            public void run(){
                for (;;){

                    if (state){

                        try{
                            sleep(1);

                            if (Milisecondes>500){
                                Milisecondes=0;
                                Secondes++;
                            }
                            if (Secondes>60){
                                Secondes=0;
                                Minutes++;
                            }
                            if (Minutes>60){
                                Minutes=0;
                                Heures++;
                            }
                            milisecondes.setText(" : "+Milisecondes*2);
                            secondes.setText(" : "+Secondes);
                            minutes.setText(" : "+Minutes);
                            heures.setText(""+Heures);

                            Milisecondes++;

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else{
                        break;
                    }

                }
            }
        };
        t.start();
    }

    private void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    private void controlPoint(int reponse, int repUtilisateur)
    {
        if(reponse == repUtilisateur)
        {
            this.points++;
        }
    }

    private FenetreEx5()
    {

        // Rentrer pseudo
        JFrame fenetre1 = new JFrame("Quiz");
        fenetre1.setLayout(new GridBagLayout());
        JPanel fenetrePseudo = new JPanel();
        fenetrePseudo.setLayout(new BoxLayout(fenetrePseudo, BoxLayout.PAGE_AXIS));
        JPanel contenuPseudo = new JPanel();
        contenuPseudo.setLayout(new BoxLayout(contenuPseudo, BoxLayout.LINE_AXIS));
        fenetre1.setSize(400,100);
        fenetre1.setLocationRelativeTo(null);

        // Contenu de la fenetre de pseudo
        JTextField nom = new JTextField();
        JLabel lblPseudo = new JLabel("Pseudo : ");
        lblPseudo.setLabelFor(nom);
        JButton getPseudo = new JButton("Commencer");
        contenuPseudo.add(lblPseudo);
        contenuPseudo.add(nom);
        contenuPseudo.add(getPseudo);

        fenetrePseudo.add(Box.createHorizontalStrut(300));
        fenetrePseudo.add(contenuPseudo);
        fenetre1.add(fenetrePseudo, new GridBagConstraints());
        fenetre1.setVisible(true);

        // Event listener if Ok generate the new dialog
        getPseudo.addActionListener(e -> {
            if(!nom.getText().equals("")){
                setPseudo(nom.getText());
                fenetre1.setVisible(false);

                JPanel chronometre = new JPanel();
                chronometre.setLayout(new BoxLayout(chronometre, BoxLayout.LINE_AXIS));
                chronometre.add(Box.createHorizontalStrut(30));
                chronometre.add(heures);
                chronometre.add(minutes);
                chronometre.add(secondes);
                chronometre.add(milisecondes);

                // Question 1
                JFrame fenetreQuestion1 = new JFrame(this.pseudo);
                fenetreQuestion1.setLayout(new GridBagLayout());
                JPanel contenuQuestion1 = new JPanel();
                contenuQuestion1.setLayout(new BoxLayout(contenuQuestion1, BoxLayout.PAGE_AXIS));
                JPanel contenuQ1 = new JPanel();
                contenuQ1.setLayout(new BoxLayout(contenuQ1, BoxLayout.LINE_AXIS));
                fenetreQuestion1.setSize(400,200);
                fenetreQuestion1.setLocationRelativeTo(null);

                // Contenu de la fenetre de pseudo
                JTextField rep1 = new JTextField();
                JLabel q1 = new JLabel("5 x 2 : ");
                q1.setLabelFor(q1);
                JButton getRep1 = new JButton("Suivant");
                contenuQ1.add(q1);
                contenuQ1.add(rep1);

                contenuQuestion1.add(chronometre);
                contenuQuestion1.add(Box.createVerticalStrut(20));
                contenuQuestion1.add(Box.createHorizontalStrut(60));
                contenuQuestion1.add(contenuQ1);
                contenuQuestion1.add(Box.createVerticalStrut(20));
                contenuQuestion1.add(getRep1);

                fenetreQuestion1.add(contenuQuestion1, new GridBagConstraints());
                fenetreQuestion1.setVisible(true);

                getRep1.addActionListener(e2 -> {   // Pas de réponse
                    if(!rep1.getText().equals("")) {
                        controlPoint(10,Integer.parseInt(rep1.getText()));
                        fenetreQuestion1.setVisible(false);

                        JFrame fenetreQuestion2 = new JFrame(this.pseudo);
                        fenetreQuestion2.setLayout(new GridBagLayout());
                        JPanel contenuQuestion2 = new JPanel();
                        contenuQuestion2.setLayout(new BoxLayout(contenuQuestion2, BoxLayout.PAGE_AXIS));
                        JPanel contenuQ2 = new JPanel();
                        contenuQ2.setLayout(new BoxLayout(contenuQ2, BoxLayout.LINE_AXIS));
                        fenetreQuestion2.setSize(400,200);
                        fenetreQuestion2.setLocationRelativeTo(null);

                        // Fenetre de q2
                        JTextField rep2 = new JTextField();
                        JLabel q2 = new JLabel("5 x 3 : ");
                        q2.setLabelFor(q2);
                        JButton getRep2 = new JButton("Suivant");
                        contenuQ2.add(q2);
                        contenuQ2.add(rep2);

                        contenuQuestion2.add(chronometre);
                        contenuQuestion2.add(Box.createVerticalStrut(20));
                        contenuQuestion2.add(Box.createHorizontalStrut(60));
                        contenuQuestion2.add(contenuQ2);
                        contenuQuestion2.add(Box.createVerticalStrut(20));
                        contenuQuestion2.add(getRep2);

                        fenetreQuestion2.add(contenuQuestion2, new GridBagConstraints());
                        fenetreQuestion2.setVisible(true);

                        getRep2.addActionListener(e3 -> {   // Pas de réponse
                            if(!rep2.getText().equals("")) {
                                controlPoint(15,Integer.parseInt(rep2.getText()));
                                fenetreQuestion2.setVisible(false);

                                JFrame fenetreQuestion3 = new JFrame(this.pseudo);
                                fenetreQuestion3.setLayout(new GridBagLayout());
                                JPanel contenuQuestion3 = new JPanel();
                                contenuQuestion3.setLayout(new BoxLayout(contenuQuestion3, BoxLayout.PAGE_AXIS));
                                JPanel contenuQ3 = new JPanel();
                                contenuQ3.setLayout(new BoxLayout(contenuQ3, BoxLayout.LINE_AXIS));
                                fenetreQuestion3.setSize(400,200);
                                fenetreQuestion3.setLocationRelativeTo(null);

                                // Contenu de la fenetre de pseudo
                                JTextField rep3 = new JTextField();
                                JLabel q3 = new JLabel("5 x 4 : ");
                                q3.setLabelFor(q3);
                                JButton getRep3 = new JButton("Suivant");
                                contenuQ3.add(q3);
                                contenuQ3.add(rep3);

                                contenuQuestion3.add(chronometre);
                                contenuQuestion3.add(Box.createVerticalStrut(20));
                                contenuQuestion3.add(Box.createHorizontalStrut(60));
                                contenuQuestion3.add(contenuQ3);
                                contenuQuestion3.add(Box.createVerticalStrut(20));
                                contenuQuestion3.add(getRep3);

                                fenetreQuestion3.add(contenuQuestion3, new GridBagConstraints());
                                fenetreQuestion3.setVisible(true);

                                getRep3.addActionListener(e4 -> {   // Pas de réponse
                                    if(!rep3.getText().equals("")) {
                                        controlPoint(20,Integer.parseInt(rep3.getText()));
                                        fenetreQuestion3.setVisible(false);

                                        JFrame fenetreQuestion4 = new JFrame(this.pseudo);
                                        fenetreQuestion4.setLayout(new GridBagLayout());
                                        JPanel contenuQuestion4 = new JPanel();
                                        contenuQuestion4.setLayout(new BoxLayout(contenuQuestion4, BoxLayout.PAGE_AXIS));
                                        JPanel contenuQ4 = new JPanel();
                                        contenuQ4.setLayout(new BoxLayout(contenuQ4, BoxLayout.LINE_AXIS));
                                        fenetreQuestion4.setSize(400,200);
                                        fenetreQuestion4.setLocationRelativeTo(null);

                                        // Contenu de la fenetre de pseudo
                                        JTextField rep4 = new JTextField();
                                        JLabel q4 = new JLabel("5 x 5 : ");
                                        q4.setLabelFor(q4);
                                        JButton getRep4 = new JButton("Suivant");
                                        contenuQ4.add(q4);
                                        contenuQ4.add(rep4);

                                        contenuQuestion4.add(chronometre);
                                        contenuQuestion4.add(Box.createVerticalStrut(20));
                                        contenuQuestion4.add(Box.createHorizontalStrut(60));
                                        contenuQuestion4.add(contenuQ4);
                                        contenuQuestion4.add(Box.createVerticalStrut(20));
                                        contenuQuestion4.add(getRep4);

                                        fenetreQuestion4.add(contenuQuestion4, new GridBagConstraints());
                                        fenetreQuestion4.setVisible(true);

                                        getRep4.addActionListener(e5 -> {   // Pas de réponse
                                            if(!rep4.getText().equals("")) {
                                                controlPoint(25,Integer.parseInt(rep4.getText()));
                                                fenetreQuestion4.setVisible(false);

                                                JFrame fenetreQuestion5 = new JFrame(this.pseudo);
                                                fenetreQuestion5.setLayout(new GridBagLayout());
                                                JPanel contenuQuestion5 = new JPanel();
                                                contenuQuestion5.setLayout(new BoxLayout(contenuQuestion5, BoxLayout.PAGE_AXIS));
                                                JPanel contenuQ5 = new JPanel();
                                                contenuQ5.setLayout(new BoxLayout(contenuQ5, BoxLayout.LINE_AXIS));
                                                fenetreQuestion5.setSize(400,200);
                                                fenetreQuestion5.setLocationRelativeTo(null);

                                                // Contenu de la fenetre de pseudo
                                                JTextField rep5 = new JTextField();
                                                JLabel q5 = new JLabel("5 x 6 : ");
                                                q5.setLabelFor(q5);
                                                JButton getRep5 = new JButton("Suivant");
                                                contenuQ5.add(q5);
                                                contenuQ5.add(rep5);

                                                contenuQuestion5.add(chronometre);
                                                contenuQuestion5.add(Box.createVerticalStrut(20));
                                                contenuQuestion5.add(Box.createHorizontalStrut(60));
                                                contenuQuestion5.add(contenuQ5);
                                                contenuQuestion5.add(Box.createVerticalStrut(20));
                                                contenuQuestion5.add(getRep5);

                                                fenetreQuestion5.add(contenuQuestion5, new GridBagConstraints());
                                                fenetreQuestion5.setVisible(true);

                                                getRep5.addActionListener(e6 -> {   // Pas de réponse
                                                    if (!rep5.getText().equals("")) {
                                                        controlPoint(30, Integer.parseInt(rep5.getText()));
                                                        fenetreQuestion5.setVisible(false);
                                                        JFrame resultat = new JFrame("Résultat");
                                                        resultat.setLayout(new GridBagLayout());

                                                         JPanel fenetreRes = new JPanel();
                                                         fenetreRes.setLayout(new BoxLayout(fenetreRes, BoxLayout.PAGE_AXIS));
                                                         JPanel contenuRes = new JPanel();
                                                         contenuRes.setLayout(new BoxLayout(contenuRes, BoxLayout.LINE_AXIS));
                                                         resultat.setSize(400,200);
                                                         resultat.setLocationRelativeTo(null);

                                                         JLabel res = new JLabel("Vous avez obtenu "+this.points+"/5 !");
                                                         JButton replay = new JButton("Rejouer");

                                                        state = false;
                                                        contenuRes.add(res);
                                                        fenetreRes.add(chronometre);
                                                        fenetreRes.add(contenuRes);
                                                        fenetreRes.add(Box.createVerticalStrut(20));
                                                        fenetreRes.add(replay);

                                                        resultat.add(fenetreRes, new GridBagConstraints());
                                                        resultat.setVisible(true);

                                                        replay.addActionListener(rept -> {
                                                            resultat.setVisible(false);
                                                            new FenetreEx5();
                                                        });

                                                    } else {
                                                        JOptionPane.showMessageDialog(null,
                                                                "Mettre une réponse !",
                                                                "Erreur",
                                                                JOptionPane.ERROR_MESSAGE);
                                                    }
                                                });
                                            }
                                            else {
                                                JOptionPane.showMessageDialog(null,
                                                        "Mettre une réponse !",
                                                        "Erreur",
                                                        JOptionPane.ERROR_MESSAGE);
                                            }
                                        });
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null,
                                                "Mettre une réponse !",
                                                "Erreur",
                                                JOptionPane.ERROR_MESSAGE);
                                    }
                                });
                            }
                            else {
                                JOptionPane.showMessageDialog(null,
                                        "Mettre une réponse !",
                                        "Erreur",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        });

                    }
                        else {
                            JOptionPane.showMessageDialog(null,
                                    "Mettre une réponse !",
                                    "Erreur",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    });
                this.StartChrono();
            }
            else {  // Pas de réponse
                JOptionPane.showMessageDialog(null,
                        "Rentrez un pseudo !",
                        "Erreur",
                        JOptionPane.ERROR_MESSAGE);
                fenetre1.setVisible(false);
                new FenetreEx5();
            }
        });

    }

    public static void main(String[] args) {
        new FenetreEx5();
    }
}
