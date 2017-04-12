import java.awt.*;
import java.awt.event.*;

import java.applet.*;
/*
<applet code="Backcolor" width=300 height=100>
</applet>
*/

public class Backcolor extends Applet implements ActionListener
{
TextField a,b,c;
int r,g,bl;
String valr,valg,valb;
Button change;
public void init()
{
 change=new Button("CHANGE");
 a=new TextField("Enter Red Value Here", 3);
 b=new TextField("Enter Green Value Here", 3);
 c=new TextField("Enter Blue Value Here", 3);
 add(a);
 add(b);
 add(c);
 add(change);
 a.addActionListener(this);
 b.addActionListener(this);
 c.addActionListener(this);
 change.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
valr=a.getText();
r=Integer.parseInt(valr);
valg=b.getText();
g=Integer.parseInt(valg);
valb=c.getText();
bl=Integer.parseInt(valb);
setBackground(new Color(r,g,bl));
}

public void paint(Graphics g)
{

}
}