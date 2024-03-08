import java.applet.Applet;
import java.awt.*;
// <applet code=u4p6.class width=500 height=500></applet> 

public class u4p6 extends Applet {
    public void paint(Graphics g)
    {
             g.drawOval(20, 20, 100, 30);
             g.drawLine(20, 33, 65, 130);
             g.drawLine(120, 33, 65, 130);

             g.drawString("1).Cone",30,140);

             g.drawOval(50, 200, 100, 30);
           
}
