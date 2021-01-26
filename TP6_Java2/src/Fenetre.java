import javax.swing.*;
public class Fenetre{
    private Fenetre() {
        JFrame f = new JFrame("Ma Fenêtre");
        JLabel label = new JLabel("Bonjour");
        JPanel p = (JPanel)f.getContentPane();
        p.add(label);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main (String[] args)
    {
        Fenetre f = new Fenetre();
    }
}
