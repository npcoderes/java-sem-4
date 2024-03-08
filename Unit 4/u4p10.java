import java.applet.Applet;
import java.awt.Graphics;
/*<applet code=u4p10.class width=500 height=500>
</applet> */
public class u4p10 extends Applet{
    public void paint(Graphics g)
    {
        g.drawRect(20, 20, 200, 100);
        g.drawLine(20, 40, 220, 40);
        g.drawLine(20, 60, 220, 60);
        g.drawLine(20, 80, 220, 80);
        g.drawLine(20, 100, 220, 100);
    }
}
