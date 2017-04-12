import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Enterex" width=300 height=100>
</applet>
*/

public class Enterex extends Applet implements MouseListener ,MouseMotionListener
{
int i;
public void init()
{
i=12;
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me)
{
}
public void mouseEntered(MouseEvent me) {
i=28;
setBackground(Color.GREEN);
repaint();
}
// Handle mouse exited.
public void mouseExited(MouseEvent me) {
i=12;
setBackground(Color.YELLOW);
repaint();
}
public void mousePressed(MouseEvent me)
{
}

public void  mouseReleased(MouseEvent me)
{
}

public void mouseDragged(MouseEvent me)
{

}

public void mouseMoved(MouseEvent me)
{

}

public void paint(Graphics g)
{
g.setFont(new Font("TimesRoman",Font.BOLD,i));
g.drawString("Good Morning",100,100);
}

}