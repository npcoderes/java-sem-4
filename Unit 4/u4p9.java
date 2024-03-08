import java.applet.Applet;
import java.awt.Graphics;
/*<applet code=u4p9.class width=500 height=500>
</applet> */

public class u4p9 extends Applet {
    public void paint(Graphics g)
    {
        g.drawOval(50, 50, 100, 100);
        // g.drawLine(100,50,100,150);
        g.drawLine(50,100,150,100);
        g.drawLine(65,65,135,135);
        g.drawLine(135,65,65,135);
    }
    
}
