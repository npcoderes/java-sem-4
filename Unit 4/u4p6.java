import java.applet.Applet;
import java.awt.*;
// <applet code=u4p6.class width=500 height=500></applet> 

public class u4p6 extends Applet {
    public void paint(Graphics g)
    {
             g.drawOval(20, 130, 100, 30);
            g.drawLine(70,20,20,145);
            g.drawLine(70,20,120,145);

             g.drawString("1).Cone",20,180);

             g.drawOval(50, 200, 100, 30);
             g.drawLine(50, 220, 50, 350);
             g.drawLine(150, 220, 150, 350);
             g.drawOval(50, 335, 100, 30);
             g.drawString("2).Cylinder",50,380);

             g.drawRect(230, 20, 150, 150);
             g.drawRect(250, 40, 150, 150);
             g.drawLine(230, 20, 250, 40);
             g.drawLine(380, 20, 400, 40);
             g.drawLine(230, 170, 250, 190);
             g.drawLine(380, 170, 400, 190);

             g.drawString("3).Cube",250,220);

    }
           
}
