import java.applet.*;
import java.awt.*;

// <applet code=u4p5.class width=500 height=500></applet> 
public class u4p5 extends Applet {
    public void init()
    {
        System.out.println("u4p5");
    }
    public void paint(Graphics g)
    { 
       g.drawLine(20, 20,200, 20);
       g.drawString("Line", 20, 40);
       g.drawRect(80, 80, 200, 150);
       g.drawString("Rectangle", 80, 245);

       g.fillOval(200, 250, 100, 100);
       g.drawString("Oval", 225, 370);
    }

    
}
