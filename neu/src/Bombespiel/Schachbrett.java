package Bombespiel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Schachbrett {
    public static void main(String[] args) {
    	LinkedList<Piece> ps=new LinkedList<> ();
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);
        JPanel pn = new JPanel() {
            public void paint(java.awt.Graphics g) {
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
        frame.add(pn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}