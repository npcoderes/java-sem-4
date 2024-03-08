import java.applet.Applet;
import java.awt.Graphics;
/*<applet code=u4p7.class width=500 height=500>
  
    <param name="no1" value="10" >
    <param name="no2" value="20" >

</applet> */

public class u4p7 extends Applet {
    public void paint(Graphics g)
    {
        int no1=Integer.parseInt(getParameter("no1"));
        int no2=Integer.parseInt(getParameter("no2"));

        int sum=no1+no2;
        float avg=sum/2;

        g.drawString("Sum of two no is "+sum, 20, 20);
        g.drawString("Avg of two no is "+avg, 20, 60);

    }
    
}
