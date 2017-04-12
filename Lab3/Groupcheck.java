import java.awt.*;
import java.awt.event.*;

import java.applet.*;
/*
<applet code="Groupcheck" width=300 height=100>
</applet>
*/

public class Groupcheck extends Applet implements ItemListener
{
Checkbox pandu,andmol,chuchu,ramu;
CheckboxGroup cbk;
String str="", name[]={"Prahlad","Anmol","Karthick","Rishab"}, telephone[]={1234+"",8861+"",9436+"",9961+""},msg1="",msg2="";
public void init()
{
 cbk=new CheckboxGroup();
 pandu=new Checkbox("Pandu", cbk,false);
 andmol=new Checkbox("Andmol", cbk,false);
 chuchu=new Checkbox("ChuChu", cbk,false);
 ramu=new Checkbox("Ramu", cbk,false);
 add(pandu);
 add(andmol);
 add(chuchu);
 add(ramu);
 pandu.addItemListener(this);
 andmol.addItemListener(this);
 chuchu.addItemListener(this);
 ramu.addItemListener(this);
}

public void itemStateChanged(ItemEvent ie)
{
str=cbk.getSelectedCheckbox().getLabel();
if(str.equals("Pandu"))
{
msg1=name[0];
msg2=telephone[0];
}
if(str.equals("Andmol"))
{
msg1=name[1];
msg2=telephone[1];
}
if(str.equals("Chuchu"))
{
msg1=name[2];
msg2=telephone[2];
}
if(str.equals("Ramu"))
{
msg1=name[3];
msg2=telephone[3];
}

repaint();
}

public void paint(Graphics g)
{
g.setFont(new Font("TimesRoman",Font.BOLD,26));
g.drawString("Telphone Number",100,100);
g.drawString("Name:"+msg1,75,130);
g.drawString("Telphone Number:"+msg2,75,160);
}
}