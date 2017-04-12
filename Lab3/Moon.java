import java.awt.*;
import java.applet.*;

/*
<applet code="Moon" width=300 height=100>
</applet>
*/

public class Moon extends Applet implements Runnable 
{
int x,x2,i,q,w;
Thread t;
public void init()
{
x=400;		
setBackground(Color.BLACK);
t=new Thread(this,"child");
t.start();
}

public void run()
{
while(true)
{
try{
for(q=0;q<200;q+=7)
{
repaint();
t.sleep(250);
}
for(w=0;w<200;w+=7)
{
repaint();
t.sleep(250);
}
q=0;
w=0;
repaint();
} catch (InterruptedException e)
{

}
}
}
public void paint(Graphics g)
{
g.setColor(Color.WHITE);
g.fillArc(400,200,400,400,90,180);
g.setColor(Color.DARK_GRAY);
g.fillArc(400+q,200,400-(2*q),400,90,180);

g.fillArc(400,200,400,400,90,-180);

g.setColor(Color.WHITE);
g.fillArc(600-w,200,0+(2*w),400,90,-180);
}

}