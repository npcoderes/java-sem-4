import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/*<applet code=u4p8.class width=500 height=500>
  <param name="radius" value="100" >


</applet> */
public class u4p8 extends Applet{
    public void paint(Graphics g)
    {
        Dimension d=getSize();
        int x=d.width/2;
        int y=d.height/2;
        int r=Integer.parseInt(getParameter("radius"));
        g.setColor(Color.blue);
        g.fillOval(x-r, y-r, r,r);
    }
}
