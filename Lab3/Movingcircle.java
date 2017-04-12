import java.awt.*;
import java.awt.event.*;

import java.applet.*;
/*
<applet code="Movingcircle" width=300 height=100>
</applet>
*/

public class Movingcircle extends Applet implements ActionListener
{
int x,y;
String s="";
Button up,down,left,right;
public void init()
{
 x=400;
 y=550;
 up= new Button("UP");
 down= new Button("Down");
 left= new Button("Left");
 
 right= new Button("Right");
  add(up);
 add(down);
 add(left);
 
 add(right);

 up.addActionListener(this);
 down.addActionListener(this);
 left.addActionListener(this);
 
 right.addActionListener(this);
 }

public void actionPerformed(ActionEvent ae)
{
s=ae.getActionCommand();
if (s.equals("UP"))
{
y-=10;
if(y==0)
{
	y+=10;
}
repaint();
}
if (s.equals("Down"))
{
y+=10;
if(y==850)
{
	y-=10;
}
repaint();
}
if (s.equals("Left"))
{
x-=10;
if(x==0)
{
	x+=10;
}
repaint();
}
if (s.equals("Right"))
{
x+=10;
if(x==1200)
{
	x-=10;
}
repaint();
}
}

public void paint(Graphics g)
{
	g.setColor(Color.BLUE);
g.fillOval(x,y,50,50);
}
}