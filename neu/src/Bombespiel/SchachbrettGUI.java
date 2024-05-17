package Bombespiel;

import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchachbrettGUI extends JFrame {

    public SchachbrettGUI() {
        LinkedList<Piece> ps = new LinkedList<>(); // Import fehlt, daher hinzugefügt
        this.setBounds(10, 10, 512, 512);
        this.setUndecorated(false); // Setze den Rahmen des Fensters

        JPanel pn = new JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g); // Wichtig, um sicherzustellen, dass das Panel korrekt gezeichnet wird
                JLabel label = new JLabel("Hello World.");
                add(label);
                boolean white;
                for (int y = 0; y < 8; y++) {
                    white = (y % 2 == 0);  // Beginne jede zweite Zeile mit weiß
                    for (int x = 0; x < 8; x++) {
                        if (white) {
                            g.setColor(Color.WHITE);
                        } else {
                            g.setColor(Color.WHITE.darker());
                        }
                        g.fillRect(x * 64, y * 64, 64, 64);
                        white = !white;
                    }
                }
            }
        };

        // Füge das Panel zum Frame hinzu
        this.add(pn);

        // Setze das Schließen-Verhalten des Frames
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SchachbrettGUI();
    }
}
