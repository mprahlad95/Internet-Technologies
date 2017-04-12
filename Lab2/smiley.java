import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class smiley extends Applet{

	public void paint(Graphics g)
	{
      g.drawOval(100,100,100,100);
      g.fillOval(120,125,20,20);
      g.fillOval(160,125,20,20);
      g.drawLine(150,165,150,150);
      g.drawLine(130,170,170,170);
     // g.drawArc(130, 170, 1, 100, 170, 280);
    }

	}


