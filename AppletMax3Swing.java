import javax.swing.*;
import java.awt.*;

public class AppletMax3Swing extends JFrame {
    public AppletMax3Swing() {
        int a = 10, b = 20, c = 30;
        int max = Math.max(a, Math.max(b, c));

        setTitle("Max of Three Numbers");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.setFont(new Font("Courier", Font.BOLD, 20));
                g.drawString("First Num is " + a, 100, 100);
                g.drawString("Second Num is " + b, 100, 150);
                g.drawString("Third Num is " + c, 100, 200);
                g.drawString("Max of Three Numbers is " + max, 100, 250);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppletMax3Swing().setVisible(true));
    }
}