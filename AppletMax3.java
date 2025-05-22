import java.awt.*;
import java.applet.*;

public class AppletMax3 extends Applet {
    int a, b, c, d;

    public void start() {
        try {
            a = Integer.parseInt(getParameter("a"));
            b = Integer.parseInt(getParameter("b"));
            c = Integer.parseInt(getParameter("c"));
        } catch (NumberFormatException e) {
            a = b = c = 0;
        }
    }

    public void paint(Graphics g) {
        d = (a >= b && a >= c) ? a : (b >= c ? b : c);

        g.setColor(Color.BLUE);
        Font myFont = new Font("Courier", Font.BOLD, 20);
        g.setFont(myFont);

        g.drawString("First Num is " + a, 100, 100);
        g.drawString("Second Num is " + b, 100, 150);
        g.drawString("Third Num is " + c, 100, 200);
        g.drawString("Max of Three Numbers is " + d, 100, 250);
    }
}
