import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.NumberFormat;
import java.time.Duration;
import java.util.Random;

public class FenetreEx4 {
    private int entierATrouver = 0;
    private static int Heures=0;
    private static int Minutes=0;
    private static int Secondes=0;
    private static int Milisecondes=0;

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

    private int generateRandomInt(){
        Random rd = new Random();
        return rd.nextInt(100) + 1;
    }

        private FenetreEx4(){
        entierATrouver = generateRandomInt();
        JFrame fenetre = new JFrame("Nombre caché");
        fenetre.setLayout(new GridBagLayout());
        fenetre.setSize(300,200);
        fenetre.setLocationRelativeTo(null);

        // Contenu
        JPanel contenu = new JPanel();
        contenu.setLayout(new BoxLayout(contenu, BoxLayout.PAGE_AXIS));
        JPanel chronometre = new JPanel();
        chronometre.setLayout(new BoxLayout(chronometre, BoxLayout.LINE_AXIS));
        chronometre.add(heures);
        chronometre.add(minutes);
        chronometre.add(secondes);
        chronometre.add(milisecondes);

        JPanel afficheurDeSolution = new JPanel();
        afficheurDeSolution.setLayout(new BoxLayout(afficheurDeSolution, BoxLayout.LINE_AXIS));

        JPanel reponseUtilisateur = new JPanel();
        reponseUtilisateur.setLayout(new BoxLayout(reponseUtilisateur, BoxLayout.LINE_AXIS));

        JPanel validation = new JPanel();
        validation.setLayout(new BoxLayout(validation, BoxLayout.LINE_AXIS));

        // Réponse utilisateur
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(100);
        formatter.setAllowsInvalid(false);
        JTextField rep = new JFormattedTextField(formatter);



        // Bouton Valider
        JButton valider = new JButton("Valider");

        validation.add(Box.createHorizontalStrut(20));
        validation.add(valider);
        validation.add(Box.createHorizontalStrut(20));

        fenetre.getContentPane().add(contenu,new GridBagConstraints());

        JLabel lblRep = new JLabel(     " Réponse : ", JLabel.LEFT);
        lblRep.setLabelFor(rep);

        reponseUtilisateur.add(lblRep);
        reponseUtilisateur.add(rep);

        contenu.add(chronometre);

        contenu.add(afficheurDeSolution);
        contenu.add(Box.createVerticalStrut(30));
        contenu.add(reponseUtilisateur);
        contenu.add(Box.createVerticalStrut(30));
        contenu.add(validation);
        fenetre.setVisible(true);

        valider.addActionListener(e -> {
            int entierEntre = Integer.parseInt(rep.getText());
            if (this.entierATrouver == entierEntre){
                afficheurDeSolution.removeAll();
                fenetre.setVisible(false);
                afficheurDeSolution.add(new JLabel("Bravo !"));
                fenetre.setVisible(true);
                state = false;
            }
            else if (entierEntre > this.entierATrouver)
            {
                afficheurDeSolution.removeAll();
                fenetre.setVisible(false);
                afficheurDeSolution.add(new JLabel("Votre nombre est trop grand !"));
                fenetre.setVisible(true);
            }
            else if (entierEntre < this.entierATrouver)
            {
                afficheurDeSolution.removeAll();
                fenetre.setVisible(false);
                afficheurDeSolution.add(new JLabel("Votre nombre est trop petit !"));
                fenetre.setVisible(true);
            }
        });
        this.StartChrono();

    }

    public static void main(String[] args) {
        new FenetreEx4();
    }


}
